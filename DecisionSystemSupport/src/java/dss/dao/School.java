/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.dao;

import dss.model.EntranceContestResultModel;
import dss.model.SchoolJudgmentModel;
import java.sql.SQLException;

/**
 *
 * @author Duc Canh HNA
 */
public class School {

    private int schoolID;
    private String schoolName;
    private int schoolFee;

    public School(int schoolID, String schoolName, int schoolFee) {
        this.schoolID = schoolID;
        this.schoolName = schoolName;
        this.schoolFee = schoolFee;
    }
    
    // Chuan hoa kha nang chi tra hoc phi
    public double getStandardFeeScore(int affordableFee) {
        int sub = affordableFee - getSchoolFee();
        if (sub > 0) {
            return ((double) sub) / ((double) affordableFee);
        }
        return 0;
    }
    
    // Chuan hoa diem danh gia truong
    public double getStandardSchoolScore(int schoolID, int contestantID) throws SQLException {
        SchoolJudgmentModel sjm = new SchoolJudgmentModel();
        return ((double) sjm.getSchoolScore(contestantID, schoolID)) / ((double) sjm.getMaxSchoolScore(contestantID));
    }
    
    // Chuan hoa do uy tin
    public double getStandardPrestigeScore(int schoolID, int fieldID) throws SQLException{
        EntranceContestResultModel ecrm = new EntranceContestResultModel();
        return ecrm.getEntranceScoreMean(schoolID, fieldID) / ecrm.getMaxEntranceScoreMean(fieldID);
    }

    public int getSchoolID() {
        return schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getSchoolFee() {
        return schoolFee;
    }

    @Override
    public String toString() {
        return schoolName;
    }
}

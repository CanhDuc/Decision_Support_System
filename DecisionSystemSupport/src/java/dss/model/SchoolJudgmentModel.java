/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.model;

import dss.dao.SchoolJudgment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Duc Canh HNA
 */
public class SchoolJudgmentModel extends JDBC_Connect {

    public int getSchoolNumber(int schoolID, int contestantID) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("SELECT COUNT(schoolID) FROM SchoolJudgment WHERE schoolID = " + schoolID + " and contestantID = " + contestantID);
        ResultSet result = ps.executeQuery();
        result.next();
        return result.getInt(1);
    }

    public ArrayList<SchoolJudgment> getSchoolScore(int contestantID) throws SQLException {
        ArrayList<SchoolJudgment> schooljudgmentList = new ArrayList<>();
        PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM SchoolJudgment JOIN School ON SchoolJudgment.schoolID = School.schoolID WHERE SchoolJudgment.contestantID = " + contestantID);
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            schooljudgmentList.add(new SchoolJudgment(result.getInt("schoolID"), result.getInt("contestantID"), result.getInt("score"), result.getString("schoolName")));
        }
        closeConnection();
        return schooljudgmentList;
    }

    public int getSchoolScore(int schoolID, int contestantID) throws SQLException {
        int schoolNumber = getSchoolNumber(schoolID, contestantID);
        if (schoolNumber != 0) {
            PreparedStatement ps = getConnection().prepareStatement("SELECT score FROM SchoolJudgment WHERE schoolID = " + schoolID + " and contestantID = " + contestantID);
            ResultSet result = ps.executeQuery();
            result.next();
            return result.getInt(1);
        }
        return 1;
    }

    // Lay ra diem danh gia cao nhat trong cac truong
    public int getMaxSchoolScore(int contestantID) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("SELECT schoolID FROM SchoolJudgment WHERE contestantID = " + contestantID);
        ResultSet result = ps.executeQuery();
        int max = 1;
        while (result.next()) {
            if (getSchoolScore(result.getInt(1), contestantID) > max) {
                max = getSchoolScore(result.getInt(1), contestantID);
            }
        }
        closeConnection();
        return max;
    }

    public boolean updateSchoolScore(int schoolID, int contestantID, int score) throws SQLException {
        boolean flag;
        int schoolNumber = getSchoolNumber(schoolID, contestantID);
        PreparedStatement ps;
        if (schoolNumber != 0) {
            ps = getConnection().prepareStatement("UPDATE SchoolJudgment SET score = " + score + " WHERE schoolID = " + schoolID + " and contestantID = " + contestantID);
            flag = ps.execute();
        } else {
            ps = getConnection().prepareStatement("INSERT INTO SchoolJudgment(schoolID, contestantID, score) VALUES(" + schoolID + ", " + contestantID + ", " + score + ")");
            flag = ps.execute();
        }
        return flag;
    }

}

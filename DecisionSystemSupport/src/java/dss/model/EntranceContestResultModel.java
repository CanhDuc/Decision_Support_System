/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.model;

import dss.dao.EntranceContestResult;
import dss.dao.School;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Duc Canh HNA
 */
public class EntranceContestResultModel extends JDBC_Connect {

    public ArrayList<EntranceContestResult> getEntranceResultInfo(int schoolID, int fieldID) throws SQLException {
        ArrayList<EntranceContestResult> resultList = new ArrayList<>();
        PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM EntranceContestResult WHERE schoolID = " + schoolID + " and fieldID = " + fieldID);
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            resultList.add(new EntranceContestResult(result.getInt("schoolID"),
                    result.getInt("fieldID"),
                    result.getInt("year"),
                    result.getDouble("entranceScore"),
                    result.getInt("registerNumber"),
                    result.getInt("successNumber")));
        }

        return resultList;
    }

    // Tinh trung binh ti le choi 1 nganh qua cac nam
    public double getSuccessPortionMean(int schoolID, int fieldID) throws SQLException {
        ArrayList<EntranceContestResult> resultList = getEntranceResultInfo(schoolID, fieldID);
        double sum = 0;
        for (EntranceContestResult result : resultList) {
            sum += ((double) result.getSuccessNumber()) / ((double) result.getRegisterNumber());
        }

        return sum / resultList.size();
    }

    // Tinh phuong sai
    public double getSuccessPortionStandardVariance(int schoolID, int fieldID) throws SQLException {
        double mean = getSuccessPortionMean(schoolID, fieldID);
        double sum = 0;
        ArrayList<EntranceContestResult> resultList = getEntranceResultInfo(schoolID, fieldID);
        for (EntranceContestResult result : resultList) {
            sum += Math.pow(mean - ((double) result.getSuccessNumber()) / ((double) result.getRegisterNumber()), 2);
        }

        return sum / (resultList.size() - 1);
    }

    // Tinh diem trung binh diem chuan 1 nganh cua truong qua cac nam
    public double getEntranceScoreMean(int schoolID, int fieldID) throws SQLException {
        ArrayList<EntranceContestResult> resultList = getEntranceResultInfo(schoolID, fieldID);
        double sum = 0;
        for (EntranceContestResult result : resultList) {
            sum += result.getEntranceScore();
        }

        return sum / resultList.size();
    }

    // Chon ra diem chuan trung binh cao nhat cua nganh AAA trong tat ca cac truong 
    public double getMaxEntranceScoreMean(int fieldID) throws SQLException {
        SchoolModel sm = new SchoolModel();
        ArrayList<School> schoolList = sm.getSchoolInfo(fieldID);
        double max = 1;
        for (School school : schoolList) {
            if (getEntranceScoreMean(school.getSchoolID(), fieldID) > max) {
                max = getEntranceScoreMean(school.getSchoolID(), fieldID);
            }
        }
        return max;
    }
}

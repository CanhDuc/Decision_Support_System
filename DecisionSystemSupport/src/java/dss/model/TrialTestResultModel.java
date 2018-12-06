/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.model;

import dss.dao.TrialTestResult;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Duc Canh HNA
 */
public class TrialTestResultModel extends JDBC_Connect {

    int count1, count2;

    public ArrayList<TrialTestResult> getTrialTestInfo(int contestantID) throws SQLException {
        ArrayList<TrialTestResult> trialTestList = new ArrayList<>();
        PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM TrialTest WHERE contestantID = " + contestantID);
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            trialTestList.add(new TrialTestResult(result.getInt("trialTestID"), result.getInt("contestantID"), result.getInt("rank"), result.getInt("competitorNumber")));
        }
        closeConnection();
        return trialTestList;
    }

    public boolean addTrialResult(int contestantID, int rank, int competitorNumber) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("INSERT INTO TrialTest(contestantID, rank, competitorNumber) VALUES(" + contestantID + ", " + rank + ", " + competitorNumber + ")");
        count1 = ps.executeUpdate();
        closeConnection();
        if (count1 > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateTrialResult(TrialTestResult trialTest) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("UPDATE TrialTest SET rank = " + trialTest.getRank() + ", "
                + "competitorNumber = " + trialTest.getCompetitorNumber() + "where contestantID = " + trialTest.getContestantID());

        ps.executeUpdate();
        count1 = ps.executeUpdate();
        closeConnection();
        if (count1 > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteTrialResult(int contestantID) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("DELETE FROM TrialTest WHERE contestantID = " + contestantID);
        ps.executeUpdate();
        count1 = ps.executeUpdate();
        closeConnection();
        if (count1 > 0) {
            return true;
        } else {
            return false;
        }
    }

    public double getMean(int contestantID) throws SQLException {
        ArrayList<TrialTestResult> resultList = getTrialTestInfo(contestantID);
        double sum = 0;
        for (TrialTestResult result : resultList) {
            sum += ((double) result.getRank()) / ((double) result.getCompetitorNumber());
        }
        
        return sum / resultList.size();
    }
    
    public double getStandardVariance(int contestantID) throws SQLException{
        ArrayList<TrialTestResult> resultList = getTrialTestInfo(contestantID);
        double mean = getMean(contestantID);
        double sum = 0;
        for(TrialTestResult result : resultList){
            sum += Math.pow(mean - ((double) result.getRank()) / ((double) result.getCompetitorNumber()), 2);
        }
        
        return sum / (resultList.size() - 1);
    }
}

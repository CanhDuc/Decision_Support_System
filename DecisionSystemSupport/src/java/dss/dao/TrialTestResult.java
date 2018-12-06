/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.dao;
/**
 *
 * @author Duc Canh HNA
 */
public class TrialTestResult {

    private int trialTestID;
    private int contestantID;
    private int rank;
    private int competitorNumber;

    public TrialTestResult(int trialTestID, int contestantID, int rank, int competitorNumber) {
        this.trialTestID = trialTestID;
        this.contestantID = contestantID;
        this.rank = rank;
        this.competitorNumber = competitorNumber;
    }

    public int getTrialTestID() {
        return trialTestID;
    }

    public int getContestantID() {
        return contestantID;
    }

    public int getRank() {
        return rank;
    }

    public int getCompetitorNumber() {
        return competitorNumber;
    }

//    public static double getMean(int contestantID, MysqlCon connection) throws SQLException {
//        ArrayList<TrialTestResult> resultList = connection.getTrialTestInfo(contestantID);
//        double sum = 0;
//        for (TrialTestResult result : resultList) {
//            sum += ((double) result.getRank()) / ((double) result.getCompetitorNumber());
//        }
//
//        return sum / resultList.size();
//    }
//
//    public static double getStandardVariance(int contestantID, MysqlCon connection) throws SQLException {
//        ArrayList<TrialTestResult> resultList = connection.getTrialTestInfo(contestantID);
//        double mean = TrialTestResult.getMean(contestantID, connection);
//        double sum = 0;
//        for (TrialTestResult result : resultList) {
//            sum += Math.pow(mean - ((double) result.getRank()) / ((double) result.getCompetitorNumber()), 2);
//        }
//
//        return sum / (resultList.size() - 1);
//    }
}

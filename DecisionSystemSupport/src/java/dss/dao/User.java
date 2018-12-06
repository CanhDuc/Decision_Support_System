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
public class User {

    private int contestantID;
    private String contestantName;
    private String userName;
    private String password;
    private int affordableFee;
    private int successAbilityScore;
    private int schoolScore;
    private int feeScore;
    private int prestigeScore;
    private int level;

    public User(int contestantID, String contestantName, String userName, int affordableFee, int successAbilityScore, int schoolScore, int feeScore, int prestigeScore) {
        this.contestantID = contestantID;
        this.contestantName = contestantName;
        this.userName = userName;
        this.affordableFee = affordableFee;
        this.successAbilityScore = successAbilityScore;
        this.schoolScore = schoolScore;
        this.feeScore = feeScore;
        this.prestigeScore = prestigeScore;
    }

    public User(int contestantID, String contestantName, String userName, String password, int affordableFee, int successAbilityScore, int schoolScore, int feeScore, int prestigeScore, int level) {
        this.contestantID = contestantID;
        this.contestantName = contestantName;
        this.userName = userName;
        this.password = password;
        this.affordableFee = affordableFee;
        this.successAbilityScore = successAbilityScore;
        this.schoolScore = schoolScore;
        this.feeScore = feeScore;
        this.prestigeScore = prestigeScore;
        this.level = level;
    }

    public void setContestantName(String contestantName) {
        this.contestantName = contestantName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAffordableFee(int affordableFee) {
        this.affordableFee = affordableFee;
    }

    public void setSuccessAbilityScore(int successAbilityScore) {
        this.successAbilityScore = successAbilityScore;
    }

    public void setSchoolScore(int schoolScore) {
        this.schoolScore = schoolScore;
    }

    public void setFeeScore(int feeScore) {
        this.feeScore = feeScore;
    }

    public void setPrestigeScore(int prestigeScore) {
        this.prestigeScore = prestigeScore;
    }

    public int getContestantID() {
        return contestantID;
    }

    public String getContestantName() {
        return contestantName;
    }

    public String getUserName() {
        return userName;
    }

    public int getAffordableFee() {
        return affordableFee;
    }

    public int getSuccessAbilityScore() {
        return successAbilityScore;
    }

    public int getSchoolScore() {
        return schoolScore;
    }

    public int getFeeScore() {
        return feeScore;
    }

    public int getPrestigeScore() {
        return prestigeScore;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

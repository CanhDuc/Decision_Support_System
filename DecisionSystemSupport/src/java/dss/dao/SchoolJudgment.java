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
public class SchoolJudgment {
    private int schoolID;
    private int contestantID;
    private int score;
    private String schoolName;

    public SchoolJudgment(int schoolID, int contestantID, int score) {
        this.schoolID = schoolID;
        this.contestantID = contestantID;
        this.score = score;
    }

    public SchoolJudgment(int schoolID, int contestantID, int score, String schoolName) {
        this.schoolID = schoolID;
        this.contestantID = contestantID;
        this.score = score;
        this.schoolName = schoolName;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getContestantID() {
        return contestantID;
    }

    public void setContestantID(int contestantID) {
        this.contestantID = contestantID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    
}

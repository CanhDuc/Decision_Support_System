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
public class EntranceContestResult {
    private int schoolID;
    private int fieldID;
    private int year;
    private double entranceScore;
    private int registerNumber;
    private int successNumber;

    public EntranceContestResult(int schoolID, int fieldID, int year, double entranceScore, int registerNumber, int successNumber) {
        this.schoolID = schoolID;
        this.fieldID = fieldID;
        this.year = year;
        this.entranceScore = entranceScore;
        this.registerNumber = registerNumber;
        this.successNumber = successNumber;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getFieldID() {
        return fieldID;
    }

    public void setFieldID(int fieldID) {
        this.fieldID = fieldID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEntranceScore() {
        return entranceScore;
    }

    public void setEntranceScore(double entranceScore) {
        this.entranceScore = entranceScore;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public int getSuccessNumber() {
        return successNumber;
    }

    public void setSuccessNumber(int successNumber) {
        this.successNumber = successNumber;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.dao;

import java.sql.SQLException;

/**
 *
 * @author Duc Canh HNA
 */
public class Option {

    private User user;
    private School school;
    private Field field;

    public Option(User user, School school, Field field) {
        this.user = user;
        this.school = school;
        this.field = field;
    }

    public int scoreSum() {
        return user.getFeeScore() + user.getPrestigeScore() + user.getSchoolScore() + user.getSuccessAbilityScore();
    }

    // Tinh gia tri theo cac trong so : kha nang chi tra hoc phi
    public double getFeeEffect() {
        return ((double) user.getFeeScore()) / scoreSum() * school.getStandardFeeScore(user.getAffordableFee());
    }
    
    // Tinh gia tri theo cac trong so diem danh gia truong
    public double getSchoolEffect() throws SQLException{
        return ((double)user.getSchoolScore()) / scoreSum() * school.getStandardSchoolScore(school.getSchoolID(), user.getContestantID());
    }
    
    // Tinh gia tri theo cac trong so
    public double getPrestigeEffect() throws SQLException{
        return ((double)user.getPrestigeScore()) / scoreSum() * school.getStandardPrestigeScore(school.getSchoolID() ,field.getFieldID());
    }
   
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

}

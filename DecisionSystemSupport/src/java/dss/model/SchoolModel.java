/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.model;

import dss.dao.School;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Duc Canh HNA
 */
public class SchoolModel extends JDBC_Connect {

    int count;

    public ArrayList<School> getSchoolInfo() throws SQLException {
        ArrayList<School> schoolList = new ArrayList<>();
        PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM School");
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            schoolList.add(new School(result.getInt("schoolID"), result.getString("schoolName"), result.getInt("fee")));
        }
        closeConnection();
        return schoolList;
    }

    public ArrayList<School> getSchoolInfo(int fieldID) throws SQLException {
        ArrayList<School> schoolList = new ArrayList<>();
        PreparedStatement ps = getConnection().prepareStatement("SELECT DISTINCT School.* "
                + "FROM School, EntranceContestResult, Field "
                + "WHERE School.schoolID = EntranceContestResult.schoolID and Field.fieldID = EntranceContestResult.fieldID "
                + "and Field.fieldID = " + fieldID);
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            schoolList.add(new School(result.getInt("schoolID"), result.getString("schoolName"), result.getInt("fee")));
        }

        return schoolList;
    }
    
    public boolean addSchoolInfo(String schoolName, int fee) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("INSERT INTO School(schoolName, fee) VALUES(?,?)");
        ps.setString(1, schoolName);
        ps.setInt(2, fee);
        count = ps.executeUpdate();
        closeConnection();
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.model;

import dss.dao.Field;
import dss.dao.School;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Duc Canh HNA
 */
public class FieldModel extends JDBC_Connect {

    int count;

    public ArrayList<Field> getFieldInfo() throws SQLException {
        ArrayList<Field> fieldlList = new ArrayList<>();
        PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM Field");
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            fieldlList.add(new Field(result.getInt("fieldID"), result.getString("fieldName")));
        }
        closeConnection();
        return fieldlList;
    }

    public boolean addFieldInfo(String fieldName) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("INSERT INTO Field(fieldName) VALUES(?)");
        ps.setString(1, fieldName);
        count = ps.executeUpdate();
        closeConnection();
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}

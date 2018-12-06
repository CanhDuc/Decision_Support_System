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
public class Field {

    private int fieldID;
    private String fieldName;

    public Field(int fieldID, String fieldName) {
        this.fieldID = fieldID;
        this.fieldName = fieldName;
    }

    public int getFieldID() {
        return fieldID;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String toString() {
        return fieldName;
    }
}

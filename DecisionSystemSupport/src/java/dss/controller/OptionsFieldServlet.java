/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.controller;

import dss.model.SchoolModel;
import dss.dao.School;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Duc Canh HNA
 */
public class OptionsFieldServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int field = Integer.valueOf(request.getParameter("field"));
        try {
            SchoolModel sm = new SchoolModel();
            ArrayList<School> schoolList = sm.getSchoolInfo(field);
            request.setAttribute("schoolList", schoolList);
            RequestDispatcher rd = request.getRequestDispatcher("school_judgement.jsp");
            rd.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}

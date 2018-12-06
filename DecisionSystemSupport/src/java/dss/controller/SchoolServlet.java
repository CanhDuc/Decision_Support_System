/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.controller;

import dss.model.SchoolModel;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Duc Canh HNA
 */
public class SchoolServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String schoolName = (String) request.getParameter("schoolName");
        int fee = Integer.valueOf(request.getParameter("fee"));
        try {
            SchoolModel sm = new SchoolModel();
            boolean flag = sm.addSchoolInfo(schoolName, fee);
            if (flag) {
                request.setAttribute("done", "Yes");
                RequestDispatcher rd = request.getRequestDispatcher("school.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("done", "No");
                RequestDispatcher rd = request.getRequestDispatcher("school.jsp");
                rd.forward(request, response);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}

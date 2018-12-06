/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.controller;

import dss.model.SchoolJudgmentModel;
import dss.model.SchoolModel;
import dss.dao.School;
import dss.dao.SchoolJudgment;
import dss.dao.User;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Duc Canh HNA
 */
public class SchoolJudgmentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        User user = (User) request.getSession().getAttribute("userDetails");
        if (user == null) {
            response.sendRedirect("login.jsp");
        } else {
            SchoolJudgmentModel sjm = new SchoolJudgmentModel();
            int contestantID = user.getContestantID();

            if (request.getParameter("save")!= null) {
                try {
                    int schoolID = Integer.valueOf(request.getParameter("school"));
                    int score = Integer.valueOf(request.getParameter("score"));

                    if (sjm.updateSchoolScore(schoolID, contestantID, score)) {
                        request.setAttribute("done", "Yes");
                        RequestDispatcher rd = request.getRequestDispatcher("field_options.jsp");
                        rd.forward(request, response);
                    } else {
                        request.setAttribute("done", "No");
                        RequestDispatcher rd = request.getRequestDispatcher("field_options.jsp");
                        rd.forward(request, response);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(OptionsFieldServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (request.getParameter("next")!= null) {
                try {
                    ArrayList<SchoolJudgment> schooljudgmentList = new ArrayList<SchoolJudgment>();
                    schooljudgmentList = sjm.getSchoolScore(contestantID);
                    request.setAttribute("schooljudgmentList", schooljudgmentList);
                    RequestDispatcher rd = request.getRequestDispatcher("school_judgement_table.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(SchoolJudgmentServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}

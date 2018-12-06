/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.controller;

import dss.model.DatabaseOperations;
import dss.dao.User;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Duc Canh HNA
 */
public class FactorJudgementServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        User user = (User) request.getSession().getAttribute("userDetails");
        int successAbilityScore = Integer.valueOf(request.getParameter("successAbilityScore"));
        int schoolScore = Integer.valueOf(request.getParameter("schoolScore"));
        int prestigeScore = Integer.valueOf(request.getParameter("prestigeScore"));
        int feeScore = Integer.valueOf(request.getParameter("feeScore"));
        int affordableFee = Integer.valueOf(request.getParameter("affordableFee"));
        try {
            DatabaseOperations operations = new DatabaseOperations();
            boolean flag = operations.changeUserSchoolInfo(user, affordableFee, successAbilityScore, schoolScore, feeScore, prestigeScore);
            if (flag) {
                HttpSession session = request.getSession();
                String userName = user.getUserName();
                String password = user.getPassword();
                user = operations.checkUser(userName, password);
                if (user == null) {
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                } else {
                    session.setAttribute("userDetails", user);
                    request.setAttribute("done", "Yes");
                    RequestDispatcher rd = request.getRequestDispatcher("factor_judgement.jsp");
                    rd.forward(request, response);
                }
            } else {
                request.setAttribute("done", "No");
                RequestDispatcher rd = request.getRequestDispatcher("factor_judgement.jsp");
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

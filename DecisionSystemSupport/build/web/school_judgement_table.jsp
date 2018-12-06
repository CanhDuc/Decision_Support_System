<%-- 
    Document   : create_account
    Created on : Nov 25, 2018, 3:14:49 PM
    Author     : Duc Canh HNA
--%>

<%@page import="dss.dao.SchoolJudgment"%>
<%@page import="dss.dao.School"%>
<%@page import="dss.dao.Field"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dss.model.FieldModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>School Judgment</title>
        <link rel="shortcut icon" type="image/png" href="image/favicon.png" />
        <link rel="stylesheet" type="text/css" href="css/create_account.css">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/passwordChecker.js"></script>
    </head>
    <body>
        <div class="row">
            <jsp:include page="header.jsp" />
        </div>
        <div class="container-fullwidth">
            <div class="row">
                <div class="account col-md-6 col-md-offset-3">
                    <h2 class="well text-center">Đánh giá các trường</h2>
                    <div class="col-lg-12 well">
                        <div class="row">
                            <form action="SchoolJudgmentServlet" method="post">
                                <div class="col-sm-12">
                                    <div class="row">
                                        <div class="col-sm-12 form-group">
                                            <label class="required">Chọn trường</label>

                                            <table class="table table-stripped table-bordered">
                                                <thead>
                                                    <tr>
                                                        <th>STT</th>
                                                        <th>Tên trường</th>
                                                        <th>Mức độ ưu thích</th>
                                                        <th>Thao tác</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <%
                                                        int count = 1;
                                                        ArrayList<SchoolJudgment> schooljudgmentList = (ArrayList<SchoolJudgment>) request.getAttribute("schooljudgmentList");
                                                        for (SchoolJudgment school : schooljudgmentList) {
                                                    %>
                                                    <tr>
                                                        <td scope="row"><%= count++%></td>
                                                        <td><%= school.getSchoolName()%></td>
                                                        <td><%= school.getScore()%></td>
                                                        <td>
                                                            <div class="pull-right">
                                                                <button type="button" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#myModal">
                                                                    <span class="glypicon glyphicon glyphicon-pencil"></span>
                                                                </button>
                                                                <button type="button" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#myModal">
                                                                    <span class="glypicon glyphicon glyphicon glyphicon-trash"></span>
                                                                </button>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <%
                                                        }
                                                    %>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Footer start here -->
            <div class="row" style="margin-top: 5px;">
                <jsp:include page="footer.jsp"></jsp:include>
            </div>
        </div>
    </body>
</html>
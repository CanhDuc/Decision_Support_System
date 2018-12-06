<%-- 
    Document   : create_account
    Created on : Nov 25, 2018, 3:14:49 PM
    Author     : Duc Canh HNA
--%>

<%@page import="dss.dao.School"%>
<%@page import="dss.dao.Field"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dss.model.FieldModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Factor Judgement</title>
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
                <%
                    String flag = (String) request.getAttribute("done");
                    if (flag != null && flag.equals("No")) {
                %>
                <div class="alert alert-danger" role="alert" style="margin-top: 20px;">
                    <strong>Lưu không thành công!</strong>
                </div>

                <%
                    }
                %>
                <%
                    if (flag != null && flag.equals("Yes")) {
                %>
                <div class="alert alert-danger" role="alert" style="margin-top: 20px;">
                    <strong>Lưu thành công!</strong>
                </div>

                <%
                    }
                %>
            </div>
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
                                            <div class="input-group-btn">
                                                <select class="form-control btn btn-default" name="school" required>
                                                    <%
                                                        ArrayList<School> schoolList = (ArrayList<School>) request.getAttribute("schoolList");
                                                        for (School school : schoolList) {
                                                    %>
                                                    <option  value="<%= school.getSchoolID()%>" > <%= school.getSchoolName()%> </option >
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-sm-12 form-group">
                                            <label class="required">Mức độ ưa thích</label>
                                            <div class="input-group-btn">
                                                <select class="form-control btn btn-default" name="score" required>
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                    <option value="6">6</option>
                                                    <option value="7">7</option>
                                                    <option value="8">8</option>
                                                    <option value="9">9</option>
                                                    <option value="10">10</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>

                                    <input type="submit" name="save" class="btn btn-lg btn-info" value="Lưu lại"> 
                                    </input>
                                     <input type="submit" name="next" class="btn btn-lg btn-danger" value="Bỏ qua"> 
                                    </input>
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
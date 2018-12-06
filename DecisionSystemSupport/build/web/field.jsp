<%-- 
    Document   : create_account
    Created on : Nov 25, 2018, 3:14:49 PM
    Author     : Duc Canh HNA
--%>

<%@page import="dss.dao.Field"%>
<%@page import="dss.model.FieldModel"%>
<%@page import="dss.dao.School"%>
<%@page import="dss.model.SchoolModel"%>
<%@page import="dss.dao.User"%>
<%@page import="dss.model.TrialTestResultModel"%>
<%@page import="dss.dao.TrialTestResult"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Field Infomation</title>
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
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <%
                        String flag = (String) request.getAttribute("done");
                        if (flag != null && flag.equals("No")) {
                    %>
                    <div class="alert alert-danger" role="alert" style="margin-top: 20px;">
                        <strong>Thêm không thành công!</strong>
                    </div>

                    <%
                        }
                    %>
                    <%
                        if (flag != null && flag.equals("Yes")) {
                    %>

                    <div class="alert alert-danger" role="alert" style="margin-top: 20px;">
                        <strong>Thêm thành công!</strong>
                    </div>

                    <%
                        }
                    %>

                    <h3 class="page-header">Thông tin các trường</h3>
                    <table class="table table-stripped table-bordered">
                        <thead>
                            <tr>
                                <th>STT</th>
                                <th>Tên ngành</th>
                                <th>Thay đổi</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                FieldModel fm = new FieldModel();
                                ArrayList<Field> fieldList = (ArrayList<Field>) fm.getFieldInfo();
                                int count = 1;
                                for (Field field : fieldList) {
                            %>

                            <tr>
                                <th scope="row"><%= count++%></th>
                                <td><%= field.getFieldName()%></td>
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

                    <div class="row">
                        <div class="col-md-8">
                            <nav>
                                <ul class="pagination">
                                    <li>
                                        <a href="#" aria-label="Previous">
                                            <span aria-hidden="true">«</span>
                                        </a>
                                    </li>
                                    <li><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li>
                                        <a href="#" aria-label="Next">
                                            <span aria-hidden="true">»</span>
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                        <div class="col-md-4">
                            <div class="pull-right">
                                <button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                                    <span class="glypicon glyphicon glyphicon-plus"></span>
                                    Thêm ngành
                                </button>
                            </div>
                        </div>
                    </div>

                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="false">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="row">
                                    <div class="account col-md-6 col-md-offset-3">
                                        <h3 class="well text-center">Thêm ngành</h3>
                                        <div class="col-lg-12 well">
                                            <div class="row">
                                                <form action="FieldServlet" method="post">
                                                    <div class="col-sm-12">
                                                        <div class="row">
                                                            <div class="col-sm-12 form-group">
                                                                <label class="required">Tên ngành</label> <input
                                                                    type="text" required placeholder="Enter School Name Here.."
                                                                    class="form-control" name="fieldName" id="rank" value="">
                                                            </div>                                                           
                                                        </div>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <input type="submit" class="btn btn-primary" name="actions" value="Thêm">
                                                        <input type="button" class="btn btn-danger" data-dismiss="modal" value="Đóng">
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <!-- Footer start here -->
        <div class="row">
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </div>
</body>
</html>
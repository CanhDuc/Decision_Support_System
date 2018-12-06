<%-- 
    Document   : create_account
    Created on : Nov 25, 2018, 3:14:49 PM
    Author     : Duc Canh HNA
--%>

<%@page import="dss.dao.Field"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dss.model.FieldModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Field Options</title>
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
                            <form action="OptionsFieldServlet" method="post">
                                <div class="col-sm-12">
                                    <div class="row">
                                        <div class="col-sm-12 form-group">
                                            <label class="required">Chọn ngành bạn muốn học?</label>
                                            <div class="input-group-btn">
                                                <select class="form-control btn btn-default" name="field" required>
                                                    <% FieldModel fm = new FieldModel();
                                                        ArrayList<Field> fieldList = (ArrayList<Field>) fm.getFieldInfo();
                                                        for (Field field : fieldList) {
                                                    %>
                                                    <option value="<%= field.getFieldID() %>"> <%= field.getFieldName()%> </option>
                                                    <% }%>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-sm-12">
                                    <input type="submit" class="btn btn-lg btn-info" value="Tiếp theo"> 
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
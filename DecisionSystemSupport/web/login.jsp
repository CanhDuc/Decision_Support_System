<%-- 
    Document   : login
    Created on : Nov 25, 2018, 2:03:43 PM
    Author     : Duc Canh HNA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sign In</title>
        <link rel="shortcut icon" type="image/png" href="image/favicon.png" />
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="row">
            <jsp:include page="header.jsp" />
        </div>

        <div class="container-fullwidth">
            <div class="row">
                <div class="jumbotron col-md-6 col-md-offset-3"
                     style="margin-top: 50px">
                    <div class="row">
                        <div class="col-md-6 col-md-offset-2">
                            <form method="post" action="LoginServlet">
                                <div class="form-group">
                                    <label for="account_number">Tài khoản</label> <input type="text"
                                                                               name="userName" required class="form-control" id="account_no"
                                                                               placeholder="Ex : Đỗ Đức Cảnh">
                                </div>
                                <div class="form-group">
                                    <label for="password">Mật khẩu</label> <input type="password"
                                                                                   name="password" required class="form-control" id="password"
                                                                                   placeholder="Mật khẩu">
                                </div>
                                <div class="checkbox">
                                    <label> <input name="remember" type="checkbox"
                                                   value="Remember Me">Remember Me
                                    </label>
                                </div>
                                <%
                                    String flag = (String) request.getAttribute("passCorrect");
                                    if (flag != null && flag.equals("No")) {
                                %>
                                <div class="alert alert-danger" role="alert">
                                    <strong>Tài khoản hoặc Mật khẩu không chính xác!</strong>
                                </div>
                                <%
                                    }
                                %>
                                <input type="submit" class="btn btn-primary btn-lg"
                                       value="Đăng nhập"></input>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Footer start here -->
            <div class="row" style="margin-top: 50px;">
                <jsp:include page="footer.jsp"></jsp:include>
            </div>
        </div>
    </body>
</html>

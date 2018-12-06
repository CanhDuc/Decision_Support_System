<%-- 
    Document   : create_account
    Created on : Nov 25, 2018, 3:14:49 PM
    Author     : Duc Canh HNA
--%>

<%@page import="dss.dao.User"%>
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

        <%!User user = null;%>
        <%
            user = (User) session.getAttribute("userDetails");
        %>

        <div class="container-fullwidth">
            <div class="row">
                <div class="account col-md-6 col-md-offset-3">
                    <%
                        String flag = (String) request.getAttribute("done");
                        if (flag != null && flag.equals("No")) {
                    %>
                    <div class="alert alert-danger" role="alert">
                        <strong>Cập nhật không thành công!</strong>
                    </div>
                    <%
                        }
                    %>

                    <%
                        if (flag != null && flag.equals("Yes")) {
                    %>
                    <div class="alert alert-danger" role="alert">
                        <strong>Cập nhật thành công!</strong>
                    </div>
                    <%
                        }
                    %>

                    <h2 class="well text-center">Đánh giá các yếu tố</h2>
                    <div class="col-lg-12 well">
                        <div class="row">
                            <form action="FactorJudgementServlet" method="post">
                                <div class="col-sm-12">
                                    <div class="row">
                                        <div class="col-sm-12 form-group">
                                            <label class="required">Khả năng đỗ</label>
                                            <div class="input-group-btn">
                                                <select class="form-control btn btn-default" name="successAbilityScore" required>
                                                    <% if (user.getSuccessAbilityScore() == 1) {%> 
                                                    <option value="1" selected>1</option>
                                                    <% } else { %>
                                                    <option value="1">1</option>
                                                    <% } %>

                                                    <% if (user.getSuccessAbilityScore() == 2) {%> 
                                                    <option value="2" selected>2</option>
                                                    <% } else { %>
                                                    <option value="2">2</option>
                                                    <% } %>

                                                    <% if (user.getSuccessAbilityScore() == 3) {%> 
                                                    <option value="3" selected>3</option>
                                                    <% } else { %>
                                                    <option value="3">3</option>
                                                    <% } %>

                                                    <% if (user.getSuccessAbilityScore() == 4) {%> 
                                                    <option value="4" selected>4</option>
                                                    <% } else { %>
                                                    <option value="4">4</option>
                                                    <% } %>

                                                    <% if (user.getSuccessAbilityScore() == 5) {%> 
                                                    <option value="5" selected>5</option>
                                                    <% } else { %>
                                                    <option value="5">5</option>
                                                    <% } %>

                                                    <% if (user.getSuccessAbilityScore() == 6) {%> 
                                                    <option value="6" selected>6</option>
                                                    <% } else { %>
                                                    <option value="6">6</option>
                                                    <% } %>

                                                    <% if (user.getSuccessAbilityScore() == 7) {%> 
                                                    <option value="7" selected>7</option>
                                                    <% } else { %>
                                                    <option value="7">7</option>
                                                    <% } %>

                                                    <% if (user.getSuccessAbilityScore() == 8) {%> 
                                                    <option value="8" selected>8</option>
                                                    <% } else { %>
                                                    <option value="8">8</option>
                                                    <% } %>

                                                    <% if (user.getSuccessAbilityScore() == 9) {%> 
                                                    <option value="9" selected>9</option>
                                                    <% } else { %>
                                                    <option value="9">9</option>
                                                    <% } %>

                                                    <% if (user.getSuccessAbilityScore() == 10) {%> 
                                                    <option value="10" selected>10</option>
                                                    <% } else { %>
                                                    <option value="10">10</option>
                                                    <% } %>

                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-sm-12 form-group">
                                            <label class="required">Sở thích cá nhân</label>
                                            <div class="input-group-btn">
                                                <select class="form-control btn btn-default" name="schoolScore" required>
                                                    <% if (user.getSchoolScore() == 1) {%> 
                                                    <option value="1" selected>1</option>
                                                    <% } else { %>
                                                    <option value="1">1</option>
                                                    <% } %>

                                                    <% if (user.getSchoolScore() == 2) {%> 
                                                    <option value="2" selected>2</option>
                                                    <% } else { %>
                                                    <option value="2">2</option>
                                                    <% } %>

                                                    <% if (user.getSchoolScore() == 3) {%> 
                                                    <option value="3" selected>3</option>
                                                    <% } else { %>
                                                    <option value="3">3</option>
                                                    <% } %>

                                                    <% if (user.getSchoolScore() == 4) {%> 
                                                    <option value="4" selected>4</option>
                                                    <% } else { %>
                                                    <option value="4">4</option>
                                                    <% } %>

                                                    <% if (user.getSchoolScore() == 5) {%> 
                                                    <option value="5" selected>5</option>
                                                    <% } else { %>
                                                    <option value="5">5</option>
                                                    <% } %>

                                                    <% if (user.getSchoolScore() == 6) {%> 
                                                    <option value="6" selected>6</option>
                                                    <% } else { %>
                                                    <option value="6">6</option>
                                                    <% } %>

                                                    <% if (user.getSchoolScore() == 7) {%> 
                                                    <option value="7" selected>7</option>
                                                    <% } else { %>
                                                    <option value="7">7</option>
                                                    <% } %>

                                                    <% if (user.getSchoolScore() == 8) {%> 
                                                    <option value="8" selected>8</option>
                                                    <% } else { %>
                                                    <option value="8">8</option>
                                                    <% } %>

                                                    <% if (user.getSchoolScore() == 9) {%> 
                                                    <option value="9" selected>9</option>
                                                    <% } else { %>
                                                    <option value="9">9</option>
                                                    <% } %>

                                                    <% if (user.getSchoolScore() == 10) {%> 
                                                    <option value="10" selected>10</option>
                                                    <% } else { %>
                                                    <option value="10">10</option>
                                                    <% } %>

                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-sm-12 form-group">
                                            <label class="required">Uy tín trường</label>
                                            <div class="input-group-btn">
                                                <select class="form-control btn btn-default" name="prestigeScore" required>
                                                    <% if (user.getPrestigeScore() == 1) {%> 
                                                    <option value="1" selected>1</option>
                                                    <% } else { %>
                                                    <option value="1">1</option>
                                                    <% } %>

                                                    <% if (user.getPrestigeScore() == 2) {%> 
                                                    <option value="2" selected>2</option>
                                                    <% } else { %>
                                                    <option value="2">2</option>
                                                    <% } %>

                                                    <% if (user.getPrestigeScore() == 3) {%> 
                                                    <option value="3" selected>3</option>
                                                    <% } else { %>
                                                    <option value="3">3</option>
                                                    <% } %>

                                                    <% if (user.getPrestigeScore() == 4) {%> 
                                                    <option value="4" selected>4</option>
                                                    <% } else { %>
                                                    <option value="4">4</option>
                                                    <% } %>

                                                    <% if (user.getPrestigeScore() == 5) {%> 
                                                    <option value="5" selected>5</option>
                                                    <% } else { %>
                                                    <option value="5">5</option>
                                                    <% } %>

                                                    <% if (user.getPrestigeScore() == 6) {%> 
                                                    <option value="6" selected>6</option>
                                                    <% } else { %>
                                                    <option value="6">6</option>
                                                    <% } %>

                                                    <% if (user.getPrestigeScore() == 7) {%> 
                                                    <option value="7" selected>7</option>
                                                    <% } else { %>
                                                    <option value="7">7</option>
                                                    <% } %>

                                                    <% if (user.getPrestigeScore() == 8) {%> 
                                                    <option value="8" selected>8</option>
                                                    <% } else { %>
                                                    <option value="8">8</option>
                                                    <% } %>

                                                    <% if (user.getPrestigeScore() == 9) {%> 
                                                    <option value="9" selected>9</option>
                                                    <% } else { %>
                                                    <option value="9">9</option>
                                                    <% } %>

                                                    <% if (user.getPrestigeScore() == 10) {%> 
                                                    <option value="10" selected>10</option>
                                                    <% } else { %>
                                                    <option value="10">10</option>
                                                    <% } %>

                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-sm-12 form-group">
                                            <label class="required">Học phí</label>
                                            <div class="input-group-btn">
                                                <select class="form-control btn btn-default" name="feeScore" required>
                                                    <% if (user.getFeeScore() == 1) {%> 
                                                    <option value="1" selected>1</option>
                                                    <% } else { %>
                                                    <option value="1">1</option>
                                                    <% } %>

                                                    <% if (user.getFeeScore() == 2) {%> 
                                                    <option value="2" selected>2</option>
                                                    <% } else { %>
                                                    <option value="2">2</option>
                                                    <% } %>

                                                    <% if (user.getFeeScore() == 3) {%> 
                                                    <option value="3" selected>3</option>
                                                    <% } else { %>
                                                    <option value="3">3</option>
                                                    <% } %>

                                                    <% if (user.getFeeScore() == 4) {%> 
                                                    <option value="4" selected>4</option>
                                                    <% } else { %>
                                                    <option value="4">4</option>
                                                    <% } %>

                                                    <% if (user.getFeeScore() == 5) {%> 
                                                    <option value="5" selected>5</option>
                                                    <% } else { %>
                                                    <option value="5">5</option>
                                                    <% } %>

                                                    <% if (user.getFeeScore() == 6) {%> 
                                                    <option value="6" selected>6</option>
                                                    <% } else { %>
                                                    <option value="6">6</option>
                                                    <% } %>

                                                    <% if (user.getFeeScore() == 7) {%> 
                                                    <option value="7" selected>7</option>
                                                    <% } else { %>
                                                    <option value="7">7</option>
                                                    <% } %>

                                                    <% if (user.getFeeScore() == 8) {%> 
                                                    <option value="8" selected>8</option>
                                                    <% } else { %>
                                                    <option value="8">8</option>
                                                    <% } %>

                                                    <% if (user.getFeeScore() == 9) {%> 
                                                    <option value="9" selected>9</option>
                                                    <% } else { %>
                                                    <option value="9">9</option>
                                                    <% } %>

                                                    <% if (user.getFeeScore() == 10) {%> 
                                                    <option value="10" selected>10</option>
                                                    <% } else { %>
                                                    <option value="10">10</option>
                                                    <% }%>

                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-sm-12 form-group">
                                            <label>Học phí trong khả năng chi trả</label>
                                            <input type="text" value="<%= user.getAffordableFee()%>" class="form-control" name="affordableFee">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <span class="text-muted"><em><span
                                                    style="color: red; font-size: 14px">*</span> Indicates
                                                required field</em> </span>
                                    </div>
                                    <%  String not_match = (String) request.getAttribute("not_match");
                                        System.out.println(not_match);
                                        if (not_match != null && not_match.equals("yes")) {
                                    %>
                                    <div class="form-group">
                                        <p class="bg-danger text-center text-danger"
                                           style="font-size: 18px;">Password doesn't match</p>
                                    </div>
                                    <%
                                        }
                                    %>
                                    <input type="submit" class="btn btn-lg btn-info">
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
<%-- 
    Document   : index
    Created on : Nov 25, 2018, 3:05:33 PM
    Author     : Duc Canh HNA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Decision System Support</title>
        <link rel="shortcut icon" type="image/png" href="image/favicon.png" />
        <link rel="stylesheet" type="text/css" href="css/main_css.css">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

    </head>
    <body>
        <div class="row">
            <jsp:include page="header.jsp" />
        </div>
        <div class="container-fullwidth" style="margin-top: 0 px">
            <div class="row">
                <div class="col-md-12">
                    <div id="carousel-example-generic" class="carousel slide"
                         data-ride="carousel">

                        <ol class="carousel-indicators">
                            <li data-target="#carousel-example-generic" data-slide-to="0"
                                class="active"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                        </ol>

                        <div class="carousel-inner">
                            <div class="item active">
                                <img src="image/Current-Deposit1.jpg" alt="First slide">

                            </div>
                            <div class="item">
                                <img src="image/Savings-Deposit1.jpg" alt="Second slide">

                            </div>
                        </div>

                        <a class="left carousel-control" href="#carousel-example-generic"
                           data-slide="prev"> <span
                                class="glyphicon glyphicon-chevron-left"></span></a><a
                            class="right carousel-control" href="#carousel-example-generic"
                            data-slide="next"><span
                                class="glyphicon glyphicon-chevron-right"> </span> </a>
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

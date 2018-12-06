<%-- 
    Document   : logout
    Created on : Nov 26, 2018, 12:22:23 AM
    Author     : Duc Canh HNA
--%>

<%
    session.invalidate();
    response.sendRedirect("index.jsp");
%>
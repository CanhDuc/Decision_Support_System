package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deposit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Deposit</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"image/favicon.png\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/deposit.css\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("        src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"piechart\"></div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        // Load google charts\n");
      out.write("            google.charts.load('current', {'packages': ['corechart']});\n");
      out.write("            google.charts.setOnLoadCallback(drawChart);\n");
      out.write("\n");
      out.write("        // Draw the chart and set the chart values\n");
      out.write("            function drawChart() {\n");
      out.write("                var data = google.visualization.arrayToDataTable([\n");
      out.write("                    ['Task', 'Hours per Day'],\n");
      out.write("                    ['Work', 8],\n");
      out.write("                    ['Eat', 2],\n");
      out.write("                    ['TV', 4],\n");
      out.write("                    ['Gym', 2],\n");
      out.write("                    ['Sleep', 8]\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("                // Optional; add a title and set the width and height of the chart\n");
      out.write("                var options = {'title': 'My Average Day', 'width': 550, 'height': 400};\n");
      out.write("\n");
      out.write("                // Display the chart inside the <div> element with id=\"piechart\"\n");
      out.write("                var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n");
      out.write("                chart.draw(data, options);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fullwidth\">\n");
      out.write("\n");
      out.write("            <div class=\"row\" style=\"margin-top: 50px;\">\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                    <form role=\"form\" method=\"post\" action=\"WithdrawServlet\">\n");
      out.write("                        <h2>Gửi tiền</h2>\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <hr class=\"colorgraph\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <label class=\"col-md-4 control-label\">Số tài khoản</label>\n");
      out.write("                        <div class=\"col-sm-8 form-group\">\n");
      out.write("                            <input type=\"text\" required placeholder=\"Hãy nhập số tài khoản...\"\n");
      out.write("                                   name=\"account_no\" class=\"form-control\"\n");
      out.write("                                   value=\"\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <label class=\"col-md-4 control-label\">Số tiền</label>\n");
      out.write("                        <div class=\"col-sm-8 form-group\">\n");
      out.write("                            <input type=\"number\" required placeholder=\"Hãy nhập số tiền cần gửi...\"\n");
      out.write("                                   class=\"form-control\" name=\"amount\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <hr class=\"colorgraph\">\n");
      out.write("                        </div>\n");
      out.write("                        ");

//                            String EnoughMoney = (String) request.getAttribute("EnoughMoney");
//                            if (EnoughMoney != null && EnoughMoney.equals("No")) {
                        
      out.write("\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                                <strong>Sorry!</strong> You do not have enough money.\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

//                            }
                        
      out.write("\n");
      out.write("                        ");
//                            String isPassOK = (String) request.getAttribute("isPassOK");
//                            if (isPassOK != null && isPassOK.equals("No")) {
                        
      out.write("\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                                <strong>Sorry!</strong> Password incorrect.\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
//                            }
                        
      out.write("\n");
      out.write("                        <div class=\"row col-md-10 col-md-offset-1\">\n");
      out.write("                            <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                                <input type=\"submit\" value=\"Submit\"\n");
      out.write("                                       class=\"btn btn-success btn-block btn-md\" tabindex=\"7\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                                <input class=\"btn btn-danger btn-block btn-md\" type=\"reset\"\n");
      out.write("                                       value=\"Reset\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
//            } else {
            
      out.write("\n");
      out.write("            <div class=\"row\" style=\"margin-top: 150px;\">\n");
      out.write("                <div class=\"alert alert-warning col-md-4 col-md-offset-4\"\n");
      out.write("                     role=\"alert\">\n");
      out.write("                    <strong>Warning!</strong> You have to login first.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
//                }

      out.write("\n");
      out.write("\n");
      out.write("            <!-- Footer start here -->\n");
      out.write("            <div class=\"row\" style=\"margin-top: 50px;\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

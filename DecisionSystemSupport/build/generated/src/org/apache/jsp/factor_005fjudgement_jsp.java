package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bank.model.User;

public final class factor_005fjudgement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

User user = null;
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Factor Judgement</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"image/favicon.png\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/create_account.css\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("        src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/passwordChecker.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            user = (User) session.getAttribute("userDetails");
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fullwidth\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"account col-md-6 col-md-offset-3\">\n");
      out.write("                    <h2 class=\"well text-center\">Đánh giá các yếu tố</h2>\n");
      out.write("                    <div class=\"col-lg-12 well\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <form action=\"CreateAccountServlet\" method=\"post\">\n");
      out.write("                                <div class=\"col-sm-12\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-12 form-group\">\n");
      out.write("                                            <label class=\"required\">Khả năng đỗ</label>\n");
      out.write("<!--                                            <div class=\"input-group-btn\">\n");
      out.write("                                                <select class=\"form-control btn btn-default\" name=\"successAbilityScore\" required>\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 1) {
      out.write(" \n");
      out.write("                                                    <option value=\"1\" selected>1</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"1\">1</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 2) {
      out.write(" \n");
      out.write("                                                    <option value=\"2\" selected>1</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"2\">2</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 3) {
      out.write(" \n");
      out.write("                                                    <option value=\"3\" selected>3</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"3\">1</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 4) {
      out.write(" \n");
      out.write("                                                    <option value=\"4\" selected>1</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"4\">4</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 5) {
      out.write(" \n");
      out.write("                                                    <option value=\"5\" selected>5</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"5\">5</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 6) {
      out.write(" \n");
      out.write("                                                    <option value=\"6\" selected>6</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"6\">6</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 7) {
      out.write(" \n");
      out.write("                                                    <option value=\"7\" selected>7</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"7\">7</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 8) {
      out.write(" \n");
      out.write("                                                    <option value=\"8\" selected>8</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"8\">8</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 9) {
      out.write(" \n");
      out.write("                                                    <option value=\"9\" selected>9</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"9\">9</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
 if (user.getSuccessAbilityScore() == 10) {
      out.write(" \n");
      out.write("                                                    <option value=\"10\" selected>10</option>\n");
      out.write("                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                    <option value=\"1\">10</option>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>-->\n");
      out.write("                                                    \n");
      out.write("                                                    <h1>");
 user.getAffordableFee(); 
      out.write("</h1>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-sm-12 form-group\">\n");
      out.write("                                            <label class=\"required\">Sở thích cá nhân</label>\n");
      out.write("                                            <div class=\"input-group-btn\">\n");
      out.write("                                                <select class=\"form-control btn btn-default\" name=\"schoolScore\" required>\n");
      out.write("                                                    <option value=\"1\">1</option>\n");
      out.write("                                                    <option value=\"2\">2</option>\n");
      out.write("                                                    <option value=\"3\">3</option>\n");
      out.write("                                                    <option value=\"4\">4</option>\n");
      out.write("                                                    <option value=\"5\">5</option>\n");
      out.write("                                                    <option value=\"6\">6</option>\n");
      out.write("                                                    <option value=\"7\">7</option>\n");
      out.write("                                                    <option value=\"8\">8</option>\n");
      out.write("                                                    <option value=\"9\">9</option>\n");
      out.write("                                                    <option value=\"10\">10</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-sm-12 form-group\">\n");
      out.write("                                            <label class=\"required\">Uy tín trường</label>\n");
      out.write("                                            <div class=\"input-group-btn\">\n");
      out.write("                                                <select class=\"form-control btn btn-default\" name=\"prestigeScore\" required>\n");
      out.write("                                                    <option value=\"1\">1</option>\n");
      out.write("                                                    <option value=\"2\">2</option>\n");
      out.write("                                                    <option value=\"3\">3</option>\n");
      out.write("                                                    <option value=\"4\">4</option>\n");
      out.write("                                                    <option value=\"5\">5</option>\n");
      out.write("                                                    <option value=\"6\">6</option>\n");
      out.write("                                                    <option value=\"7\">7</option>\n");
      out.write("                                                    <option value=\"8\">8</option>\n");
      out.write("                                                    <option value=\"9\">9</option>\n");
      out.write("                                                    <option value=\"10\">10</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-sm-12 form-group\">\n");
      out.write("                                            <label class=\"required\">Học phí</label>\n");
      out.write("                                            <div class=\"input-group-btn\">\n");
      out.write("                                                <select class=\"form-control btn btn-default\" name=\"feeScore\" required>\n");
      out.write("                                                    <option value=\"1\">1</option>\n");
      out.write("                                                    <option value=\"2\">2</option>\n");
      out.write("                                                    <option value=\"3\">3</option>\n");
      out.write("                                                    <option value=\"4\">4</option>\n");
      out.write("                                                    <option value=\"5\">5</option>\n");
      out.write("                                                    <option value=\"6\">6</option>\n");
      out.write("                                                    <option value=\"7\">7</option>\n");
      out.write("                                                    <option value=\"8\">8</option>\n");
      out.write("                                                    <option value=\"9\">9</option>\n");
      out.write("                                                    <option value=\"10\">10</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-sm-12 form-group\">\n");
      out.write("                                            <label>Học phí trong khả năng chi trả</label> <input type=\"text\"\n");
      out.write("                                                                                                 placeholder=\"Enter Affordable Fee Here..\" class=\"form-control\"\n");
      out.write("                                                                                                 name=\"affordableFee\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <span class=\"text-muted\"><em><span\n");
      out.write("                                                    style=\"color: red; font-size: 14px\">*</span> Indicates\n");
      out.write("                                                required field</em> </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
                                        String not_match = (String) request.getAttribute("not_match");
                                        System.out.println(not_match);
                                        if (not_match != null && not_match.equals("yes")) {
                                    
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <p class=\"bg-danger text-center text-danger\"\n");
      out.write("                                           style=\"font-size: 18px;\">Password doesn't match</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-lg btn-info\">\n");
      out.write("                                    </input>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Footer start here -->\n");
      out.write("            <div class=\"row\" style=\"margin-top: 5px;\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

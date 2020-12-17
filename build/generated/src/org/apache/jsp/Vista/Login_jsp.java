package org.apache.jsp.Vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid px-1 px-md-5 px-lg-1 px-xl-5 py-5 mx-auto\">\n");
      out.write("            <div class=\"card card0 border-0\">\n");
      out.write("                <div class=\"row d-flex\">\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"card1 pb-5\">\n");
      out.write("                            <div class=\"row\"> <img src=\"https://i.imgur.com/CXQmsmF.png\" class=\"logo\"> </div>\n");
      out.write("                            <div class=\"row px-3 justify-content-center mt-4 mb-5 border-line\"> <img src=\"https://i.imgur.com/uNGdWHi.png\" class=\"image\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"card2 card border-0 px-4 py-5\">\n");
      out.write("                            <div class=\"row mb-4 px-3\">\n");
      out.write("                                <h6 class=\"mb-0 mr-4 mt-2\">Sign in with</h6>\n");
      out.write("                                <div class=\"facebook text-center mr-3\">\n");
      out.write("                                    <div class=\"fa fa-facebook\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"twitter text-center mr-3\">\n");
      out.write("                                    <div class=\"fa fa-twitter\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"linkedin text-center mr-3\">\n");
      out.write("                                    <div class=\"fa fa-linkedin\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row px-3 mb-4\">\n");
      out.write("                                <div class=\"line\"></div> <small class=\"or text-center\">Or</small>\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row px-3\"> <label class=\"mb-1\">\n");
      out.write("                                    <h6 class=\"mb-0 text-sm\">Email Address</h6>\n");
      out.write("                                </label> <input class=\"mb-4\" type=\"text\" name=\"email\" placeholder=\"Enter a valid email address\"> </div>\n");
      out.write("                            <div class=\"row px-3\"> <label class=\"mb-1\">\n");
      out.write("                                    <h6 class=\"mb-0 text-sm\">Password</h6>\n");
      out.write("                                </label> <input type=\"password\" name=\"password\" placeholder=\"Enter password\"> </div>\n");
      out.write("                            <div class=\"row px-3 mb-4\">\n");
      out.write("                                <div class=\"custom-control custom-checkbox custom-control-inline\"> <input id=\"chk1\" type=\"checkbox\" name=\"chk\" class=\"custom-control-input\"> <label for=\"chk1\" class=\"custom-control-label text-sm\">Remember me</label> </div> <a href=\"#\" class=\"ml-auto mb-0 text-sm\">Forgot Password?</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row mb-3 px-3\"> <button type=\"submit\" class=\"btn btn-blue text-center\">Login</button> </div>\n");
      out.write("                            <div class=\"row mb-4 px-3\"> <small class=\"font-weight-bold\">Don't have an account? <a class=\"text-danger \">Register</a></small> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bg-blue py-4\">\n");
      out.write("                    <div class=\"row px-3\"> <small class=\"ml-4 ml-sm-5 mb-2\">Copyright &copy; 2019. All rights reserved.</small>\n");
      out.write("                        <div class=\"social-contact ml-4 ml-sm-auto\"> <span class=\"fa fa-facebook mr-4 text-sm\"></span> <span class=\"fa fa-google-plus mr-4 text-sm\"></span> <span class=\"fa fa-linkedin mr-4 text-sm\"></span> <span class=\"fa fa-twitter mr-4 mr-sm-5 text-sm\"></span> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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

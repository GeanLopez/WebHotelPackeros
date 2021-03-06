package org.apache.jsp.Vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../css/Perfil.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/all.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\n");
      out.write("        <link href=\"../css/adminlte.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"content\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-3\">\n");
      out.write("\n");
      out.write("            <!-- Profile Image -->\n");
      out.write("            <div class=\"card card-primary card-outline\">\n");
      out.write("              <div class=\"card-body box-profile\">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                  <img class=\"profile-user-img img-fluid img-circle\"\n");
      out.write("                       src=\"../Imagenes/user4-128x128.jpg\"\n");
      out.write("                        alt=\"User profile picture\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <h3 class=\"profile-username text-center\">Nina Mcintire</h3>\n");
      out.write("\n");
      out.write("                <p class=\"text-muted text-center\">Software Engineer</p>\n");
      out.write("\n");
      out.write("                <ul class=\"list-group list-group-unbordered mb-3\">\n");
      out.write("                  <li class=\"list-group-item\">\n");
      out.write("                    <b>Followers</b> <a class=\"float-right\">1,322</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"list-group-item\">\n");
      out.write("                    <b>Following</b> <a class=\"float-right\">543</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"list-group-item\">\n");
      out.write("                    <b>Friends</b> <a class=\"float-right\">13,287</a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary btn-block\"><b>Follow</b></a>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.card-body -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.card -->\n");
      out.write("\n");
      out.write("            <!-- About Me Box -->\n");
      out.write("            <div class=\"card card-primary\">\n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <h3 class=\"card-title\">About Me</h3>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.card-header -->\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <strong><i class=\"fas fa-book mr-1\"></i> Education</strong>\n");
      out.write("\n");
      out.write("                <p class=\"text-muted\">\n");
      out.write("                  B.S. in Computer Science from the University of Tennessee at Knoxville\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <strong><i class=\"fas fa-map-marker-alt mr-1\"></i> Location</strong>\n");
      out.write("\n");
      out.write("                <p class=\"text-muted\">Malibu, California</p>\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <strong><i class=\"fas fa-pencil-alt mr-1\"></i> Skills</strong>\n");
      out.write("\n");
      out.write("                <p class=\"text-muted\">\n");
      out.write("                  <span class=\"tag tag-danger\">UI Design</span>\n");
      out.write("                  <span class=\"tag tag-success\">Coding</span>\n");
      out.write("                  <span class=\"tag tag-info\">Javascript</span>\n");
      out.write("                  <span class=\"tag tag-warning\">PHP</span>\n");
      out.write("                  <span class=\"tag tag-primary\">Node.js</span>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <strong><i class=\"far fa-file-alt mr-1\"></i> Notes</strong>\n");
      out.write("\n");
      out.write("                <p class=\"text-muted\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam fermentum enim neque.</p>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.card-body -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.card -->\n");
      out.write("          </div>\n");
      out.write("          <!-- /.col -->\n");
      out.write("          <div class=\"col-md-9\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header p-2\">\n");
      out.write("                <ul class=\"nav nav-pills\">\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#activity\" data-toggle=\"tab\">Activity</a></li>\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"#timeline\" data-toggle=\"tab\">Timeline</a></li>\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"#settings\" data-toggle=\"tab\">Settings</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div><!-- /.card-header -->\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                  <div class=\"active tab-pane\" id=\"activity\">\n");
      out.write("                    <!-- Post -->\n");
      out.write("                    <div class=\"post\">\n");
      out.write("                      <div class=\"user-block\">\n");
      out.write("                        <img class=\"img-circle img-bordered-sm\" src=\"../../dist/img/user1-128x128.jpg\" alt=\"user image\">\n");
      out.write("                        <span class=\"username\">\n");
      out.write("                          <a href=\"#\">Jonathan Burke Jr.</a>\n");
      out.write("                          <a href=\"#\" class=\"float-right btn-tool\"><i class=\"fas fa-times\"></i></a>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"description\">Shared publicly - 7:30 PM today</span>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- /.user-block -->\n");
      out.write("                      <p>\n");
      out.write("                        Lorem ipsum represents a long-held tradition for designers,\n");
      out.write("                        typographers and the like. Some people hate it and argue for\n");
      out.write("                        its demise, but others ignore the hate as they create awesome\n");
      out.write("                        tools to help create filler text for everyone from bacon lovers\n");
      out.write("                        to Charlie Sheen fans.\n");
      out.write("                      </p>\n");
      out.write("\n");
      out.write("                      <p>\n");
      out.write("                        <a href=\"#\" class=\"link-black text-sm mr-2\"><i class=\"fas fa-share mr-1\"></i> Share</a>\n");
      out.write("                        <a href=\"#\" class=\"link-black text-sm\"><i class=\"far fa-thumbs-up mr-1\"></i> Like</a>\n");
      out.write("                        <span class=\"float-right\">\n");
      out.write("                          <a href=\"#\" class=\"link-black text-sm\">\n");
      out.write("                            <i class=\"far fa-comments mr-1\"></i> Comments (5)\n");
      out.write("                          </a>\n");
      out.write("                        </span>\n");
      out.write("                      </p>\n");
      out.write("\n");
      out.write("                      <input class=\"form-control form-control-sm\" type=\"text\" placeholder=\"Type a comment\">\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.post -->\n");
      out.write("\n");
      out.write("                    <!-- Post -->\n");
      out.write("                    <div class=\"post clearfix\">\n");
      out.write("                      <div class=\"user-block\">\n");
      out.write("                        <img class=\"img-circle img-bordered-sm\" src=\"../../dist/img/user7-128x128.jpg\" alt=\"User Image\">\n");
      out.write("                        <span class=\"username\">\n");
      out.write("                          <a href=\"#\">Sarah Ross</a>\n");
      out.write("                          <a href=\"#\" class=\"float-right btn-tool\"><i class=\"fas fa-times\"></i></a>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"description\">Sent you a message - 3 days ago</span>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- /.user-block -->\n");
      out.write("                      <p>\n");
      out.write("                        Lorem ipsum represents a long-held tradition for designers,\n");
      out.write("                        typographers and the like. Some people hate it and argue for\n");
      out.write("                        its demise, but others ignore the hate as they create awesome\n");
      out.write("                        tools to help create filler text for everyone from bacon lovers\n");
      out.write("                        to Charlie Sheen fans.\n");
      out.write("                      </p>\n");
      out.write("\n");
      out.write("                      <form class=\"form-horizontal\">\n");
      out.write("                        <div class=\"input-group input-group-sm mb-0\">\n");
      out.write("                          <input class=\"form-control form-control-sm\" placeholder=\"Response\">\n");
      out.write("                          <div class=\"input-group-append\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-danger\">Send</button>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </form>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.post -->\n");
      out.write("\n");
      out.write("                    <!-- Post -->\n");
      out.write("                    <div class=\"post\">\n");
      out.write("                      <div class=\"user-block\">\n");
      out.write("                        <img class=\"img-circle img-bordered-sm\" src=\"../../dist/img/user6-128x128.jpg\" alt=\"User Image\">\n");
      out.write("                        <span class=\"username\">\n");
      out.write("                          <a href=\"#\">Adam Jones</a>\n");
      out.write("                          <a href=\"#\" class=\"float-right btn-tool\"><i class=\"fas fa-times\"></i></a>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"description\">Posted 5 photos - 5 days ago</span>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- /.user-block -->\n");
      out.write("                      <div class=\"row mb-3\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                          <img class=\"img-fluid\" src=\"../../dist/img/photo1.png\" alt=\"Photo\">\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.col -->\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                          <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                              <img class=\"img-fluid mb-3\" src=\"../../dist/img/photo2.png\" alt=\"Photo\">\n");
      out.write("                              <img class=\"img-fluid\" src=\"../../dist/img/photo3.jpg\" alt=\"Photo\">\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                              <img class=\"img-fluid mb-3\" src=\"../../dist/img/photo4.jpg\" alt=\"Photo\">\n");
      out.write("                              <img class=\"img-fluid\" src=\"../../dist/img/photo1.png\" alt=\"Photo\">\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                          </div>\n");
      out.write("                          <!-- /.row -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.col -->\n");
      out.write("                      </div>\n");
      out.write("                      <!-- /.row -->\n");
      out.write("\n");
      out.write("                      <p>\n");
      out.write("                        <a href=\"#\" class=\"link-black text-sm mr-2\"><i class=\"fas fa-share mr-1\"></i> Share</a>\n");
      out.write("                        <a href=\"#\" class=\"link-black text-sm\"><i class=\"far fa-thumbs-up mr-1\"></i> Like</a>\n");
      out.write("                        <span class=\"float-right\">\n");
      out.write("                          <a href=\"#\" class=\"link-black text-sm\">\n");
      out.write("                            <i class=\"far fa-comments mr-1\"></i> Comments (5)\n");
      out.write("                          </a>\n");
      out.write("                        </span>\n");
      out.write("                      </p>\n");
      out.write("\n");
      out.write("                      <input class=\"form-control form-control-sm\" type=\"text\" placeholder=\"Type a comment\">\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.post -->\n");
      out.write("                  </div>\n");
      out.write("                  <!-- /.tab-pane -->\n");
      out.write("                  <div class=\"tab-pane\" id=\"timeline\">\n");
      out.write("                    <!-- The timeline -->\n");
      out.write("                    <div class=\"timeline timeline-inverse\">\n");
      out.write("                      <!-- timeline time label -->\n");
      out.write("                      <div class=\"time-label\">\n");
      out.write("                        <span class=\"bg-danger\">\n");
      out.write("                          10 Feb. 2014\n");
      out.write("                        </span>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- /.timeline-label -->\n");
      out.write("                      <!-- timeline item -->\n");
      out.write("                      <div>\n");
      out.write("                        <i class=\"fas fa-envelope bg-primary\"></i>\n");
      out.write("\n");
      out.write("                        <div class=\"timeline-item\">\n");
      out.write("                          <span class=\"time\"><i class=\"far fa-clock\"></i> 12:05</span>\n");
      out.write("\n");
      out.write("                          <h3 class=\"timeline-header\"><a href=\"#\">Support Team</a> sent you an email</h3>\n");
      out.write("\n");
      out.write("                          <div class=\"timeline-body\">\n");
      out.write("                            Etsy doostang zoodles disqus groupon greplin oooj voxy zoodles,\n");
      out.write("                            weebly ning heekya handango imeem plugg dopplr jibjab, movity\n");
      out.write("                            jajah plickers sifteo edmodo ifttt zimbra. Babblely odeo kaboodle\n");
      out.write("                            quora plaxo ideeli hulu weebly balihoo...\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"timeline-footer\">\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary btn-sm\">Read more</a>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-danger btn-sm\">Delete</a>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- END timeline item -->\n");
      out.write("                      <!-- timeline item -->\n");
      out.write("                      <div>\n");
      out.write("                        <i class=\"fas fa-user bg-info\"></i>\n");
      out.write("\n");
      out.write("                        <div class=\"timeline-item\">\n");
      out.write("                          <span class=\"time\"><i class=\"far fa-clock\"></i> 5 mins ago</span>\n");
      out.write("\n");
      out.write("                          <h3 class=\"timeline-header border-0\"><a href=\"#\">Sarah Young</a> accepted your friend request\n");
      out.write("                          </h3>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- END timeline item -->\n");
      out.write("                      <!-- timeline item -->\n");
      out.write("                      <div>\n");
      out.write("                        <i class=\"fas fa-comments bg-warning\"></i>\n");
      out.write("\n");
      out.write("                        <div class=\"timeline-item\">\n");
      out.write("                          <span class=\"time\"><i class=\"far fa-clock\"></i> 27 mins ago</span>\n");
      out.write("\n");
      out.write("                          <h3 class=\"timeline-header\"><a href=\"#\">Jay White</a> commented on your post</h3>\n");
      out.write("\n");
      out.write("                          <div class=\"timeline-body\">\n");
      out.write("                            Take me to your leader!\n");
      out.write("                            Switzerland is small and neutral!\n");
      out.write("                            We are more like Germany, ambitious and misunderstood!\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"timeline-footer\">\n");
      out.write("                            <a href=\"#\" class=\"btn btn-warning btn-flat btn-sm\">View comment</a>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- END timeline item -->\n");
      out.write("                      <!-- timeline time label -->\n");
      out.write("                      <div class=\"time-label\">\n");
      out.write("                        <span class=\"bg-success\">\n");
      out.write("                          3 Jan. 2014\n");
      out.write("                        </span>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- /.timeline-label -->\n");
      out.write("                      <!-- timeline item -->\n");
      out.write("                      <div>\n");
      out.write("                        <i class=\"fas fa-camera bg-purple\"></i>\n");
      out.write("\n");
      out.write("                        <div class=\"timeline-item\">\n");
      out.write("                          <span class=\"time\"><i class=\"far fa-clock\"></i> 2 days ago</span>\n");
      out.write("\n");
      out.write("                          <h3 class=\"timeline-header\"><a href=\"#\">Mina Lee</a> uploaded new photos</h3>\n");
      out.write("\n");
      out.write("                          <div class=\"timeline-body\">\n");
      out.write("                            <img src=\"https://placehold.it/150x100\" alt=\"...\">\n");
      out.write("                            <img src=\"https://placehold.it/150x100\" alt=\"...\">\n");
      out.write("                            <img src=\"https://placehold.it/150x100\" alt=\"...\">\n");
      out.write("                            <img src=\"https://placehold.it/150x100\" alt=\"...\">\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- END timeline item -->\n");
      out.write("                      <div>\n");
      out.write("                        <i class=\"far fa-clock bg-gray\"></i>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <!-- /.tab-pane -->\n");
      out.write("\n");
      out.write("                  <div class=\"tab-pane\" id=\"settings\">\n");
      out.write("                    <form class=\"form-horizontal\">\n");
      out.write("                      <div class=\"form-group row\">\n");
      out.write("                        <label for=\"inputName\" class=\"col-sm-2 col-form-label\">Name</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"email\" class=\"form-control\" id=\"inputName\" placeholder=\"Name\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group row\">\n");
      out.write("                        <label for=\"inputEmail\" class=\"col-sm-2 col-form-label\">Email</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group row\">\n");
      out.write("                        <label for=\"inputName2\" class=\"col-sm-2 col-form-label\">Name</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"text\" class=\"form-control\" id=\"inputName2\" placeholder=\"Name\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group row\">\n");
      out.write("                        <label for=\"inputExperience\" class=\"col-sm-2 col-form-label\">Experience</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <textarea class=\"form-control\" id=\"inputExperience\" placeholder=\"Experience\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group row\">\n");
      out.write("                        <label for=\"inputSkills\" class=\"col-sm-2 col-form-label\">Skills</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"text\" class=\"form-control\" id=\"inputSkills\" placeholder=\"Skills\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group row\">\n");
      out.write("                        <div class=\"offset-sm-2 col-sm-10\">\n");
      out.write("                          <div class=\"checkbox\">\n");
      out.write("                            <label>\n");
      out.write("                              <input type=\"checkbox\"> I agree to the <a href=\"#\">terms and conditions</a>\n");
      out.write("                            </label>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group row\">\n");
      out.write("                        <div class=\"offset-sm-2 col-sm-10\">\n");
      out.write("                          <button type=\"submit\" class=\"btn btn-danger\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                  <!-- /.tab-pane -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.tab-content -->\n");
      out.write("              </div><!-- /.card-body -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.card -->\n");
      out.write("          </div>\n");
      out.write("          <!-- /.col -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("      </div><!-- /.container-fluid -->\n");
      out.write("    </section>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomeContact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Catering.com | Contact</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--[if lt IE 9]><script type=\"text/javascript\" src=\"js/html5.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("<body id=\"page6\">\n");
      out.write("<!--==============================header=================================-->\n");
      out.write("<header>\n");
      out.write("  <div class=\"row-top\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <h1><a href=\"index.jsp\">Catering<span>.com</span></a></h1>\n");
      out.write("         <nav>\n");
      out.write("          <ul class=\"menu\">\n");
      out.write("              ");
      out.write("\n");
      out.write("              <li><a href=\"HomeContact.jsp\">Contact</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row-bot\">\n");
      out.write("    <div class=\"row-bot-bg\">\n");
      out.write("      <div class=\"main\">\n");
      out.write("        <h2>Impressive Selection <span>for any Occasion</span></h2>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("<!--==============================content================================-->\n");
      out.write("<section id=\"content\">\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("      <article class=\"col-1\">\n");
      out.write("        <div class=\"indent-left\">\n");
      out.write("          <h3 class=\"p1\">Our Contacts</h3>\n");
      out.write("          <figure class=\"indent-bot\">\n");
      out.write("          <img src=\"images/mess3_1.jpg\" width=\"252\" height=\"188\"></figure>\n");
      out.write("          <dl>\n");
      out.write("            <dt class=\"p1\">MG ROAD , INDORE(M.P)</dt>\n");
      out.write("            <dd><span>Telephone:</span> +919770201337</dd>\n");
      out.write("            <dd><span>Email:</span><a class=\"color-2\" href=\"#\">Catering.cc@yahoo.com</a></dd>\n");
      out.write("          </dl>\n");
      out.write("        </div>\n");
      out.write("      </article>\n");
      out.write("      <article class=\"col-2\">\n");
      out.write("        <h3 class=\"p1\"> For Real Tasty Contact Us.....</h3>\n");
      out.write("        <p class=\"p1\"> <img src=\"images/kapil2.jpg\" width=\"605\" height=\"326\"></p>\n");
      out.write("       \n");
      out.write("      </article>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!--==============================footer=================================-->\n");
      out.write("<footer>\n");
      out.write("  <div class=\"main\">\n");
      out.write("     <div class=\"aligncenter\"> <span>Copyright &copy; 2016 <a href=\"#\">Catering.com</a> All Rights Reserved</span></div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<script type=\"text/javascript\">Cufon.now();</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("  ");
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

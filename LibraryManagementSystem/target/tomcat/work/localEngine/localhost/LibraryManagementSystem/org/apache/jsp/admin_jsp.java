package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh_CN\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>图书管理员登录</title>\r\n");
      out.write("    <meta content=\"IE=edge,chrome=1\" http-equiv=\"X-UA-Compatible\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"lib/bootstrap/css/bootstrap.css\">\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/theme.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/font-awesome/css/font-awesome.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"lib/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Demo page code -->\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        #line-chart {\r\n");
      out.write("            height:300px;\r\n");
      out.write("            width:800px;\r\n");
      out.write("            margin: 0px auto;\r\n");
      out.write("            margin-top: 1em;\r\n");
      out.write("        }\r\n");
      out.write("        .brand { font-family: georgia, serif; }\r\n");
      out.write("        .brand .first {\r\n");
      out.write("            color: #ccc;\r\n");
      out.write("            font-style: italic;\r\n");
      out.write("        }\r\n");
      out.write("        .brand .second {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- Le fav and touch icons -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../assets/ico/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"../assets/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"../assets/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"../assets/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"../assets/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <!--[if lt IE 7 ]> <body class=\"ie ie6\"> <![endif]-->\r\n");
      out.write("  <!--[if IE 7 ]> <body class=\"ie ie7 \"> <![endif]-->\r\n");
      out.write("  <!--[if IE 8 ]> <body class=\"ie ie8 \"> <![endif]-->\r\n");
      out.write("  <!--[if IE 9 ]> <body class=\"ie ie9 \"> <![endif]-->\r\n");
      out.write("  <!--[if (gt IE 9)|!(IE)]><!--> \r\n");
      out.write("  <body class=\"\"> \r\n");
      out.write("  \r\n");
      out.write("  <!--<![endif]-->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"navbar\">\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("                <ul class=\"nav pull-right\">\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                <a class=\"brand\" href=\"index.jsp\"><span class=\"first\">江理图书</span> <span class=\"second\">管理系统</span></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"row-fluid\">\r\n");
      out.write("    <div class=\"dialog\">\r\n");
      out.write("        <div class=\"block\">\r\n");
      out.write("            <p class=\"block-heading\">管理员登录</p>\r\n");
      out.write("            <div class=\"block-body\">\r\n");
      out.write("                <form id=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/AdminLoginServlet\" method=\"post\">\r\n");
      out.write("                    <label>用户名</label>\r\n");
      out.write("                    <input name=\"admAcc\" type=\"text\" class=\"span12\">\r\n");
      out.write("                    <label>密码</label>\r\n");
      out.write("                    <input name=\"admPswd\" type=\"password\" class=\"span12\">\r\n");
      out.write("                    <a href=\"javascript:void(0)\" onclick=\"transmit()\" class=\"btn btn-primary pull-right\">登录</a>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("    \tfunction transmit(i){\r\n");
      out.write("    \t\tdocument.getElementById(\"form\").submit();\r\n");
      out.write("    \t}\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"lib/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

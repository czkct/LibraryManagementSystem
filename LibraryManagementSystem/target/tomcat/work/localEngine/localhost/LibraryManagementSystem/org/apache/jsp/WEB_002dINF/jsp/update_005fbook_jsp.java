package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_005fbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("    <title>江理图书管理系统</title>\r\n");
      out.write("    <meta content=\"IE=edge,chrome=1\" http-equiv=\"X-UA-Compatible\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"图书馆管理系统\">\r\n");
      out.write("    <meta name=\"author\" content=\"都颜汗\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"lib/bootstrap/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/theme.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/font-awesome/css/font-awesome.css\">\r\n");
      out.write("    \r\n");
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
      out.write("        .glyphicon-book:before{content:\"\\e043\"}\r\n");
      out.write("        #tab > input, #tab > textarea, #tab2 > input, #tab2 > textarea {\r\n");
      out.write("             margin-right:55px;\r\n");
      out.write("             margin-bottom: 25px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <!-- Le jsp5 shim, for IE6-8 support of jsp5 elements -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"http://jsp5shim.googlecode.com/svn/trunk/jsp5.js\"></script>\r\n");
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
      out.write("  <!--<![endif]-->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"navbar\">\r\n");
      out.write("       <div class=\"navbar-inner\">\r\n");
      out.write("                <ul class=\"nav pull-right\">\r\n");
      out.write("                    \r\n");
      out.write("                    <li><a href=\"#\" class=\"hidden-phone visible-tablet visible-desktop\" role=\"button\">设置</a></li>\r\n");
      out.write("                    <li id=\"fat-menu\" class=\"dropdown\">\r\n");
      out.write("                        <a href=\"#\" role=\"button\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <i class=\"icon-user\"></i>\r\n");
      out.write("                            \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <i class=\"icon-caret-down\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li><a tabindex=\"-1\" href=\"#\">个人账户</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a tabindex=\"-1\" class=\"visible-phone\" href=\"#\">设置</a></li>\r\n");
      out.write("                            <li class=\"divider visible-phone\"></li>\r\n");
      out.write("                            <li><a tabindex=\"-1\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/LogoutServlet\">退出登录</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                <a class=\"brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/IndexAdminServlet\"><span class=\"first\">江理图书馆</span> <span class=\"second\">管理系统</span></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"copyrights\">Collect from <a href=\"http://www.cssmoban.com/\"  title=\"网站模板\">网站模板</a></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"sidebar-nav\">\r\n");
      out.write("        <form class=\"search form-inline\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"搜索...\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/AllInfoAdminServlet\" class=\"nav-header\" ><i class=\"icon-home\"></i>概览面板</a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"#book-menu\" class=\"nav-header\" data-toggle=\"collapse\"><i class=\"icon-book\"></i>图书管理<i class=\"icon-chevron-up\"></i></a>\r\n");
      out.write("        <ul id=\"book-menu\" class=\"nav nav-list collapse in\">\r\n");
      out.write("            <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/FindAllBooksAdminServlet\">总览图书列表</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/FindBookAdminServlet\">查询删改图书</a></li>\r\n");
      out.write("            <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/AddBookAdminServlet\">添加图书信息</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"#reader-menu\" class=\"nav-header collapsed\" data-toggle=\"collapse\"><i class=\"icon-user\"></i>读者管理<i class=\"icon-chevron-up\"></i></a>\r\n");
      out.write("        <ul id=\"reader-menu\" class=\"nav nav-list collapse\">\r\n");
      out.write("            <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/FindAllUsersAdminServlet\">总览读者列表</a></li>\r\n");
      out.write("            <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/FindUserAdminServlet\">查询删改读者</a></li>\r\n");
      out.write("            <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/AddUserAdminServlet\">添加读者信息</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"#borrow-menu\" class=\"nav-header collapsed\" data-toggle=\"collapse\"><i class=\"icon-retweet\"></i>借阅管理<i class=\"icon-chevron-up\"></i></a>\r\n");
      out.write("        <ul id=\"borrow-menu\" class=\"nav nav-list collapse\">\r\n");
      out.write("            <li ><a href=\"borrows_list.jsp\">总览借阅列表</a></li>\r\n");
      out.write("            <li ><a href=\"rud_borrow.jsp\">查询删改借阅</a></li>\r\n");
      out.write("            <li ><a href=\"add_borrow.jsp\">添加借阅信息</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"reset-password.jsp\" class=\"nav-header\" ><i class=\"icon-edit\"></i>重置密码</a>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            \r\n");
      out.write("            <h1 class=\"page-title\">修改图书信息</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("                <ul class=\"breadcrumb\">\r\n");
      out.write("            <li><a href=\"index.jsp\">管理主页</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("            <li><a href=\"rud_book.jsp\">图书管理->查询删改图书</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("            <li class=\"active\">修改图书信息\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row-fluid\">\r\n");
      out.write("                    \r\n");
      out.write("<div class=\"btn-toolbar\">\r\n");
      out.write("    <div class=\"btn-group\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"well\">\r\n");
      out.write("    <ul class=\"nav nav-tabs\" style=\"font-color:font-color:#000;\">\r\n");
      out.write("      <li class=\"active\" style=\"margin-left:0;\"><a href=\"#addbook\" data-toggle=\"tab\">修改图书</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div id=\"myTabContent\" class=\"tab-content\">\r\n");
      out.write("      <div class=\"tab-pane active in\" id=\"addbook\">\r\n");
      out.write("        <form id=\"tab\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/UpdateBookServlet\" method=\"post\">\r\n");
      out.write("            <input name=\"bkNum\" type=\"text\"  class=\"input-xlarge\" placeholder=\"图书编号\" value=\"");
      out.print(request.getParameter("bkNum") );
      out.write("\">\r\n");
      out.write("            <input name=\"bkName\" type=\"text\"  class=\"input-xlarge\" placeholder=\"图书书名\" value=\"");
      out.print(request.getParameter("bkName") );
      out.write("\">\r\n");
      out.write("            <input name=\"auName\" type=\"text\"  class=\"input-xlarge\" placeholder=\"图书作者\" value=\"");
      out.print(request.getParameter("auName") );
      out.write("\">\r\n");
      out.write("            <input name=\"auInfo\" type=\"text\"  class=\"input-xlarge\" placeholder=\"作者简介\" value=\"");
      out.print(request.getParameter("auInfo") );
      out.write("\">\r\n");
      out.write("            <input name=\"bkPub\" type=\"text\"  class=\"input-xlarge\" placeholder=\"出版社\" value=\"");
      out.print(request.getParameter("bkPub") );
      out.write("\">\r\n");
      out.write("            <input name=\"bkPubTime\" type=\"text\"  class=\"input-xlarge\" placeholder=\"出版时间\" value=\"");
      out.print(request.getParameter("bkPubTime") );
      out.write("\">\r\n");
      out.write("            <input name=\"bkPrice\" type=\"text\"  class=\"input-xlarge\" placeholder=\"图书单价\" value=\"");
      out.print(request.getParameter("bkPrice") );
      out.write("\">\r\n");
      out.write("            <input name=\"bkInfo\" type=\"text\"  class=\"input-xlarge\" placeholder=\"图书简介\" value=\"");
      out.print(request.getParameter("bkInfo") );
      out.write("\">\r\n");
      out.write("            <input name=\"bkLang\" type=\"text\"  class=\"input-xlarge\" placeholder=\"图书语种\" value=\"");
      out.print(request.getParameter("bkLang") );
      out.write("\">\r\n");
      out.write("            <input name=\"typeName\" type=\"text\"  class=\"input-xlarge\" placeholder=\"所属类别\" value=\"");
      out.print(request.getParameter("typeName") );
      out.write("\">\r\n");
      out.write("            <input name=\"bkInv\" type=\"text\"  class=\"input-xlarge\" placeholder=\"库存\" value=\"");
      out.print(request.getParameter("bkInv") );
      out.write("\">\r\n");
      out.write("            <input name=\"bkTag\" type=\"text\" class=\"input-xlarge\" placeholder=\"标签丨多个标签之间以英文逗号隔开\" value=\"");
      out.print(request.getParameter("bkTag") );
      out.write("\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn-success span12\" style=\"margin-left:0;\">更新图书</button>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal small hide fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-header\">\r\n");
      out.write("    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("    <h3 id=\"myModalLabel\">Delete Confirmation</h3>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"modal-body\">\r\n");
      out.write("    \r\n");
      out.write("    <p class=\"error-text\"><i class=\"icon-warning-sign modal-icon\"></i>Are you sure you want to delete the user?</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"modal-footer\">\r\n");
      out.write("    <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Cancel</button>\r\n");
      out.write("    <button class=\"btn btn-danger\" data-dismiss=\"modal\">Delete</button>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <footer>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        \r\n");
      out.write("                        <p class=\"pull-right\">Collect from <a href=\"http://www.cssmoban.com/\" title=\"网页模板\" target=\"_blank\">网页模板</a></p>\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                        <p>&copy; 2012 <a href=\"#\" target=\"_blank\">Portnine</a></p>\r\n");
      out.write("                    </footer>\r\n");
      out.write("                    \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"lib/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(\"[rel=tooltip]\").tooltip();\r\n");
      out.write("        $(function() {\r\n");
      out.write("            $('.demo-cancel-click').click(function(){return false;});\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/update_book.jsp(74,29) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            \t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.admName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("                            \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}

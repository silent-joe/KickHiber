/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-04-28 08:23:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class project_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/defoult.css", Long.valueOf(1430208876000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Kickstarter project</title>\r\n");
      out.write("<style>");
      out.write("body {background: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/2.jpg) repeat;}\n");
      out.write("\n");
      out.write("h1 {color: #0e7dea; text-align: center}\n");
      out.write("\n");
      out.write("h3 {color: #ff0000;}\n");
      out.write("\n");
      out.write(".quote {color: #ff0000;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size:24px;\n");
      out.write("\n");
      out.write("\tmargin: 20px auto;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\twidth:780px;\n");
      out.write("\tbox-shadow: 3px 3px 3px 3px #888888;\n");
      out.write("\tborder:1px solid #000000;\n");
      out.write("\tbackground: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".error {color: #ff0000;}\n");
      out.write("\n");
      out.write(".button{\n");
      out.write("\tmargin: 15px 0px;\n");
      out.write("\tborder:1px solid #26759E;-webkit-box-shadow: #FEFFFF 0px 1px 3px inset;-moz-box-shadow: #FEFFFF 0px 1px 3px inset; box-shadow: #FEFFFF 0px 1px 3px inset; -webkit-border-radius: 7px; -moz-border-radius: 7px;border-radius: 7px;font-size:14px;font-family:arial, helvetica, sans-serif; padding: 8px 8px 8px 8px; text-decoration:none; display:inline-block;text-shadow: 0px 1px 0 rgba(255,255,255,0.5);font-weight:bold; color: #0F3C8A;\n");
      out.write("\tbackground-color: #E6E6E6; background-image: -webkit-gradient(linear, left top, left bottom, from(#E6E6E6), to(#CCCCCC));\n");
      out.write("\tbackground-image: -webkit-linear-gradient(top, #E6E6E6, #CCCCCC);\n");
      out.write("\tbackground-image: -moz-linear-gradient(top, #E6E6E6, #CCCCCC);\n");
      out.write("\tbackground-image: -ms-linear-gradient(top, #E6E6E6, #CCCCCC);\n");
      out.write("\tbackground-image: -o-linear-gradient(top, #E6E6E6, #CCCCCC);\n");
      out.write("\tbackground-image: linear-gradient(to bottom, #E6E6E6, #CCCCCC);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#E6E6E6, endColorstr=#CCCCCC);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover{\n");
      out.write("\tborder:1px solid #26759E;\n");
      out.write("\tbackground-color: #cdcdcd; background-image: -webkit-gradient(linear, left top, left bottom, from(#cdcdcd), to(#b3b3b3));\n");
      out.write("\tbackground-image: -webkit-linear-gradient(top, #cdcdcd, #b3b3b3);\n");
      out.write("\tbackground-image: -moz-linear-gradient(top, #cdcdcd, #b3b3b3);\n");
      out.write("\tbackground-image: -ms-linear-gradient(top, #cdcdcd, #b3b3b3);\n");
      out.write("\tbackground-image: -o-linear-gradient(top, #cdcdcd, #b3b3b3);\n");
      out.write("\tbackground-image: linear-gradient(to bottom, #cdcdcd, #b3b3b3);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#cdcdcd, endColorstr=#b3b3b3);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".center {\n");
      out.write("\tmargin:0 auto;\n");
      out.write("\twidth:900px;\n");
      out.write("\tbox-shadow: 3px 3px 3px 3px #888888;\n");
      out.write("\tborder:1px solid #000000;\n");
      out.write("\tbackground: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".center2 {\n");
      out.write("\tmargin:0 auto;\n");
      out.write("\twidth:800px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".CSSTableGenerator {\n");
      out.write("\tmargin: auto;\n");
      out.write("\tpadding:0px;\n");
      out.write("\twidth:800px;\n");
      out.write("\tbox-shadow: 10px 10px 5px #888888;\n");
      out.write("\tborder:1px solid #000000;\n");
      out.write("\t\n");
      out.write("\t-moz-border-radius-bottomleft:8px;\n");
      out.write("\t-webkit-border-bottom-left-radius:8px;\n");
      out.write("\tborder-bottom-left-radius:8px;\n");
      out.write("\t\n");
      out.write("\t-moz-border-radius-bottomright:8px;\n");
      out.write("\t-webkit-border-bottom-right-radius:8px;\n");
      out.write("\tborder-bottom-right-radius:8px;\n");
      out.write("\t\n");
      out.write("\t-moz-border-radius-topright:8px;\n");
      out.write("\t-webkit-border-top-right-radius:8px;\n");
      out.write("\tborder-top-right-radius:8px;\n");
      out.write("\t\n");
      out.write("\t-moz-border-radius-topleft:8px;\n");
      out.write("\t-webkit-border-top-left-radius:8px;\n");
      out.write("\tborder-top-left-radius:8px;\n");
      out.write("}.CSSTableGenerator table{\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    border-spacing: 0;\n");
      out.write("\twidth:800px;\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("}.CSSTableGenerator tr:last-child td:last-child {\n");
      out.write("\t-moz-border-radius-bottomright:8px;\n");
      out.write("\t-webkit-border-bottom-right-radius:8px;\n");
      out.write("\tborder-bottom-right-radius:8px;\n");
      out.write("}.CSSTableGenerator table tr:first-child td:first-child {\n");
      out.write("\t-moz-border-radius-topleft:8px;\n");
      out.write("\t-webkit-border-top-left-radius:8px;\n");
      out.write("\tborder-top-left-radius:8px;\n");
      out.write("}\n");
      out.write(".CSSTableGenerator table tr:first-child td:last-child {\n");
      out.write("\t-moz-border-radius-topright:8px;\n");
      out.write("\t-webkit-border-top-right-radius:8px;\n");
      out.write("\tborder-top-right-radius:8px;\n");
      out.write("}.CSSTableGenerator tr:last-child td:first-child{\n");
      out.write("\t-moz-border-radius-bottomleft:8px;\n");
      out.write("\t-webkit-border-bottom-left-radius:8px;\n");
      out.write("\tborder-bottom-left-radius:8px;\n");
      out.write("}.CSSTableGenerator tr:hover td{\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".CSSTableGenerator tr:nth-child(odd) {background-color:#e5e5e5;}\n");
      out.write(".CSSTableGenerator tr:nth-child(even) {background-color:#ffffff;}.CSSTableGenerator td{\n");
      out.write("\tvertical-align:middle;\n");
      out.write("\tborder:1px solid #000000;\n");
      out.write("\tborder-width:0px 1px 1px 0px;\n");
      out.write("\ttext-align:left;\n");
      out.write("\tpadding:10px;\n");
      out.write("\tfont-size:12px;\n");
      out.write("\tfont-family:Arial;\n");
      out.write("\tfont-weight:normal;\n");
      out.write("\tcolor:#0000ff;\n");
      out.write("}.CSSTableGenerator tr:last-child td{\n");
      out.write("\tborder-width:0px 1px 0px 0px;\n");
      out.write("}.CSSTableGenerator tr td:last-child{\n");
      out.write("\tborder-width:0px 0px 1px 0px;\n");
      out.write("}.CSSTableGenerator tr:last-child td:last-child{\n");
      out.write("\tborder-width:0px 0px 0px 0px;\n");
      out.write("}\n");
      out.write(".CSSTableGenerator tr:first-child td{\n");
      out.write("\tbackground:-o-linear-gradient(bottom, #e5e5e5 5%, #cccccc 100%);\tbackground:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #e5e5e5), color-stop(1, #cccccc) );\n");
      out.write("\tbackground:-moz-linear-gradient( center top, #e5e5e5 5%, #cccccc 100% );\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr=\"#e5e5e5\", endColorstr=\"#cccccc\");\tbackground: -o-linear-gradient(top,#e5e5e5,cccccc);\n");
      out.write("\n");
      out.write("\tbackground-color:#e5e5e5;\n");
      out.write("\tborder:0px solid #000000;\n");
      out.write("\ttext-align:center;\n");
      out.write("\tborder-width:0px 0px 1px 1px;\n");
      out.write("\tfont-size:14px;\n");
      out.write("\tfont-family:Arial;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tcolor:#ff00ff;\n");
      out.write("}\n");
      out.write(".CSSTableGenerator tr:first-child:hover td{\n");
      out.write("\tbackground:-o-linear-gradient(bottom, #e5e5e5 5%, #cccccc 100%);\tbackground:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #e5e5e5), color-stop(1, #cccccc) );\n");
      out.write("\tbackground:-moz-linear-gradient( center top, #e5e5e5 5%, #cccccc 100% );\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr=\"#e5e5e5\", endColorstr=\"#cccccc\");\tbackground: -o-linear-gradient(top,#e5e5e5,cccccc);\n");
      out.write("\n");
      out.write("\tbackground-color:#e5e5e5;\n");
      out.write("}\n");
      out.write(".CSSTableGenerator tr:first-child td:first-child{\n");
      out.write("\tborder-width:0px 0px 1px 0px;\n");
      out.write("}\n");
      out.write(".CSSTableGenerator tr:first-child td:last-child{\n");
      out.write("\tborder-width:0px 0px 1px 1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"center\" >\r\n");
      out.write("<div class=\"center2\" >\r\n");
      out.write("\r\n");
      out.write("\t<h1>Project from category with name - ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.category.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t<div class=\"CSSTableGenerator\" >\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>NAME</td>\r\n");
      out.write("\t\t\t<td>VALUE</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>project name:</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>short description:</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.shortDescription}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>full description:</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.fullDescription}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>foto:</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.foto}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>link:</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.link}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>how much needed:</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.howMuchNeeded}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>how much collected:</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.howMuchCollected}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>how much remaining;</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.howMuchRemaining}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>days to go:</td>\r\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.dateClose}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<p>If you want return to <a class=\"button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/projects/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.idCategory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">projects</a></p>\r\n");
      out.write("\t<p>If you want to <a class=\"button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/donate/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">invest to the project</a></p>\r\n");
      out.write("\r\n");
      out.write("\t<h3>");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("\t\r\n");
      out.write("\t<h1>Questions and answers for this project with name - ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"CSSTableGenerator\" >\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>QUESTION</td>\r\n");
      out.write("\t\t\t<td>ANSWER</td>\r\n");
      out.write("\t\t\t<td>DELETE QUESTION</td>\r\n");
      out.write("\t\t\t<td>ADD ANSWER</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p>Have a question? If the info above doesn't help, you can <a class=\"button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/question/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("?add\">ask the project creator directly</a></p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /project.jsp(2,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /project.jsp(2,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/project.jsp(2,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /project.jsp(61,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /project.jsp(74,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/project.jsp(74,3) '${questions}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${questions}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /project.jsp(74,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("question");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.question}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.answer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/question/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.idProject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("?delete\">delete this question</a></td>\r\n");
          out.write("\t\t\t\t\t<td><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/question/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("?addanswer\">add answer to this question</a></td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
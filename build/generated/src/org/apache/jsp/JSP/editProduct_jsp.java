package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/manaprostyle.css\"> \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("                            <h2>Manage <b>Product</b></h2>\n");
      out.write("                        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <!-- Edit Modal HTML -->\n");
      out.write("            <div id=\"editEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"editProduct\" method=\"post\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Edit Employee</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Product ID</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.product_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"product_id\" type=\"text\" class=\"form-control\" readonly required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Product Name</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.product_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"product_name\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Price</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.list_price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"list_price\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Category Name</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.category_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"category_name\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Image</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"img\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-info\" value=\"Save\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <!-- Delete Modal HTML -->\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>                                \t\t                            \n");
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

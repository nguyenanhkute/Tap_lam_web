package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;
import java.util.ArrayList;
import DAO.ProductDAO;

public final class insert_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Thêm sản phẩm</title>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/mos-style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function validateForm(){\n");
      out.write("                \n");
      out.write("                var tensp= document.myForm.tenSP.value;\n");
      out.write("                var tenncc= tenNCC.value;\n");
      out.write("                var tenlsp= tenLSP.value;\n");
      out.write("                var GIA= document.myForm.gia.value ;\n");
      out.write("                var MOTA= document.myForm.mota.value ;\n");
      out.write("                var TINHTRANG= document.myForm.tinhtrang.value;\n");
      out.write("                if (tensp==\"\"||tenncc==\"--Nhà cung cấp--\"||tenlsp==\"--LOẠI SP--\"||GIA==\"\"||MOTA==\"\"||TINHTRANG==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Bạn chưa nhập thông tin\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"myForm\" action=\"/WebApplication1/ManagerProductServlet\" method=\"post\">\n");
      out.write("            ");
      out.write("\n");
      out.write("        ");

            String error="";
            if(request.getParameter("error")!=null)
            {
                error=(String)request.getParameter("error");
            }
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            ProductDAO productDAO= new ProductDAO();
            ArrayList<Product> ListCategoryName= productDAO.getListCategoryName();
            ArrayList<Product> ListSupplierName= productDAO.getListSupplierName();
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("            <div id=\"rightContent\">\n");
      out.write("                <h2>Thông tin  sản phẩm </h2>\n");
      out.write("                    <table width=\"95%\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td width=\"125px\"><b>Tên sản phẩm</b></td>\n");
      out.write("                            <td><input type=\"text\" class=\"sedang\" name=\"tenSP\">");
      out.print(error);
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>Loại sản phẩm</b></td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"tenLSP\" name=\"tenLSP\">\n");
      out.write("\t\t\t\t<option selected >--LOẠI SP--</option>\n");
      out.write("                                ");
 
                                    for (Product product : ListCategoryName){
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(product.getCategoryName());
      out.write('"');
      out.write('>');
      out.print(product.getCategoryName());
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                         \n");
      out.write("                         ");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>Nhà cung cấp</b></td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"tenNCC\" name=\"tenNCC\">\n");
      out.write("\t\t\t\t<option selected >--Nhà cung cấp--</option>\n");
      out.write("                                ");
 
                                    for (Product product1 : ListSupplierName){
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(product1.getSupplierName());
      out.write('"');
      out.write('>');
      out.print(product1.getSupplierName());
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td width=\"125px\"><b>Giá </b></td>\n");
      out.write("                            <td><input type=\"text\" class=\"sedang\" name=\"gia\">");
      out.print(error);
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td width=\"125px\"><b>Mô tả</b></td>\n");
      out.write("                            <td><input type=\"text\" class=\"sedang\" name=\"mota\">");
      out.print(error);
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td width=\"125px\"><b>Tình trạng </b></td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"tinhtrang\" name=\"tinhtrang\">\n");
      out.write("                                    <option selected >--tình trạng--</option>\n");
      out.write("                                    <option value=\"1\">còn</option>\n");
      out.write("                                    <option value=\"0\">hết</option>\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <tr><td>\n");
      out.write("                            <input type=\"hidden\" name=\"command\" value=\"insert\">\n");
      out.write("                            <input type=\"submit\" class=\"button\" value=\"Lưu dữ liệu\" onclick=\"validateForm()\">\n");
      out.write("                        </td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>  \n");
      out.write("                </div> \n");
      out.write("            <div class =\"clear\"></div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        \n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}

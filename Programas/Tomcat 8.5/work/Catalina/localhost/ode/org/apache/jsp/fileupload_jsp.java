/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-05-20 13:21:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import java.io.File;
import java.lang.String;
import java.io.InputStream;
import java.net.URL;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.*;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMText;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLInputFactory;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import java.io.StringReader;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.axiom.soap.SOAP11Constants;
import org.apache.axiom.soap.SOAP12Constants;
import org.apache.axis2.Constants;
import org.apache.axis2.description.WSDL2Constants;
import org.apache.axis2.util.JavaUtils;
import org.apache.axis2.addressing.AddressingConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.OperationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.om.OMNamespace;

public final class fileupload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("org.apache.commons.fileupload");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.axis2.transport.http.HttpTransportProperties");
    _jspx_imports_classes.add("org.apache.axiom.soap.SOAP11Constants");
    _jspx_imports_classes.add("java.net.URL");
    _jspx_imports_classes.add("org.apache.axiom.om.OMText");
    _jspx_imports_classes.add("javax.xml.stream.XMLInputFactory");
    _jspx_imports_classes.add("org.apache.commons.fileupload.servlet.ServletFileUpload");
    _jspx_imports_classes.add("org.apache.axis2.Constants");
    _jspx_imports_classes.add("org.apache.axis2.addressing.AddressingConstants");
    _jspx_imports_classes.add("org.apache.axis2.client.Options");
    _jspx_imports_classes.add("org.apache.axis2.addressing.EndpointReference");
    _jspx_imports_classes.add("org.apache.commons.codec.binary.Base64");
    _jspx_imports_classes.add("org.apache.axiom.soap.SOAPEnvelope");
    _jspx_imports_classes.add("javax.xml.stream.XMLStreamReader");
    _jspx_imports_classes.add("org.apache.axiom.om.OMNamespace");
    _jspx_imports_classes.add("java.lang.String");
    _jspx_imports_classes.add("org.apache.axis2.util.JavaUtils");
    _jspx_imports_classes.add("org.apache.axiom.om.OMElement");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("org.apache.axis2.context.OperationContext");
    _jspx_imports_classes.add("org.apache.axiom.soap.SOAP12Constants");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("org.apache.axis2.transport.http.HTTPConstants");
    _jspx_imports_classes.add("org.apache.commons.httpclient.protocol.ProtocolSocketFactory");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.apache.commons.fileupload.disk.DiskFileItemFactory");
    _jspx_imports_classes.add("java.io.StringReader");
    _jspx_imports_classes.add("org.apache.axis2.client.ServiceClient");
    _jspx_imports_classes.add("org.apache.axis2.description.WSDL2Constants");
    _jspx_imports_classes.add("org.apache.axiom.om.OMAbstractFactory");
    _jspx_imports_classes.add("org.apache.axiom.om.impl.builder.StAXOMBuilder");
    _jspx_imports_classes.add("org.apache.commons.httpclient.protocol.Protocol");
    _jspx_imports_classes.add("org.apache.axiom.om.OMFactory");
    _jspx_imports_classes.add("org.apache.axis2.AxisFault");
    _jspx_imports_classes.add("org.apache.axis2.context.MessageContext");
    _jspx_imports_classes.add("java.io.InputStream");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/plain");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

boolean isMultipart = ServletFileUpload.isMultipartContent(request);
if (!isMultipart) {
} else {
    FileItemFactory factory = new DiskFileItemFactory();
    ServletFileUpload upload = new ServletFileUpload(factory);
    List items = null;
    String packageName = null;
    try {
        items = upload.parseRequest(request);
    } catch (FileUploadException e) {
        e.printStackTrace();
    }
    Iterator itr = items.iterator();
    while (itr.hasNext()) {
        FileItem item = (FileItem) itr.next();
        if (item.isFormField()) {
            if(item.getFieldName().equals("fileName")){
                packageName = item.getString();
            }
        } else {
            try {
                String itemName = item.getName();
                String extension = itemName.toLowerCase();
                if(extension.endsWith(".zip")){
                    long  size = item.getSize();
                    InputStream is = item.getInputStream();
                    byte[] bytes = new byte[(int)size];
                    int offset = 0;
                    int numRead = 0;
                    while (offset < bytes.length
                        && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
                        offset += numRead;
                    }
                    if (offset < bytes.length) {
                        out.println("Overflow Error Occurred!");
                    }else{
                        if(!Base64.isArrayByteBase64(bytes)){
                            byte[] encodedBytes  = Base64.encodeBase64(bytes);
                            String encodedString = new String(encodedBytes);
                            Options opts = new Options();
                            opts.setAction("http://www.apache.org/ode/deployapi/DeploymentPortType/deployRequest");
                            opts.setSoapVersionURI(SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
                            opts.setProperty(Constants.Configuration.HTTP_METHOD,
                                Constants.Configuration.HTTP_METHOD_POST);
                            URL requestURL = new URL(request.getRequestURL().toString());
                            URL endpointURL = new URL(requestURL, "processes/DeploymentService");
                            opts.setTo(new EndpointReference(endpointURL.toString()));
                            OMElement payload = null;
                            OMFactory omFactory = OMAbstractFactory.getOMFactory();
                            OMNamespace ns = omFactory.createOMNamespace("http://www.apache.org/ode/pmapi","p");
                            payload = omFactory.createOMElement("deploy", ns);
                            OMElement name = omFactory.createOMElement("name", ns);
                            OMElement packageCont = omFactory.createOMElement("package", ns);
                            OMElement zipEle = omFactory.createOMElement("zip", ns);
                            if(packageName != null && encodedString != null){
                                OMText nameText = omFactory.createOMText(name, packageName);
                                OMText packageText = omFactory.createOMText(zipEle, encodedString);
                                packageCont.addChild(zipEle);
                                payload.addChild(name);
                                payload.addChild(packageCont);

                                //creating service client
                                ServiceClient sc = new ServiceClient();
                                sc.setOptions(opts);

                                try {
                                    //invoke service
                                    OMElement responseMsg = sc.sendReceive(payload);
                                    String body = responseMsg.toString();
                                    if(body.indexOf("name") > 0){
                                        out.println("Package deployed successfully!");
                                    }else{
                                        out.println("Package deployement failed!");
                                    }
                                } catch (AxisFault axisFault) {
                                    out.println(axisFault.getMessage());
                                }
                            }else{
                                out.println("No package Name specified!");
                                break;
                            }                            
                        }else{
                            out.println("TODO: Implement Base64 encoded string support!");
                        }
                    }

                }else{
                    out.write("Wrong input format. Inout file must be zip archive!");
                }
            } catch (Exception e) {
                out.println(e);
                out.println("Exception occuured while processing the file upload request!");
            }
        }
    }
}

      out.write('\n');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

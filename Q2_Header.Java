import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.util.*;  
  
public class ShowHeaders extends HttpServlet {  
  
  public void doGet(HttpServletRequest request,  
                    HttpServletResponse response)  
    throws IOException, ServletException {  
      response.setContentType("text/html");  
      PrintWriter out = response.getWriter();  
        
      out.println("HTTP headers sent by your client:<br>");  
        
    Enumeration enum = request.getHeaderNames();  
        while (enum.hasMoreElements()) {  
        String headerName = (String) enum.nextElement();  
        String headerValue = request.getHeader(headerName);  
        out.print("<b>"+headerName + "</b>: ");  
        out.println(headerValue + "<br>");  
      }  
        
  }  
}  
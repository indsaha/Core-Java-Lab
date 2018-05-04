package com.cg;

import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/getDate")
public class DateServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,
							HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h2>");
		
		out.println("Current Date/Time:" + new Date());
		
		out.println("</h2>");
		
		out.println("</body>");
		out.println("</html>");
		
	}
	
}

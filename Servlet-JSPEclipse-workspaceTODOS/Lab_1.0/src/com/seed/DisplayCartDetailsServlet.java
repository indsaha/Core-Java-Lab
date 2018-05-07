package com.seed;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	TODO:1 Make DisplayCartDetailsServlet as a HttpServlet

public class DisplayCartDetailsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] names = req.getParameterValues("Book Name");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<table>");
		
		out.println("<th> Bookname </th>");
		
		for(int i = 0; i<names.length; i++)
		{
			out.println("<tr>");
			out.println("<th>" + names[i] + "</th>");
			out.println("</tr>");
		}
		out.println("</body>");
		out.println("</html>");
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	

//	TODO:2 	Provide call-back method (called by web container) for HTTP request made using HTTP GET method
	
	
//	TODO:3	This method should read products selected by web-client from bookCatelogue.html and 
//					display them in tabular format as html response to the web client.	
}










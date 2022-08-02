package com.servlets.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Validate extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Inside AddditionServlet service method");
		String n1 = req.getParameter("E-Mail");
		String n2 = req.getParameter("Password");
		String result = null;
		if(n1.contentEquals("aab.com")&&(n2.contentEquals("12345")))
		{
			result="User Login succesful";
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.print("<a href=http://localhost:8080/Basic/page.html>Back to Login page</a>");
		}
		else {
			result="Invalid ";
		}
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<center>");
		out.println("<h3>"+ result + "</h3>");
	}}


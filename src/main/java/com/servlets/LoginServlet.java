package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login",name = "LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//print on console		
		System.out.println("login servlet works");
		//print on browser
		PrintWriter writer =resp.getWriter();
		writer.println("<h1>From Servlet</h1>");
		String nameString ="testing";
		writer.println(nameString);
	}
	
}

package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/hi2")
public class Nana3 extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("text/html; charset=UTF-8");
	PrintWriter out = resp.getWriter();
	for(int i=0; i<100; i++) {
		out.println((i+1)+"안녕 :Hello Servlet!!");;
	}
}
}

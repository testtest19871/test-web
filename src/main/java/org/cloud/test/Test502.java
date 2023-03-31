package org.cloud.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = {"/test502"})
public class Test502 extends HttpServlet{

	private static final long serialVersionUID = 6743742936911270103L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		try {
//			Thread.sleep(90 * 1000L);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		resp.getWriter().append("ok");
	}
}

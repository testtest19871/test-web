package org.cloud.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cloud.lang.BaseUtil;

//@WebServlet(urlPatterns = {"/*"})
public class TestNginx extends HttpServlet {

	private static final long serialVersionUID = 6743742936911271103L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url = BaseUtil.getProjectUrl(req) + req.getRequestURI();
		
		String param = req.getQueryString();
		if (BaseUtil.isNotEmpty(param)) {
			url += "?" + param;
		}
		
		resp.getWriter().append(url);
	}
}

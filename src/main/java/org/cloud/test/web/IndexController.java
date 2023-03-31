package org.cloud.test.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.cloud.lang.BaseUtil;

/**
 * @author Cloud
 * @date 2022/8/5 2:15 PM
 */
@WebServlet(urlPatterns = "/*")
public class IndexController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println(BaseUtil.getUrl(req));
        resp.getWriter().println(req.getRequestURI());
        resp.getWriter().println(req.getPathInfo());
        resp.getWriter().println(req.getServletPath());
        resp.getWriter().println(req.getRequestURL());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}

package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class InfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.getOutputStream().println("getLocalName: " + req.getLocalName());
        resp.getOutputStream().println("getLocalAddr: " + req.getLocalAddr());
        resp.getOutputStream().println("getRemoteHost: " + req.getRemoteHost());
        resp.getOutputStream().println("getRemoteAddr: " + req.getRemoteAddr());
        resp.getOutputStream().println("getServerName: " + req.getServerName());
        resp.getOutputStream().flush();
    }

}

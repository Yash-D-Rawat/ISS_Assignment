package com.welcomeApp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session != null) {
            session.invalidate();
        }

        resp.setStatus(HttpServletResponse.SC_OK); // 200
        resp.sendRedirect("login.jsp");
    }
}

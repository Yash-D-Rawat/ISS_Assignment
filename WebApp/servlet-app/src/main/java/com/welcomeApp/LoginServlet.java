package com.welcomeApp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // Validation
        if (username == null || password == null ||
                username.isEmpty() || password.isEmpty()) {

            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST); // 400
            req.setAttribute("error", "Username and password are required");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jsp_servlet_db",
                    "root", "password");

                 PreparedStatement ps = con.prepareStatement(
                         "SELECT id FROM users WHERE username=? AND password=?")) {

                ps.setString(1, username);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    // Auth success
                    HttpSession session = req.getSession(true);
                    session.setAttribute("user", username);

                    resp.setStatus(HttpServletResponse.SC_OK); // 200
                    resp.sendRedirect("welcome.jsp");

                } else {
                    // Auth failed
                    resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // 401
                    req.setAttribute("error", "Invalid credentials");
                    req.getRequestDispatcher("login.jsp").forward(req, resp);
                }
            }

        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR); // 500
            throw new ServletException(e);
        }
    }
}

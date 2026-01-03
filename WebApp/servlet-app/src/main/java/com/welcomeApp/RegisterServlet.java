package com.welcomeApp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
/*RegisterServlet
 Handles user registration using HTTP POST.
 It validates input, inserts user data into MySQL,
 and sends appropriate HTTP status codes based on outcome.
 */
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // Basic validation
        if (username == null || password == null ||
                username.isEmpty() || password.isEmpty()) {
            // 400 Bad Request indicates client-side input error
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST); // 400
            req.setAttribute("error", "Username and password are required");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jsp_servlet_db",
                    "root", "password");

                 PreparedStatement ps = con.prepareStatement(
                         "INSERT INTO users(username, password) VALUES (?, ?)")) {

                ps.setString(1, username);
                ps.setString(2, password);
                ps.executeUpdate();

                // 201 Created
                resp.setStatus(HttpServletResponse.SC_CREATED);
                resp.sendRedirect("login.jsp");
            }

        } catch (SQLIntegrityConstraintViolationException e) {
            // Duplicate username constraint violated
            resp.setStatus(HttpServletResponse.SC_CONFLICT); // 409
            req.setAttribute("error", "Username already exists");
            req.getRequestDispatcher("register.jsp").forward(req, resp);

        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR); // 500
            throw new ServletException(e);
        }
    }
}

package com.controller;

import java.io.*;
import java.sql.*;

import com.dao.MySql;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class RegisterServlet extends HttpServlet{
//    private static final  String driver = "com.mysql.cj.jdbc.Driver";
//    private static final String url = "jdbc:mysql://localhost:3306/shamim";
//    private static final String userName = "root";
//    private static final String password = "";
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//
//        String name = req.getParameter("user_name");
//        String course = req.getParameter("user_course");
//        String email = req.getParameter("user_email");
//        String age = req.getParameter("user_age");
//
//        try {
//            Class.forName(driver);
//        } catch(ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Connection conn = DriverManager.getConnection(url, userName, password);
//            System.out.println("Connected Succesfully");
//            String myQuery = "INSERT INTO person (name, course, age, email) VALUES (?, ?, ?, ?)";
//            try {
//                PreparedStatement ps = conn.prepareStatement(myQuery);
//                ps.setString(1, name);
//                ps.setString(2, course);
//                ps.setString(3, age);
//                ps.setString(4, email);
//                ps.executeUpdate();
//
//                out.println("<html><body>");
//                out.println("<h1>"+name+"</h1>");
//                out.println("<h1>"+course+"</h1>");
//                out.println("Inserted Successfully</body></html>");
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        } catch(SQLException e) {
//            e.printStackTrace();
//        }

        //RequestDispatcher rd = req.getRequestDispatcher("DispatchedServlet");
        //rd.forward(req, resp);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("user_name");
        String course = req.getParameter("user_course");
        String email = req.getParameter("user_email");
        String age = req.getParameter("user_age");

        MySql ob = new MySql(name, email, course, age);

        out.println("<html><body>");
        out.println("<h1>"+name+"</h1>");
        out.println("<h1>"+course+"</h1>");
        out.println("<h1>"+email+"</h1>");
        out.println("<h1>"+age+"</h1>");
        out.println("Inserted Successfully</body></html>");

    }
}
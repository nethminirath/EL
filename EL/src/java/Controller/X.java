/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Modal.User;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author vihan
 */
@WebServlet(name = "X", urlPatterns = {"/X"})
public class X extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //        resp.sendRedirect("index.jsp?name=vihan");

        User u = new User();
        u.setId(1);
        u.setMobile("0701896481");
        u.setName("Vihanga Nethmini");
        
        req.setAttribute("user", u);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
        
    }
    
}

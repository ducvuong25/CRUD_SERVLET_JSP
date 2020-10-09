/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.controller;

import demo.model.User;
import demo.service.UserService;
import demo.service.UserServiceImpl.UserServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ducvuong25
 */
@WebServlet(name = "AddUserServlet", urlPatterns = {"/AddUser"})
public class AddUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String userName = req.getParameter("userName");
         String password = req.getParameter("password");
         String email =   req.getParameter("email");
         String role = req.getParameter("role");
         User user = new User(userName, password, email, role);
         UserService userService = new UserServiceImpl();
         userService.addUser(user);
        resp.sendRedirect("ListUser");
       

    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("adduser.jsp");

    }

}

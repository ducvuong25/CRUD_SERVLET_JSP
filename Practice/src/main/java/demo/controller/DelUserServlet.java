/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.controller;

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
@WebServlet(name = "DelUserServlet", urlPatterns = {"/Delete"})
public class DelUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        int id = Integer.parseInt(req.getParameter("id"));
        userService.deleteUser(id);
        resp.sendRedirect("ListUser");
    }


}

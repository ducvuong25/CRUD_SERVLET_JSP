/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.controller;

import demo.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import demo.service.UserService;
import demo.service.UserServiceImpl.UserServiceImpl;

/**
 *
 * @author ducvuong25
 */
@WebServlet(name = "Searchservlet", urlPatterns = {"/Search"})
public class Searchservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");

        UserService userService = new UserServiceImpl();
        User user  = userService.getUserByUserName(userName);
        if (user != null) {
            req.setAttribute("user",user);
        }else {
            String message = "User name not found!";
            req.setAttribute("message", message);
        }

        getServletContext().getRequestDispatcher("/Search.jsp").forward(req, resp);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import demo.model.User;
import demo.service.UserService;
import demo.service.UserServiceImpl.UserServiceImpl;

/**
 *
 * @author ducvuong25
 */
@WebServlet(name = "DeleteServlet", urlPatterns = {"/Delete"})
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        UserService userService = new UserServiceImpl();
        userService.deleteUser(id);
        getServletContext().getRequestDispatcher("/Admin").forward(req, resp);

    }

}

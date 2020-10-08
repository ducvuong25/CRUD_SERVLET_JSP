/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.controller;

import demo.DAO.UserDAOImpl.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import demo.service.UserService;
import demo.service.UserServiceImpl.UserServiceImpl;
import demo.model.User;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ducvuong25
 */
@WebServlet(name = "EditServlet", urlPatterns = {"/Edit"})
public class EditServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String role = req.getParameter("role");

        User user = new User(id, userName, password, email, role);

        UserService userService = new UserServiceImpl();
        userService.updateUser(user);
        getServletContext().getRequestDispatcher("/Admin").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        UserService userService = new UserServiceImpl();
        User user = userService.getUser(id);
        req.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/EditUser.jsp").forward(req, resp);
    }
}

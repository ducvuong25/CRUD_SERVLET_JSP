package demo.controller;

import demo.model.User;
import demo.service.UserService;
import demo.service.UserServiceImpl.UserServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ducvuong25
 */
@WebServlet(name = "ListUserServlet", urlPatterns = {"/ListUser"})
public class ListUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dao vao doPOST");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        List<User> users = userService.getAllUser();
        req.setAttribute("users", users);

        getServletContext().getRequestDispatcher("/listuser.jsp").forward(req, resp);

    }

}

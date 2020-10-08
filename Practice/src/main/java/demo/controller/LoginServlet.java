package demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import demo.model.User;
import demo.service.UserServiceImpl.UserServiceImpl;
import demo.service.UserService;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ducvuong25
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String url = "";

        UserService userService = new UserServiceImpl();
        boolean isMatch = userService.checkLogin(userName, password);
        if (isMatch) {
            HttpSession session = req.getSession();
            session.setAttribute("userName", userName);
            url = "/Admin";
            req.getServletContext().getRequestDispatcher(url).forward(req, resp);
        } else {
            String message = "Wrong UserName or Email, please try again";
            req.setAttribute("message", message);
            url = "/login.jsp";
            req.getServletContext().getRequestDispatcher(url).forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}

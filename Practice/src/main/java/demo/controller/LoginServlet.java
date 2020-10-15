package demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import demo.service.UserService;
import demo.service.UserServiceImpl.UserServiceImpl;
import demo.model.User;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        UserService userService = new UserServiceImpl();
        String url = "";
        boolean isMatch = userService.checkLogin(userName, password);

        if (isMatch) {
            User user = userService.getUserByUserName(userName);
            url = "/wellcome.jsp";
            HttpSession session = req.getSession();
            session.setAttribute("user", user);

//            session.setMaxInactiveInterval(30);
        } else {
            url = "/login.jsp";
            String message = "wrong user Name or password, try again!";
            req.setAttribute("message", message);

        }
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }

}

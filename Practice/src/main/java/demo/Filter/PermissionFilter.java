/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.Filter;

import demo.model.User;
import demo.service.UserService;
import demo.service.UserServiceImpl.UserServiceImpl;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ducvuong25
 */
@WebFilter(filterName = "Permission", urlPatterns = {"/ListUser", "/Delete", "/AddUser", "/Edit"})
public class PermissionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpRespone = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            httpRespone.sendRedirect("/");
        } else {
            String role = user.getRole();
            if (role.equals("admin")) {
                chain.doFilter(httpRequest, httpRespone);
            } else {
                httpRespone.sendRedirect("accessDenied.jsp");
            }
        }

        //check xem user da login hay chua: neu chua thi thi secsion user se empty thi ==> return login.jsp
        // neu da login roi thi save save userName and roll (Bước này kiểm tra ở bên sẻvlet)
        // get roll
        //check rool neu roll la admin thi di tiep, neu reol la 
    }

    @Override
    public void destroy() {
    }

}

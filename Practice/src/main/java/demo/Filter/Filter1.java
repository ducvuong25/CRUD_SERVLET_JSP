/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.Filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
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
@WebFilter(filterName = "Filter1", urlPatterns = {"/*"}, dispatcherTypes = {DispatcherType.REQUEST})
public class Filter1 implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpRespone = (HttpServletResponse) response;
        
        String servletPath = httpRequest.getServletPath();


        if (servletPath.equals("/login.jsp") || servletPath.equals("/Login")) {
            chain.doFilter(httpRequest, httpRespone);
        } else {
            HttpSession session = httpRequest.getSession(false);
            if (session == null) {
                httpRespone.sendRedirect("login.jsp");
            } else {
                chain.doFilter(httpRequest, httpRespone);

            }
        }
    }

    @Override
    public void destroy() {
        this.filterConfig = null;
    }

}

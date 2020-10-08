/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.controller;

import demo.ConnectionUtil.ConnectionUtil;
import demo.model.User;
import demo.service.UserService;
import demo.service.UserServiceImpl.UserServiceImpl;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {

    public static void main(String[] args) {
        try {
            UserService userService = new UserServiceImpl();
            Connection c = ConnectionUtil.getConnection();
            String preparedSQL = "select * from user where username = ? and password = ? ";
            PreparedStatement ps = c.prepareStatement(preparedSQL);
            ps.setString(1, "ducvuong25");
            ps.setString(2, "vuong12");
            ResultSet rs = ps.executeQuery();
            System.out.println(rs == null);
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }

    
   
    }
}

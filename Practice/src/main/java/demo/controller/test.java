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
        UserService userService = new UserServiceImpl();
        User user = userService.getUserByUserName("heocon");
        if (user == null) {
            System.out.println("khong tim thay");
        }else {System.out.println("da tim thay user");}
            

    
   
    }
}

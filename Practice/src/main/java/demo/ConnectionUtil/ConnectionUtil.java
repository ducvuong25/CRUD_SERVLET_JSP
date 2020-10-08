package demo.ConnectionUtil;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionUtil {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dburl = "jdbc:mysql://localhost:3306/test";
            String dbUSer = "root";
            String dbPass = "vuong123";

            connection = DriverManager.getConnection(dburl, dbUSer, dbPass);
            return connection;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}

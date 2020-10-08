package demo.DAO.UserDAOImpl;

import demo.DAO.UserDAO;
import demo.model.User;
import demo.ConnectionUtil.ConnectionUtil;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAOImpl implements UserDAO {

    @Override
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        String PreparedSQL = "select * from user";
        Statement st;
        try {
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(PreparedSQL);
            while (rs.next()) {
                int id = rs.getInt(1);
                String userName = rs.getString(2);
                String password = rs.getString(3);
                String email = rs.getString(4);
                String role = rs.getString(5);
                User user = new User(id, userName, password, email, role);
                users.add(user);
            }
            connection.close();
            return users;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public void addUser(User user) {

        try {
            Connection connection = ConnectionUtil.getConnection();
            String preparedSQL = "insert into user value(default,?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(preparedSQL);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getRole());
            ps.executeUpdate();
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void updateUser(User user) {
        try {
            Connection connection = ConnectionUtil.getConnection();
            String preparedSQL = "update user set username = ?, password = ?, email = ?, role = ? where id = ?";
            PreparedStatement ps = connection.prepareStatement(preparedSQL);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getRole());
            ps.setInt(5, user.getId());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            Connection connection = ConnectionUtil.getConnection();
            String preparedSQL = "delete from user where id = ?";
            PreparedStatement ps = connection.prepareStatement(preparedSQL);
            ps.setInt(1, id);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User getUser(int id) {
        User user = null;
        try {
            Connection connection = ConnectionUtil.getConnection();
            String preparedSQl = "select * from user where id = ?";
            PreparedStatement ps = connection.prepareStatement(preparedSQl);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int userID = rs.getInt(1);
                String userName = rs.getString(2);
                String password = rs.getString(3);
                String email = rs.getString(4);
                String role = rs.getString(5);
                user = new User(userID, userName, password, email, role);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

}

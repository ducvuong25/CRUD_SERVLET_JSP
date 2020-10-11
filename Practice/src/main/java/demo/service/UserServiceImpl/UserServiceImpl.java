package demo.service.UserServiceImpl;

import demo.model.User;
import demo.service.UserService;
import demo.DAO.UserDAO;
import demo.DAO.UserDAOImpl.UserDAOImpl;
import java.util.List;
import demo.ConnectionUtil.ConnectionUtil;
import java.sql.*;
import java.util.List;

public class UserServiceImpl implements UserService {

    private static final UserDAO userDAO = new UserDAOImpl();

    @Override
    public List<User> getAllUser() {
        List<User> users = userDAO.getAllUser();
        return users;
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public boolean checkLogin(String userName, String password) {
        List<User> users = getAllUser();
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public User getUser(int id) {
        User user = userDAO.getUser(id);
        return user;
    }

    @Override
    public User getUserByUserName(String userName) {
        List<User> users = getAllUser();
        User user = null;
        for (User u : users) {
            if (u.getUserName().equals(userName)) {
                return u;
            }
        }
        return user;
    }
    

}

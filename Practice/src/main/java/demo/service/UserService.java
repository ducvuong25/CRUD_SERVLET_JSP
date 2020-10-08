package demo.service;

import java.util.List;
import demo.model.User;

public interface UserService {

    List<User> getAllUser();

    User getUser(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    boolean checkLogin(String userName, String password);

}

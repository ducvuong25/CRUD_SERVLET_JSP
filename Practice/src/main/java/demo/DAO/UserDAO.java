package demo.DAO;

import demo.model.User;
import java.util.List;

public interface UserDAO {

    List<User> getAllUser();

    User getUser(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}

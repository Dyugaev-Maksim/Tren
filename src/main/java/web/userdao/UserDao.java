package web.userdao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser();
    void dropUser();
    List<User> getAllUsers();
    List<User> getUsersById();
    void createUsersTable();
    void dropUsersTable();
    void removeUserById(long id);
    void cleanUsersTable();

}

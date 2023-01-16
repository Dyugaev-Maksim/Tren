package web.userdao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;
@Repository
public class UserDaoImp implements UserDao{

    @Override
    public void addUser() {

    }

    @Override
    public void dropUser() {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public List<User> getUsersById() {
        return null;
    }

    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public void cleanUsersTable() {

    }
}

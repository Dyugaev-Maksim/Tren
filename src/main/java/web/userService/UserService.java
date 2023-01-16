package web.userService;

import web.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
    public List<User> getUser(List<User> c, int a) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            users.add(c.get(i));
        }
        return users;
    }
    public List<User> logic (String count1) {
        int count;
        if (count1 == null) {
            count = 5;
        } else {
            count = Integer.parseInt(count1);
        }
        List<User> user1 = Arrays.asList(
                new User("BMW", "Lux", "dsads", "dsad", 123),
                new User("VAZ", "WWW", "dsads", "dsad", 123),
                new User("AUDI", "SSS", "dsads", "dsad", 123),
                new User("OPEL", "TTT", "dsads", "dsad", 123),
                new User("SUZUKI", "Grand Vitara", "dsads", "dsad", 123)
        );
        UserService carService = new UserService();
        List<User> user2 = count >= 5 ? carService.getUser(user1, 5) : carService.getUser(user1, count);
        return user2;
    }
}

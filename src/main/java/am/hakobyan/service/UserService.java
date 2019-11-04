package am.hakobyan.service;

import am.hakobyan.entity.User;

import java.util.List;
import java.util.Queue;

public interface UserService {
    List<User> showAll();
    void createUser(User user);
//    User getById(int id);
    void update(User user);
//    void delete(int id);
}

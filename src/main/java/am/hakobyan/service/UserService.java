package am.hakobyan.service;

import am.hakobyan.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    void saveUser(User user);
    void update(User user);
//    User getById(int id);
//    void delete(int id);
}

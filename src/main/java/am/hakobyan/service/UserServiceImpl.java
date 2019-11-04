package am.hakobyan.service;

import am.hakobyan.data_access.DataAccess;
import am.hakobyan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Queue;

@Service
public class UserServiceImpl implements UserService  {


    @Autowired
    public DataAccess dataAccess;

    @Override
    public List<User> showAll() {
        return dataAccess.showAll();
    }

    @Override
    public void createUser(User user) {
       dataAccess.createUser(user);
    }

    @Override
    public void update(User user) {
        dataAccess.update(user);
    }
    /*@Override
    public User getById(int id) {
        return dataAccess.getById(id);
    }
*/
/*
    @Override
    public void delete(int id) {
        dataAccess.delete(id);
    }*/

}

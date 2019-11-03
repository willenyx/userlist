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

    /*@Override
    public List<User> createUser() {
        return dataAccess.createUser();
    }*/

}

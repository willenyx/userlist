package am.hakobyan.service;

import am.hakobyan.data_access.DataAccess;
import am.hakobyan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class UserServiceImpl implements UserService  {

    @Autowired
    private  DataAccess dataAccess;

    @Override
    public List<User> getAll() {
        return dataAccess.getAll();
    }

    @Override
    public void saveUser(User user) {
       dataAccess.saveUser(user);
    }

    @Override
    public void update(User user) {
        dataAccess.update(user);
    }
}

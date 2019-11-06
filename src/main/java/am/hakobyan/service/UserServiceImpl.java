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


    private final DataAccess dataAccess;

    public UserServiceImpl(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

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
}

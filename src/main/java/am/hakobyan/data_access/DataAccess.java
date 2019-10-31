package am.hakobyan.data_access;

import am.hakobyan.entity.User;

import java.util.List;

public interface DataAccess {

    List<User> showAll();
}

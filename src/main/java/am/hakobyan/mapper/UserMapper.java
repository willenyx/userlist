package am.hakobyan.mapper;

import am.hakobyan.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserMapper implements RowMapper<User> {
    private List<Integer> list = new ArrayList<>();
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User users = new User(list);
        users.setStatus(resultSet.getInt("status"));
        users.setName(resultSet.getString("name"));
        users.setAddress(resultSet.getString("address"));
        users.setEmail(resultSet.getString("email"));
        users.setPassword(resultSet.getString("password"));
        users.setAge(resultSet.getInt("age"));
        return users;
    }
}

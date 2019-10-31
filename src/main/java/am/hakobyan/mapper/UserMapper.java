package am.hakobyan.mapper;

import am.hakobyan.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User users = new User();
        users.setStatus(resultSet.getInt("status"));
        users.setName(resultSet.getString("name"));
        users.setAddress(resultSet.getString("address"));
        users.setEmail(resultSet.getString("email"));
        users.setPassword(resultSet.getString("password"));
        return users;
    }
}

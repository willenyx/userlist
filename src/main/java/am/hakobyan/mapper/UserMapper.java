package am.hakobyan.mapper;

import am.hakobyan.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserMapper implements RowMapper<User> {
    private List<Integer> list = new ArrayList<>();
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User users = new User();
        /*try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");
            String sql = "INSERT INTO data.user(status,name ,address, email, password, age) VALUES (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,user.getStatus());
            preparedStatement.setString(2,user.getName());
            preparedStatement.setString(3,user.getAddress());
            preparedStatement.setString(4,user.getEmail());
            preparedStatement.setString(5,user.getPassword());
            preparedStatement.setInt(6,user.getAge());
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        users.setStatus(resultSet.getInt("status"));
        users.setName(resultSet.getString("name"));
        users.setAddress(resultSet.getString("address"));
        users.setEmail(resultSet.getString("email"));
        users.setPassword(resultSet.getString("password"));
        users.setAge(resultSet.getInt("age"));
        return users;
    }
}

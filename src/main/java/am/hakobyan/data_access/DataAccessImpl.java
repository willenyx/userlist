package am.hakobyan.data_access;

import am.hakobyan.entity.User;
import am.hakobyan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DataAccessImpl implements DataAccess {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public DataAccessImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> showAll() {
        String sql = "SELECT * FROM  data.user ";
        return  jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void createUser(User user) {
        /*try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");

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
        String sql = "INSERT INTO data.user(status,name ,address, email, password, age) VALUES (?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                user.getStatus(),
                user.getName(),
                user.getAddress(),
                user.getEmail(),
                user.getPassword(),
                user.getAge()
                );

    }

    @Override
    public void update(User user) {
        String sql = "UPDATE data.user SET name=?, address = ?, email = ?,password = ?, age = ? WHERE status=?";
        jdbcTemplate.update(sql,user.getName(),user.getAddress(),
                user.getEmail(),user.getPassword() , user.getAge());
    }
}

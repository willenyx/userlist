package am.hakobyan.data_access;

import am.hakobyan.entity.User;
import am.hakobyan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DataAccessImpl implements DataAccess {

    public  JdbcTemplate jdbcTemplate;


    public DataAccessImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);

    }

    @Override
    public List<User> getAll() {
        String sql = "SELECT * FROM  data.user ";
        return  jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void saveUser(User user) {

        String sql = "INSERT INTO users.list(status,name ,address, email, password, age) VALUES (?,?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getStatus(), user.getName(), user.getAddress(),
                user.getEmail(), user.getPassword(), user.getAge()
        );

    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET name=?, address = ?, email = ?,password = ?, age = ? WHERE status=?";
        jdbcTemplate.update(sql,user.getStatus(),user.getName(),user.getAddress(),
                user.getEmail(),user.getPassword() , user.getAge());
    }
}

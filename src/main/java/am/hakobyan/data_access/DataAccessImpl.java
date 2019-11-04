package am.hakobyan.data_access;

import am.hakobyan.entity.User;
import am.hakobyan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.util.List;


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
        String sql = "INSERT INTO data.user(status, name, address, email, password, age) values (?,?,?,?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getAddress(),user.getAge(),user.getEmail(),user.getPassword(),
                             user.getStatus());
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE data.user SET name=?, address = ?,email = ?,password = ?, age = ? WHERE status=?";
        jdbcTemplate.update(sql,user.getName(),user.getAddress(),user.getAge(),user.getStatus());
    }
   /* @Override
    public User getById(int status) {
        String sql  = "SELECT * FROM data.user WHERE status=?";
        return jdbcTemplate.queryForObject(sql,new UserMapper(),status);
    }
*/

   /* @Override
    public void delete(int status) {
        String sql = "DELETE FROM data.user WHERE status=? ";
        jdbcTemplate.update(sql,status);

    }*/


}

package am.hakobyan.data_access;

import am.hakobyan.entity.User;
import am.hakobyan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DataAccessImpl implements DataAccess {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public DataAccessImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> showAll() {
        String sql = "select * from  data.user ";
        return  jdbcTemplate.query(sql, new UserMapper());
    }
}

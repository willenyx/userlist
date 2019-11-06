package am.hakobyan.config;

import am.hakobyan.data_access.DataAccess;
import am.hakobyan.data_access.DataAccessImpl;
import am.hakobyan.service.UserService;
import am.hakobyan.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"am.hakobyan.data_access" ,"am.hakobyan.service"})
public class SpringConfig  {

    @Bean
    public JdbcTemplate getJdbcTemplate()  {
        return new JdbcTemplate(getDataSource());

    }
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306");//
        dataSource.setUsername("root");
        dataSource.setPassword("password#");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

}

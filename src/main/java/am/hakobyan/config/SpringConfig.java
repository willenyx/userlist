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
    public UserService getUserService(){
        return new UserServiceImpl();
    }


    @Bean
    public DataAccess getDataAccessImpl() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/users?userSll=false&createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("password#");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return new DataAccessImpl(dataSource);
    }

}

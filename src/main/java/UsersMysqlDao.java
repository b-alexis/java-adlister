import com.codeup.adlister.dao.Config;
import com.codeup.adlister.dao.Users;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsersMysqlDao implements Users {
    private Connection connection = null;


    public UsersMysqlDao(Config config) {
    } try

    {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()

        );
    } catch (SQLException e) {
        throw new RuntimeException(" ", e);
    }
}

public User first(){
    String query = "SELECT * FROM users LIMI"
}
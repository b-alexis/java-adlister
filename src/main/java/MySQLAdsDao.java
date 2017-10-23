import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    Connection connection = null;

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword()

            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> all() {
        return all(0L);
    }

    @Override
    public List<Ad> all(Long id) {
        String query = "SELECT * FROM users";
        if (id > 0) {
            query += " WHERE id = " + id;
        }
        List<User> users = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                users.add(
                        new User(rs.getString("url"), rs.getString("user"), rs.getString("password"))
                );
            }
catch (SQLException e){
                e.printStackTrace();
            }
            return users;
        }

        @Override
        public Long insert (Ad ad){
            return null;
        }
    }
}

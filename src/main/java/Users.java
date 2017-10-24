
package interfaces;
import com.codeup.adlister.models.User;

import java.util.List;

public interface Users {
    List<User> all(Long id);

    List<User> all();

    Long insert(User user);
}


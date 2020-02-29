import java.util.Arrays;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    List<User> userList;

    public UserDAOImpl() {
        this.userList = Arrays.asList(
                new User("admin", "admin"),
                new User("user", "user"),
                new User("guest", "guest")
        );

    }

    public User getUserByUsername(String name) throws Exception {
        return userList.stream().filter(u->u.getName().equals(name)).findAny().orElse(null);
    }
}

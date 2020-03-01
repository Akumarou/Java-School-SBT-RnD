public class UserService {
    private UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }
    public boolean checkUserPresence(User user) throws Exception {
        return dao.getUserByUsername(user.getName())!=null;
    }
}

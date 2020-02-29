import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.*;

public class UserServiceTest {
    @Mock
    private UserDAO dao;
    private UserService userService;

    public UserServiceTest(){
        MockitoAnnotations.initMocks(this);
        this.userService = new UserService(dao);
    }

    @Test
    public void checkUserPresence_should_return_true() throws Exception {
        given(dao.getUserByUsername("user")).willReturn(new User("user"));
        assertThat(userService.checkUserPresence(new User("user"))).isTrue();
    }
}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;
public class UserDAOTest {


    private UserDAO dao;

    @Before
    public void setUp() throws Exception {
        this.dao = new UserDAOImpl();
    }

    @Test
    public void getUserByUsername_Return_True() throws Exception {
        assertThat(dao.getUserByUsername("user")).isNotNull();
        assertThat(dao.getUserByUsername("user").getName()).isEqualTo("user");
    }
    @Test
    public void getUserByUsername_NULL() throws Exception {
        assertThat(dao.getUserByUsername("fuck")).isNull();
    }
}
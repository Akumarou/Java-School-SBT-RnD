package API.ConnectionData;

public class H2Connection {
    public static String getJdbcPath() {
        return JDBC_PATH;
    }

    public static String getJdbcUser() {
        return JDBC_USER;
    }

    public static String getJdbcPassword() {
        return JDBC_PASSWORD;
    }

    private static final String JDBC_PATH = "jdbc:h2:tcp://localhost/~/test";
    private static final String JDBC_USER = "SA";
    private static final String JDBC_PASSWORD = "";
}

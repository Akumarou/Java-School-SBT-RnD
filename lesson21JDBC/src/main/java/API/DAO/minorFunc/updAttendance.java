package API.DAO.minorFunc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class updAttendance {
    public static void run(Connection connection, int id_less, int id_stud, int new_id_stud) throws SQLException{
        Statement statement = connection.createStatement();
        statement.execute("update STUDENT_VISITS set id_stud = " + new_id_stud + " where id_stud = " + id_stud + " and id_less=" + id_less + "; ");
        statement.close();
    }
}

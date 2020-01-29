package API.DAO.minorFunc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class insertAttendance {
    public static void run(Connection connection, List<Integer> id_students,int id_less) throws SQLException{
        Statement statement = connection.createStatement();
        for (int stud:id_students) {
            statement.addBatch("insert into STUDENT_VISITS(ID_STUD, ID_LESS) values (" + stud + ", " + id_less + ")");
        }
        statement.executeBatch();
    }
}

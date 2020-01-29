package API.DAO.majorFunc;

import API.DAO.minorFunc.getLessonId;
import API.DAO.minorFunc.getStudentsId;
import API.DAO.minorFunc.insertAttendance;
import API.UserInterface.Output;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class addAttendance {
    public static void run(Connection connection) throws SQLException {
        int id_less = getLessonId.get(connection);
        List<Integer> id_students = getStudentsId.get(connection);
        Output.out("Finishing operation...");
        insertAttendance.run(connection,id_students,id_less);
        Output.out("Success!");
    }
}

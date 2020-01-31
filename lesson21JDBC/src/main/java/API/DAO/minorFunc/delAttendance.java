package API.DAO.minorFunc;

import API.DAO.Model.Attendance;
import API.UserInterface.Output;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class delAttendance {
    public static void run(Connection connection, Attendance att, int...ids) throws SQLException {
        Statement statement = connection.createStatement();
        for(int id:ids){
            if(att.getStudents().contains(id))
                statement.addBatch("delete from STUDENT_VISITS where id_less="+att.getLesson().getId_less()+"and id_stud = " + id +";");
            else {
                Output.out("Error! No such students!");
                return;
            }
        }
        statement.executeBatch();
        statement.close();
    }
}

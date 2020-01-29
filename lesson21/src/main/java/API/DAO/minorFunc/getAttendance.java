package API.DAO.minorFunc;

import API.DAO.Model.Attendance;
import API.DAO.Model.Lesson;
import API.UserInterface.Output;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class getAttendance {
    public static Attendance get(Connection connection, int i) throws SQLException{
        List<Lesson> lessons = Lessons.get(connection,i);
        if(lessons.size()==0){
            Output.out("Error! No such lesson!");
            return null;
        }
        return Journal.getOne(connection, lessons);
    }
}

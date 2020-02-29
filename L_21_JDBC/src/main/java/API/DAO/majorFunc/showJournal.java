package API.DAO.majorFunc;

import API.DAO.minorFunc.Journal;
import API.DAO.minorFunc.Lessons;
import API.DAO.Model.Attendance;
import API.DAO.Model.Lesson;
import API.UserInterface.Output;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class showJournal {
    public static void run(Connection connection) throws SQLException {
        List<Lesson> lessons = Lessons.get(connection);
        List<Attendance> journal = Journal.get(connection, lessons);
        for(Attendance e:journal)
            System.out.println(e.toString());
    }
}

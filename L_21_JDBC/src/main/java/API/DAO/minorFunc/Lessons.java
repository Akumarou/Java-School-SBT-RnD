package API.DAO.minorFunc;

import API.DAO.Model.Lesson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Lessons {
    public static List<Lesson> get(Connection connection) throws SQLException {
        Statement stat = connection.createStatement();
        stat.execute("select * from lessons;");
        ResultSet result = stat.getResultSet();
        List<Lesson> lessons = new ArrayList<Lesson>();
        while (result.next()){
            lessons.add(new Lesson(result.getInt(1),result.getString(2),result.getString(3)));
        }
        result.close();
        stat.close();
        return lessons;
    }
    public static List<Lesson> get(Connection connection, int i) throws SQLException {
        Statement stat = connection.createStatement();
        stat.execute("select * from lessons where id_less = "+i+";");
        ResultSet result = stat.getResultSet();
        List<Lesson> lessons = new ArrayList<>();
        while (result.next()){
            lessons.add(new Lesson(result.getInt(1),result.getString(2),result.getString(3)));
        }
        result.close();
        stat.close();
        return lessons;
    }
}

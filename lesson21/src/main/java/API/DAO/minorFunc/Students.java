package API.DAO.minorFunc;

import API.DAO.Model.Lesson;
import API.DAO.Model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Students {
    public static List<Student> get(Connection connection) throws SQLException {
        Statement stat = connection.createStatement();
        stat.execute("select * from students;");
        ResultSet result = stat.getResultSet();
        List<Student> students = new ArrayList<>();
        while (result.next()){
            students.add(new Student(result.getInt(1),result.getString(2),result.getString(3)));
        }
        result.close();
        stat.close();
        return students;
    }
}

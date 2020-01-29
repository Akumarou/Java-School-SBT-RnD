package API.DAO.minorFunc;

import API.DAO.Model.Attendance;
import API.DAO.Model.Lesson;
import API.DAO.Model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    public static List<Attendance> get(Connection connection, List<Lesson> lessons) throws SQLException{
        Statement stat = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE,
                ResultSet.HOLD_CURSORS_OVER_COMMIT);
        stat.execute("select students.id_stud,name,surname,lessons.id_less from " +
                "lessons join " +
                "(students join student_visits on " +
                "students.id_stud = student_visits.id_stud) " +
                "on lessons.id_less = student_visits.id_less;");
        ResultSet result = stat.getResultSet();
        List<Attendance> journal = new ArrayList<>();
        for (Lesson lesson: lessons) {
            ArrayList<Student> students = new ArrayList<>();
            result.beforeFirst();
            while(result.next()){
                if(result.getInt(4)==lesson.getId_less())students.add(new Student(result.getInt(1),result.getString(2),result.getString(3)));
            }
            journal.add(new Attendance(lesson,students));
        }
        return journal;
    }
    public static Attendance getOne(Connection connection, List<Lesson> lessons) throws SQLException{
        Statement stat = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE,
                ResultSet.HOLD_CURSORS_OVER_COMMIT);
        stat.execute("select students.id_stud,name,surname,lessons.id_less from " +
                "lessons join " +
                "(students join student_visits on " +
                "students.id_stud = student_visits.id_stud) " +
                "on lessons.id_less = student_visits.id_less;");
        ResultSet result = stat.getResultSet();
        Attendance journal=null;
        for (Lesson lesson: lessons) {
            ArrayList<Student> students = new ArrayList<>();
            result.beforeFirst();
            while(result.next()){
                if(result.getInt(4)==lesson.getId_less())students.add(new Student(result.getInt(1),result.getString(2),result.getString(3)));
            }
            journal=new Attendance(lesson,students);
        }
        return journal;
    }
}

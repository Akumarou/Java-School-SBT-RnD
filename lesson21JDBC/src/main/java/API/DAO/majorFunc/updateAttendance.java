package API.DAO.majorFunc;

import API.DAO.Model.Attendance;
import API.DAO.Model.Student;
import API.DAO.minorFunc.Students;
import API.DAO.minorFunc.getAttendance;
import API.DAO.minorFunc.updAttendance;
import API.UserInterface.Output;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Collectors;

public class updateAttendance {
    public static void run(Connection connection,int id_less,int id_stud, int new_id_stud) throws SQLException{

        if(!Students.get(connection).stream().map(Student::getId_stud).collect(Collectors.toList()).contains(new_id_stud)){
            Output.out("Error! No such student! Cannot set new id");
            return;
        }

        Attendance att = getAttendance.get(connection,id_less);

        if(!att.getStudents().stream().map(Student::getId_stud).collect(Collectors.toList()).contains(id_stud)){
            Output.out("Error! No such student! Cannot find old id");
            return;
        }

        updAttendance.run(connection,id_less,id_stud,new_id_stud);
        Output.out("Success!");
    }
}

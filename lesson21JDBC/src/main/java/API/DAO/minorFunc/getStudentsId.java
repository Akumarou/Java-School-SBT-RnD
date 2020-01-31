package API.DAO.minorFunc;

import API.DAO.Model.Student;
import API.UserInterface.Input;
import API.UserInterface.Output;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class getStudentsId {
    public static List<Integer> get(Connection connection) throws SQLException{
        List<Integer> ids_students = Students.get(connection).stream().map(Student::getId_stud).collect(Collectors.toList());
        List<Integer> id_students = new ArrayList<>();
        int id_stud=0;
        while (true){
            Output.out("Student ID: ");
            id_stud = Input.integer();
            if(id_stud==0){
                return id_students;
            }
            if(ids_students.contains(id_stud)) id_students.add(id_stud);
            else {
                Output.out("Error! No such student!");
                continue;
            }
            Output.out("(Press 0 to finish operation)");
        }
    }
}

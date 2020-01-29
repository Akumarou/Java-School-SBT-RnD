package API.DAO.minorFunc;

import API.DAO.Model.Lesson;
import API.UserInterface.Input;
import API.UserInterface.Output;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class getLessonId {
    public static int get(Connection connection) throws SQLException{
        List<Integer> ids_lessons = Lessons.get(connection).stream().map(Lesson::getId_less).collect(Collectors.toList());
        while (true){
            Output.out("Lesson ID: ");
            int id_less = Input.integer();
            if(ids_lessons.contains(id_less))
                return id_less;
            else Output.out("Error! No such lesson!");
        }
    }
}

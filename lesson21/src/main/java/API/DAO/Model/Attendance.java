package API.DAO.Model;

import java.util.ArrayList;

public class Attendance {
    private Lesson lesson;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Lesson getLesson() {
        return lesson;
    }

    private ArrayList<Student> students;
    public Attendance(Lesson lesson, ArrayList<Student> students) {
        this.lesson = lesson;
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(lesson + "\n--->Students: ");

        if (students.size()==0) {
            return result.toString() + "none";
        }
        result.append(students.size() + "\n");
        for (Student stud: students) {
            result.append("--->" + stud + "\n");
        }
        return result.toString();
    }
}

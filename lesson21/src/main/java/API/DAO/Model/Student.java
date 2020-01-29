package API.DAO.Model;

public class Student {
    private int id_stud;
    private String name;
    private String surname;

    public Student(int id_stud, String name, String surname) {
        this.id_stud = id_stud;
        this.name = name;
        this.surname = surname;
    }

    public int getId_stud() {
        return id_stud;
    }

    public void setId_stud(int id_stud) {
        this.id_stud = id_stud;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "(id: " + id_stud + ") " + name + " " + surname;
    }
}

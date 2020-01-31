package API.DAO.Model;

public class Lesson {
    int id_less;
    String name;
    String date;

    @Override
    public String toString() {
        return "Lesson '" + name + "' (id: " + id_less + "|Date: "+ date + ")";
    }

    public int getId_less() {
        return id_less;
    }

    public void setId_less(int id_less) {
        this.id_less = id_less;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Lesson(int id_less, String name, String date) {
        this.id_less = id_less;
        this.name = name;
        this.date = date;
    }
}

package API.main;

import API.ConnectionData.H2Connection;
import API.DAO.majorFunc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JournalDB {
    private Connection connection;

    public JournalDB() throws SQLException {
        this.connection = DriverManager
                .getConnection(H2Connection.getJdbcPath(),
                        H2Connection.getJdbcUser(),
                        H2Connection.getJdbcPassword());
    }

    public void showJournal() throws SQLException {
        showJournal.run(connection);
    }

    public void addAttendance() throws SQLException {
        addAttendance.run(connection);
    }

    public void findAttendance(int i) throws SQLException {
        findAttendance.run(connection, i);
    }

    public void deleteAttendance(int i, int... ids) throws SQLException {
        deleteAttendance.run(connection, i, ids);
    }

    public void updateAttendance(int id_less, int id_stud, int new_id_stud) throws SQLException {
        updateAttendance.run(connection, id_less, id_stud, new_id_stud);
    }
}

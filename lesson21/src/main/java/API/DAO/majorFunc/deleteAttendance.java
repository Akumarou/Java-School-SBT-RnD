package API.DAO.majorFunc;

import API.DAO.Model.Attendance;
import API.DAO.minorFunc.delAttendance;
import API.DAO.minorFunc.getAttendance;
import API.UserInterface.Output;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteAttendance {
    public static void run(Connection connection, int i,int...ids) throws SQLException{
        delAttendance.run(connection,getAttendance.get(connection,i),ids);
        Output.out("Success!");
    }
}

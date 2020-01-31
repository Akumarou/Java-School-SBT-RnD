package API.DAO.majorFunc;


import API.DAO.minorFunc.getAttendance;
import API.UserInterface.Output;

import java.sql.Connection;
import java.sql.SQLException;


public class findAttendance {
    public static void run(Connection connection, int i) throws SQLException{
        Output.out(getAttendance.get(connection,i).toString());
    }
}

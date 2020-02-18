package LibraryManagementSystem;

import java.sql.*;

public class EmployeeDatabase {
    public boolean checkForEmployeeInTheDatabase(Connection connection,int id) throws SQLException {
        boolean isPresent = false;
        String sql = "select * from employeerecord where sid = "+ id;
/*
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
*/
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if ( resultSet.next())
        {
            isPresent=true;
        }
        return isPresent;

    }
}
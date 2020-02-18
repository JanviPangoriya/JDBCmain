package LibraryManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionaToDatabase {
    public static  Connection connection = null;
    public boolean attemptConnection() throws SQLException {
        boolean isConnected = false;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","");
        if (connection!=null)
        {
            isConnected=true;
        }
        return isConnected;
    }

    public static Connection getConnection() {
        return connection;
    }
}

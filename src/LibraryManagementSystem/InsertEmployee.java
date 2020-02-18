package LibraryManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployee {
    public int insertEmployee(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.nextLine().trim();
        String sql = "INSERT INTO employeerecord(SID, NAME) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        int rowaffected = preparedStatement.executeUpdate();
        return rowaffected;
    }
}

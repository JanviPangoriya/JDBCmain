package LibraryManagementSystem;

import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        ConnectionaToDatabase connectionaToDatabase = new ConnectionaToDatabase();
        if(connectionaToDatabase.attemptConnection())
        {
            System.out.println("Connection is Ok");
        }
        else
        {
            System.out.println("COnnection is failed, Check URL , USERNAME AND pASWORD and then TRY AGAIN !!!!");
        }
        InsertEmployee insertEmployee = new InsertEmployee();
        System.out.println("ROW AFFECTED "+ insertEmployee.insertEmployee(connectionaToDatabase.getConnection()) );
        /*System.out.println("Your are a employee or student");
        String who = scanner.nextLine();
        if (who.toLowerCase()=="employee")
        {
            System.out.println("Please enter your id and password");
            int id = scanner.nextInt();
            int password = scanner.nextInt();
            EmployeeDatabase employeeDatabase = new EmployeeDatabase();
            if (employeeDatabase.checkForEmployeeInTheDatabase(connectionaToDatabase.getConnection(),id))
            {


            }
        }
        System.out.println("enter roll number plz");

        int rollnumber = scanner.nextInt();
*/
    }
}

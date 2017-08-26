package garage.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
   
    public static void connect(String name, String password) {
        try {
            String host = "jdbc:mysql://localhost:3306/garage";
            Connection con = DriverManager.getConnection(host, name, password);
            System.out.print(con);
        } catch(SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}

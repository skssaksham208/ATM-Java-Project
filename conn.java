import java.sql.*;

public class conn {

    Connection c;
    Statement s;
    conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver"); 
             // Connect to database (database = hotelmanagementsystem, user = root, password = Saksham@208)
             
            c = DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem", "root", "Saksham@208");

            // Create a statement
            s = c.createStatement();

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new conn();
    }
}

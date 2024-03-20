import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseAccess {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/srinu";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "21b21a42b3";

    public static void main(String[] args) {
        // Establishing the connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            if (connection != null) {
                System.out.println("Connected to the database!");

                // Perform your database operations here

            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}

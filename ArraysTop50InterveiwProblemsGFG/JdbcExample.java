package ArraysTop50InterveiwProblemsGFG;


import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            // Step 1: Load the JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password"
            );

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Step 5: Process Results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // Step 6: Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

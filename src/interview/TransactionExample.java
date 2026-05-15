package interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        Connection conn = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;

        try {
            conn = DriverManager.getConnection(url, user, password);

            // 1. Disable auto-commit
            conn.setAutoCommit(false);

            // 2. Insert statements
            stmt1 = conn.prepareStatement("INSERT INTO employee(id, name) VALUES (?, ?)");
            stmt1.setInt(1, 101);
            stmt1.setString(2, "Alice");
            stmt1.executeUpdate();

            stmt2 = conn.prepareStatement("INSERT INTO employee(id, name) VALUES (?, ?)");
            stmt2.setInt(1, 102);
            stmt2.setString(2, "Bob");
            stmt2.executeUpdate();

            // 3. Commit only if all succeed
            conn.commit();
            System.out.println("All inserts successful, transaction committed.");

        } catch (SQLException e) {
            e.printStackTrace();
            // 4. Rollback if any exception occurs
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Transaction rolled back due to error.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            // 5. Close resources
            try {
                if (stmt1 != null) stmt1.close();
                if (stmt2 != null) stmt2.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

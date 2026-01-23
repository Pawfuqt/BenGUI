package benigui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BeniGUI {

    private static final String DB_URL = "jdbc:sqlite:voters.db";

    public static Connection connectDB() {
        try {
            // This is the line failing because the JAR is missing
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(DB_URL);
            setupDatabase(conn);
            return conn;
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found! Add the SQLite JAR to your libraries.");
            return null;
        } catch (SQLException e) {
            System.err.println("Database Connection Error: " + e.getMessage());
            return null;
        }
    }

    private static void setupDatabase(Connection conn) {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "username TEXT NOT NULL UNIQUE," +
                     "password TEXT NOT NULL);";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.err.println("Table Creation Error: " + e.getMessage());
        }
    }

    public static boolean validateLogin(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        
        try (Connection con = connectDB()) {
            if (con == null) return false; // Prevent NullPointerException
            
            try (PreparedStatement pst = con.prepareStatement(sql)) {
                pst.setString(1, username);
                pst.setString(2, password);
                try (ResultSet rs = pst.executeQuery()) {
                    return rs.next();
                }
            }
        } catch (SQLException e) {
            System.err.println("Login Query Error: " + e.getMessage());
            return false;
        }
    }
    
    public static boolean registerUser(String username, String password) {
        String sql = "INSERT INTO users(username, password) VALUES(?, ?)";
        
        try (Connection con = connectDB()) {
            if (con == null) return false; // Prevent NullPointerException
            
            try (PreparedStatement pst = con.prepareStatement(sql)) {
                pst.setString(1, username);
                pst.setString(2, password);
                pst.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            // Unique constraint violation (username exists) falls here
            System.err.println("Registration Error: " + e.getMessage());
            return false;
        }
    }
}
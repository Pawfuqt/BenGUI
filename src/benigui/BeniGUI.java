package benigui;

import java.sql.*;

public class BeniGUI {

    // This matches the database name 'voters' from your screenshot
    // It will look for a file named voters.db in your project folder
    private static final String DB_URL = "jdbc:sqlite:voters.db";

    public static Connection connectDB() {
        try {
            // Load the SQLite Driver
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: " + e.getMessage());
            return null;
        }
    }

    public static String validateLoginWithRole(String username, String password) {
        String role = null;
        String sql = "SELECT role FROM users WHERE username=? AND password=?";
        
        try (Connection con = connectDB(); 
             PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setString(1, username);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                role = rs.getString("role"); 
            }
        } catch (Exception e) {
            System.out.println("Login Error: " + e.getMessage());
        }
        return role; 
    }
    
   public static boolean registerUser(String username, String password, String role) {
    String sql = "INSERT INTO users(username, password, role) VALUES(?, ?, ?)";
    
    try (Connection con = connectDB(); 
         PreparedStatement pst = con.prepareStatement(sql)) {
        
        pst.setString(1, username);
        pst.setString(2, password);
        pst.setString(3, role); // You must add this line
        
        pst.executeUpdate();
        return true;
    } catch (SQLException e) {
        System.err.println("Registration Error: " + e.getMessage());
        return false;
    }
    }
}
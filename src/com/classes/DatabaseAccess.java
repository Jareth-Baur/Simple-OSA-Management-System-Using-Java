package com.classes;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class DatabaseAccess {

    private static final String URL = "jdbc:mysql://localhost:3306/OSA_Management_System";
    private static final String USER = "user";
    private static final String PASSWORD = "user";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void viewImportantDetails(JTable table) {
        String query = "SELECT full_name, year, course, offense_type, offense_details FROM students";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {

            // Create table model and set it to the JTable
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Full Name");
            model.addColumn("Year");
            model.addColumn("Course");
            model.addColumn("Offense Type");
            model.addColumn("Offense Details");

            // Populate the table model with data from the ResultSet
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("full_name"),
                    rs.getString("year"),
                    rs.getString("course"),
                    rs.getString("offense_type"),
                    rs.getString("offense_details")
                });
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void displayDetailsOnClick(JTable table, JTextArea textArea) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            String fullName = (String) table.getValueAt(selectedRow, 0); // Assuming full_name is in the first column
            if (fullName != null && !fullName.isEmpty()) {
                displayDetailsByFullName(fullName, textArea);
            } else {
                JOptionPane.showMessageDialog(null, "Error: Full name not found for the selected row.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: No row selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void displayDetailsByFullName(String fullName, JTextArea textArea) {
        String query = "SELECT ID, full_name, year, course, phone_number, offense_type, offense_details "
                + "FROM students WHERE full_name = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, fullName);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    StringBuilder details = new StringBuilder();
                    details.append("ID: ").append(rs.getInt("ID")).append("\n")
                            .append("Full Name: ").append(rs.getString("full_name")).append("\n")
                            .append("Year: ").append(rs.getString("year")).append("\n")
                            .append("Course: ").append(rs.getString("course")).append("\n")
                            .append("Phone Number: ").append(rs.getString("phone_number")).append("\n")
                            .append("Offense Type: ").append(rs.getString("offense_type")).append("\n")
                            .append("Offense Details: ").append(rs.getString("offense_details")).append("\n");

                    textArea.setText(details.toString());
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static Map<String, String> getDetailsByID(int id) {
        Map<String, String> details = new HashMap<>();
        String query = "SELECT ID, full_name, year, course, phone_number, offense_type, offense_details "
                + "FROM students WHERE ID = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    details.put("ID", String.valueOf(rs.getInt("ID")));
                    details.put("Full Name", rs.getString("full_name"));
                    details.put("Year", rs.getString("year"));
                    details.put("Course", rs.getString("course"));
                    details.put("Phone Number", rs.getString("phone_number"));
                    details.put("Offense Type", rs.getString("offense_type"));
                    details.put("Offense Details", rs.getString("offense_details"));
                } else {
                    JOptionPane.showMessageDialog(null, "ID not found", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Error: ID not found");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving data from the database", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error retrieving data from the database. " + e.getMessage());
        }
        return details;
    }

    public static boolean addNewStudent(String fullName, String year, String course, String phoneNumber, String offenseType, String offenseDetails) {
        // Check for blank fields
        if (fullName.isBlank() || year.isBlank() || course.isBlank() || phoneNumber.isBlank() || offenseType.isBlank() || offenseDetails.isBlank()) {
            JOptionPane.showMessageDialog(null, "Error: All fields must be filled.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        // Confirmation message
        int option = JOptionPane.showConfirmDialog(null, "Do you want to add a new student named " + fullName + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement("INSERT INTO students (full_name, year, course, phone_number, offense_type, offense_details) VALUES (?, ?, ?, ?, ?, ?)")) {
                // Set parameters
                pstmt.setString(1, fullName);
                pstmt.setString(2, year);
                pstmt.setString(3, course);
                pstmt.setString(4, phoneNumber);
                pstmt.setString(5, offenseType);
                pstmt.setString(6, offenseDetails);

                // Execute the SQL statement
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "New student " + fullName + " added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("New student " + fullName + " added successfully.");
                    return true; // Return true if addition was successful
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error adding new student: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Error adding new student: " + e.getMessage());
            }
        }
        return false; // Return false if addition was not successful
    }

    public static boolean editStudent(int id, String fullName, String year, String course, String phoneNumber, String offenseType, String offenseDetails) {
        // Confirmation message
        int option = JOptionPane.showConfirmDialog(null, "Do you want to save edit to student\nID: " + id + "\nName: " + fullName + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement("UPDATE students SET full_name = ?, year = ?, course = ?, phone_number = ?, offense_type = ?, offense_details = ? WHERE ID = ?")) {
                // Set parameters
                pstmt.setString(1, fullName);
                pstmt.setString(2, year);
                pstmt.setString(3, course);
                pstmt.setString(4, phoneNumber);
                pstmt.setString(5, offenseType);
                pstmt.setString(6, offenseDetails);
                pstmt.setInt(7, id);

                // Execute the SQL statement
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Student with ID " + id + " edited successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Student with ID " + id + " edited successfully.");
                    return true; // Return true if editing was successful
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error editing student: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Error editing student: " + e.getMessage());
            }
        }
        return false; // Return false if editing was not successful
    }

    public static boolean deleteStudent(int id, String fullName) {
        // Confirmation message
        int option = JOptionPane.showConfirmDialog(null, "Do you want to delete student\nID: " + id + "\nName: " + fullName + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement("DELETE FROM students WHERE ID = ?")) {
                // Set parameter
                pstmt.setInt(1, id);

                // Execute the SQL statement
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Student with ID " + id + " and name " + fullName + " deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Student with ID " + id + " and name " + fullName + " deleted successfully.");
                    return true; // Return true if deletion was successful
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error deleting student: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Error deleting student: " + e.getMessage());
            }
        }
        return false; // Return false if deletion was not successful
    }

    public static Map<String, String> getLatestData() {
        Map<String, String> latestData = new HashMap<>();
        String query = "SELECT ID, full_name, year, course FROM students ORDER BY offense_added DESC LIMIT 1";
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                latestData.put("ID", String.valueOf(rs.getInt("ID")));
                latestData.put("Full Name", rs.getString("full_name"));
                latestData.put("Year", rs.getString("year"));
                latestData.put("Course", rs.getString("course"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return latestData;
    }

    public static int getTotalStudentCount() {
        int totalCount = 0;
        String query = "SELECT COUNT(*) AS total_count FROM students";
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                totalCount = rs.getInt("total_count");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return totalCount;
    }
}

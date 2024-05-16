package com.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddSampleData {

    private static final String URL = "jdbc:mysql://localhost:3306/OSA_Management_System";
    private static final String USER = "user";
    private static final String PASSWORD = "user";

    public static void main(String[] args) {
        String[] fullNames = {
            "John Doe", "Jane Smith", "Robert Brown", "Emily Davis", "Michael Johnson",
            "Linda Martinez", "William Wilson", "Elizabeth Taylor", "David Anderson", "Jennifer Thomas",
            "James Jackson", "Patricia White", "Charles Harris", "Barbara Martin", "Thomas Thompson",
            "Mary Garcia", "Christopher Clark", "Susan Rodriguez", "Daniel Lewis", "Karen Walker"
        };

        String[] years = {"Freshman", "Sophomore", "Junior", "Senior"};
        String[] courses = {"Computer Science", "Mathematics", "Physics", "Chemistry", "Biology"};
        String[] offenseTypes = {"Cheating", "Plagiarism", "Late Submission", "Disrespectful Behavior", "Violation of Rules"};

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String insertSQL = "INSERT INTO students (full_name, year, course, phone_number, offense_type, offense_details) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                for (int i = 0; i < 20; i++) {
                    pstmt.setString(1, fullNames[i % fullNames.length]);
                    pstmt.setString(2, years[i % years.length]);
                    pstmt.setString(3, courses[i % courses.length]);
                    pstmt.setString(4, "555-010" + (i % 10)); // Example phone number
                    pstmt.setString(5, offenseTypes[i % offenseTypes.length]);
                    pstmt.setString(6, "Details of the offense " + (i + 1));
                    pstmt.executeUpdate();
                    System.out.println("Data " + (i + 1) + " inserted successfully!");
                    // Pause execution for a random duration between 5 to 10 seconds
                    int delay = 5000 + (int) (Math.random() * 6000);
                    Thread.sleep(delay);
                }
                System.out.println("Sample data inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Error during sleep: " + e.getMessage());
        }
    }
}

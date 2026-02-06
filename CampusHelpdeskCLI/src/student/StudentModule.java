package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import db.DBConnection;

public class StudentModule {

    public static void menu(Scanner sc) {

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        System.out.print("Issue Type: ");
        String issue = sc.nextLine();

        System.out.print("Description: ");
        String desc = sc.nextLine();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO complaints(student_name, issue_type, description,status) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, issue);
            ps.setString(3, desc);

            ps.executeUpdate();

            System.out.println("Complaint Registered Successfully ✔");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



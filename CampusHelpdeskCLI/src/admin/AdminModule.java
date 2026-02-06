package admin;

import db.DBConnection;
import java.sql.*;

public class AdminModule {

    public static void menu() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM complaints");

            System.out.println("\n---- ALL COMPLAINTS ----");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("complaint_id") + " | " +
                    rs.getString("student_name") + " | " +
                    rs.getString("issue_type") + " | " +
                    rs.getString("status")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

	 
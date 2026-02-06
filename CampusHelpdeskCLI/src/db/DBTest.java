package db;

import java.sql.Connection;

public class DBTest {

    public static void main(String[] args) {

        Connection con = DBConnection.getConnection();

        if (con != null) {
            System.out.println("✅ Database connected successfully babe!");
        } else {
            System.out.println("❌ Database connection failed");
        }
    }
}

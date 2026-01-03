package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentInsert {

    public static void main(String[] args) {

        String sql =
                "INSERT INTO students(name, email, course, fees) VALUES (?,?,?,?)";

        try (
                Connection con = DBUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, "Rahul Sharma");
            ps.setString(2, "rahul@gmail.com");
            ps.setString(3, "Data Science");
            ps.setDouble(4, 75000);

            int rows = ps.executeUpdate();
            System.out.println(rows + " student inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

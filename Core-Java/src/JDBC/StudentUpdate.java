package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentUpdate {

    public static void main(String[] args) {

        String sql =
                "UPDATE students SET fees = ? WHERE id = ?";

        try (
                Connection con = DBUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setDouble(1, 80000);
            ps.setInt(2, 1);

            int rows = ps.executeUpdate();
            System.out.println(rows + " student updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDelete {

    public static void main(String[] args) {

        String sql = "DELETE FROM students WHERE id = ?";

        try (
                Connection con = DBUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, 3);

            int rows = ps.executeUpdate();
            System.out.println(rows + " student deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

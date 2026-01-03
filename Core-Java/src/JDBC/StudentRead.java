package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentRead {

    public static void main(String[] args) {

        String sql = "SELECT * FROM students";

        try (
                Connection con = DBUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("course") + " | " +
                                rs.getDouble("fees")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.endava.jdbc.preparedStatement;

import com.endava.jdbc.connection.PostgresConnection;
import com.endava.jdbc.data.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentFromDB {
    public static Student getStudentById(long id)  {
        try (Connection conn = PostgresConnection.getPostgresConnection();
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("select * from student " +
                     "where id=" + id)) {

            //if the new current row is valid
            if (rs.next()) {
                return extractStudentFromResultSet(rs);
            }
        } catch (SQLException e) {

        }

        return null;
    }

    private static Student extractStudentFromResultSet(ResultSet rs) throws SQLException {
        Student student = new Student();

        student.setId(rs.getLong("id"));
        student.setFirstName(rs.getString("firstname"));
        student.setLastName(rs.getString("lastname"));
        student.setEmail(rs.getString("email"));
        student.setPhoneNumber(rs.getLong("phone"));
        student.setSpecialityId(rs.getLong("speciality"));

        return student;
    }
}


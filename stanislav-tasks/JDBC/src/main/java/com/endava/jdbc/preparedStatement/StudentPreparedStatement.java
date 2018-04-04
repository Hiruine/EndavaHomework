package com.endava.jdbc.preparedStatement;

import com.endava.jdbc.data.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentPreparedStatement {
    public static void addStudent(Student student, Connection conn) {
        String query = "INSERT INTO student ("
                + " id,"
                + " firstname,"
                + " lastname,"
                + " email,"
                + " phone,"
                + " speciality )"
                + " VALUES ("
                + "?, ?, ?, ?, ?, ?)";

        try(PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setLong(1, student.getId());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.setString(4, student.getEmail());
            statement.setLong(5, student.getPhoneNumber());
            statement.setLong(6, student.getSpecialityId());

            statement.executeUpdate();

        } catch (SQLException e) {

        }
    }
}

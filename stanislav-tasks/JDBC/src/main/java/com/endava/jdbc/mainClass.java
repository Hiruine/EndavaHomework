package com.endava.jdbc;


import com.endava.jdbc.connection.DataSourcePostgres;
import com.endava.jdbc.connection.PostgresConnection;
import com.endava.jdbc.data.Speciality;
import com.endava.jdbc.data.Student;
import com.endava.jdbc.preparedStatement.StudentFromDB;
import com.endava.jdbc.preparedStatement.StudentPreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class mainClass {
    public static void main(String[] args)  {
//        try(Connection conn = PostgresConnection.getPostgresConnection()){
//            Student student = new Student(239478501, "MR." , "Robot",
//                    "example@mail.com", 128957, 1523723571);
//            StudentPreparedStatement.addStudent(student, conn);
//        } catch (SQLException e) {
//
//        }


        Student student = StudentFromDB.getStudentById(351251235);
        System.out.println(student);

    }
}

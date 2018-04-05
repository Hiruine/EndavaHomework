package com.endava.jdbc.versions;

import com.endava.jdbc.connection.PostgresConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Committing {

    public void commitVersion() {

        try (Connection conn = PostgresConnection.getPostgresConnection();
             Statement statement = conn.createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_UPDATABLE)) {

            conn.setAutoCommit(false);
            statement.executeUpdate("INSERT into student " +
                    "VALUES (3236251235, 'wow', 'so much wow', " +
                    "'example@mail.com', 068111231, 1231253435)");
            System.out.println("commiting here");
            conn.commit();

        } catch (SQLException e) {

        }
    }
}

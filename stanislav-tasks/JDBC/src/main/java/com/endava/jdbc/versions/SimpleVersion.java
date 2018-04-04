package com.endava.jdbc.versions;

import com.endava.jdbc.connection.PostgresConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleVersion {

    public void simpleVersionConnection() throws SQLException {
        try (Connection conn = PostgresConnection.getPostgresConnection();
             Statement statement = conn.createStatement()) {

            statement.executeUpdate("INSERT into speciality " +
                    "values(1231253435, 'Tehnologii Informatioanale')");

        } catch (SQLException e) {

        }
    }
}


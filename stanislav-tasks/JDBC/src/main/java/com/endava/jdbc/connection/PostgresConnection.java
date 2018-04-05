package com.endava.jdbc.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresConnection {
    public static Connection getPostgresConnection() throws SQLException {
        return DataSourcePostgres.getPostgresDataSource().getConnection();
    }
}

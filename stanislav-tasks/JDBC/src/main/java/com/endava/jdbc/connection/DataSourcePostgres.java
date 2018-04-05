package com.endava.jdbc.connection;

import org.postgresql.ds.PGPoolingDataSource;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class DataSourcePostgres {

    public static DataSource getPostgresDataSource() {
        PGPoolingDataSource dataSource = new PGPoolingDataSource();


        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("postgres");
        dataSource.setUser("postgres");
        dataSource.setPassword("postgres");
        dataSource.setMaxConnections(20);

        return dataSource;
    }
}

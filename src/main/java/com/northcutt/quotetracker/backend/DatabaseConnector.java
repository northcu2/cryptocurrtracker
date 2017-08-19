package com.northcutt.quotetracker.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DatabaseConnector {
    private Logger logger;
    public static Connection getConnection(){
        Connection con = null;

    }

    private static void loadDriver(){
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Could not load JDBC driver.");
        }
    }
}


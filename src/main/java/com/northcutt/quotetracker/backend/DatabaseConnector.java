package com.northcutt.quotetracker.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    public static Connection getConnection() {
        loadDriver();
        PropertiesRetriever propertiesRetriever = new PropertiesRetriever();

        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://" +
                            propertiesRetriever.getValue("mysqlhostname") + ":" +
                            propertiesRetriever.getValue("mysqlport") + "/" +
                            propertiesRetriever.getValue("mysqldatabasename"),
                    propertiesRetriever.getValue("mysqlusername"),
                    propertiesRetriever.getValue("mysqlpassword"));
            return con;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void loadDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
           // System.out.println("Driver Registered!");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Could not load JDBC driver.");
        }
    }


}


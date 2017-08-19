package com.northcutt.quotetracker.backend;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;

public class DatabaseConnector {







    public static Connection getConnection(){
        loadDriver();

        Connection con = null;
        try{
            con = DriverManager.getConnection(
                    "jdbc:mysql://aa1jd6l662dtig2.crawqsxgq3hl.us-east-2.rds.amazonaws.com:3306",
                    "northcutted",
                    "Jvillxap2");
            return con;

        }catch (SQLException e){
                e.printStackTrace();
                return null;
        }
    }

    private static void loadDriver(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver Registered!");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Could not load JDBC driver.");
        }
    }


}


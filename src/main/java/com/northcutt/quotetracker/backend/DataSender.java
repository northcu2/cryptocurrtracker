package com.northcutt.quotetracker.backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSender {

    public static void sendData(CurrencyContainer container) {
        String sql = "INSERT into data(id,name,symbol,rank,price_usd,price_btc,market_cap_usd,available_supply," +
                "total_supply,percent_change_1h,percent_change24h,percent_change7d,last_updated)" +
                " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DatabaseConnector.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, container.getId());
            statement.setString(2, container.getName());
            statement.setString(3, container.getSymbol());
            statement.setInt(4, container.getRank());
            statement.setFloat(5, container.getPrice_usd());
            statement.setFloat(6, container.getPrice_btc());
            statement.setFloat(7, container.getMarket_cap_usd());
            statement.setFloat(8, container.getAvailable_supply());
            statement.setFloat(9, container.getTotal_supply());
            statement.setFloat(10, container.getPercent_change_1h());
            statement.setFloat(11, container.getPercent_change_24h());
            statement.setFloat(12, container.getPercent_change_7d());
            statement.setLong(13, container.getLast_updated());
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

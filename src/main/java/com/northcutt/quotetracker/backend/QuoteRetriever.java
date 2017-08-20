package com.northcutt.quotetracker.backend;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;

public class QuoteRetriever {

    public CurrencyContainer getQuote() {
        String type = "bitquence/";
        String jsonOutput = getData(type);


        try {
            CurrencyContainer[] containerArr = createContainer(jsonOutput);
            CurrencyContainer container = containerArr[0];
         //   System.out.println(container.toString());
            return container;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    private String getData(String type) {
        try {
            URL url = new URL("https://api.coinmarketcap.com/v1/ticker/" + type);
            URLConnection connection = url.openConnection();
            InputStream input = connection.getInputStream();
            StringWriter writer = new StringWriter();
            IOUtils.copy(input, writer, (String) null);
            String jsonOutput = writer.toString();
            input.close();
            return jsonOutput;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("URL NOT VALID");
            return null;
        }
    }

    private CurrencyContainer[] createContainer(String jsonOutput) throws Exception {
        Gson converter = new Gson();
        converter.toJson(jsonOutput);
        CurrencyContainer[] container = converter.fromJson(jsonOutput, CurrencyContainer[].class);

        return container;

    }

    private JsonObject convertStringtoJsonObject(String input) {
        Gson converter = new Gson();
        JsonObject container = converter.fromJson(input, JsonObject.class);
        return container;
    }
}

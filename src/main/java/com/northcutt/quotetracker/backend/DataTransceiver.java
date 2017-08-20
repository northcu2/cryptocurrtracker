package com.northcutt.quotetracker.backend;


import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public class DataTransceiver {

   @Scheduled(fixedRate = 300000)
   @Async
   @Bean
    public void insertToDatabase(){
       QuoteRetriever quoteRetriever = new QuoteRetriever();
       CurrencyContainer currencyContainer = quoteRetriever.getQuote();
       DataSender.sendData(currencyContainer);
       quoteRetriever = null;
   }

}

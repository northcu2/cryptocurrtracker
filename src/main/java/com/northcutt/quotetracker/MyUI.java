package com.northcutt.quotetracker;

import com.northcutt.quotetracker.backend.CurrencyContainer;
import com.northcutt.quotetracker.backend.QuoteRetriever;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class MyUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {


        QuoteRetriever y = new QuoteRetriever();
        CurrencyContainer x = y.getQuote();
        setContent(new Label(x.toString()));

    }
}

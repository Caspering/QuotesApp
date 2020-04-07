package com.example.auth.controller;

import com.example.auth.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BibleQuoteController extends QuoteClass{
    QuoteService quote = new QuotesServiceImpl();

    QuoteClass bibleQuote = new QuoteClass();

        @RequestMapping({"/quotes", "/quote","/Quotes","/Quotes/index", "/Quotes/index.html"})
        public String showQuote(Model model){

            model.addAttribute("quotes", quote.getQuotes());

            return "Quotes/index";   //ThymeLEAF View
        }

}

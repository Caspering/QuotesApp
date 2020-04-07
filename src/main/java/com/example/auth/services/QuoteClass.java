package com.example.auth.services;

import org.springframework.stereotype.Service;

@Service
public class QuoteClass {
    JokeService jokeService;
    QuoteService quoteService;

    public QuoteClass() {
    }

    public void getAJoke(){
        jokeService.getJoke();
    }

    public void getAQuote(){
        quoteService.getQuotes();
    }

    public void setJokeService(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public void setQuoteService(QuoteService quoteService) {
        this.quoteService = quoteService;
    }
}

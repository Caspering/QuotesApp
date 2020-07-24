package com.example.auth.services;

import org.springframework.stereotype.Service;

@Service
public class QuoteClass {
    private final JokeService jokeService;
    private final QuoteService quoteService;

    public QuoteClass(QuoteService quoteService, JokeService jokeService) {
        this.quoteService = quoteService;
        this.jokeService = quoteService;
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

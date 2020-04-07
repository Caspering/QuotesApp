package com.example.auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class QuotesServiceImpl implements QuoteService{
    private List<String> quotes = new ArrayList(123);

    public QuotesServiceImpl() {
        this.quotes.add("Joshua 1:9:\n" +
                "“Have I not commanded you? Be strong and courageous. Do not be frightened, and do not be dismayed, for the LORD your God is with you wherever you go.”");
        this.quotes.add("Lamentations 3:22-23: \n" +
                "“The steadfast love of the LORD never ceases; his mercies never come to an end; they are new every morning; great is your faithfulness.”");
        this.quotes.add("Proverbs 3:5-6:   \n" +
                "“Trust in the LORD with all your heart, and do not lean on your own understanding. In all your ways acknowledge him, and he will make straight your paths.”");
        this.quotes.add("Proverbs 18:10:\n" +
                "“The name of the LORD is a strong tower; the righteous man runs into it and is safe.”");
        this.quotes.add("Psalm 16:8:\n" +
                "“I have set the LORD always before me; because he is at my right hand, I shall not be shaken.”\n" +
                "\n");
        this.quotes.add("Psalm 23:4:\n" +
                "“Even though I walk through the valley of the shadow of death, I will fear no evil, for you are with me; your rod and your staff, they comfort me.”");
        this.quotes.add("Psalm 31:24:\n" +
                "“Be strong, and let your heart take courage, all you who wait for the LORD!”");
        this.quotes.add("Psalm 46:7:\n" +
                "“The LORD of hosts is with us; the God of Jacob is our fortress.”");
        this.quotes.add("Psalm 62:6:\n" +
                "“He only is my rock and my salvation, my fortress; I shall not be shaken.”");
        this.quotes.add("Psalm 119:50:\n" +
                "“This is my comfort in my affliction, that your promise gives me life.”");
        this.quotes.add("Psalm 120:1:   \n" +
                "“In my distress I called to the LORD, and he answered me.”");
        this.quotes.add("Isaiah 26:3:\n" +
                "“You keep him in perfect peace whose mind is stayed on you, because he trusts in you.”");
        this.quotes.add("1 Thessalonians 5:11:\n" +
                "“Therefore encourage one another and build one another up, just as you are doing.”");
        this.quotes.add("1 Peter 5:7:\n" +
                "“Casting all your anxieties on him, because he cares for you.”");
        this.quotes.add("Philippians 4:19:\n" +
                "“And my God will supply every need of yours according to his riches in glory in Christ Jesus.”");
    }

//    public String getQuote() {
//        return (String)this.quotes.get(ThreadLocalRandom.current().nextInt(1, this.quotes.size()));
//    }

    @Override
    public String getQuotes() {
        return (String)this.quotes.get(ThreadLocalRandom.current().nextInt(1, this.quotes.size()));
    }
}

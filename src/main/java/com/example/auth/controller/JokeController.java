package com.example.auth.controller;

import com.example.auth.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
     JokeService joke = new JokeServiceImpl();

//    public JokeController(){
//        JokeService joke = new JokeServiceImpl();
//    }

    @RequestMapping({"/jokes","/jokes/index", "/jokes/index.html"})
    public String showJoke(Model model){

        model.addAttribute("joke", joke.getJoke());

        return "jokes/index";   //ThymeLEAF View
    }
}
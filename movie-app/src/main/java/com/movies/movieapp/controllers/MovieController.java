package com.movies.movieapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("movies")
public class MovieController {

    @GetMapping
    public String displayAllMovies(Model model) {
        List<String> movies = new ArrayList<>();
        movies.add("The Help");
        movies.add("Secret Life of Walter Mitty");
        movies.add("About Time");
        model.addAttribute("movies", movies);
        return "movies/index";
    }
}

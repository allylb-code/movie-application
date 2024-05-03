package com.movies.movieapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("movies")
public class MovieController {

    private static List<String> movies = new ArrayList<>();

    @GetMapping
    public String displayAllMovies(Model model) {
     model.addAttribute("movies", movies);
        return "movies/index";
    }

    //found @ /movies/create
    @GetMapping("add")
    public String renderNewMovieForm() {
        return "movies/add";
    }

    @PostMapping("add")
    public String addMovie(@RequestParam String movieTitle) {
        movies.add(movieTitle);
        return "redirect:";
    }
}

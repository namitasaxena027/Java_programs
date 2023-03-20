package com.javaunit3.springmvc;

import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaunit3.springmvc.model.MovieEntity;

@Controller
public class MovieController {
    @Autowired
    private BestMovieService bestMovieService;
    /* 
    @RequestMapping("/")
    public String getIndexPage()
    {
        return "index";
    }*/
    
    // @RequestMapping("/bestMovie")
    // public String getBestMoviePage( Model model) {

    // model.addAttribute("BestMovie", bestMovieService.getBestMovie().getTitle());
    //     return "bestMovie";
    // }
    
    /* 
    @RequestMapping("/voteForBestMovieForm")
    public String voteForBestMovieFormPage() {
    return "voteForTheBestMovie";
    }

    @RequestMapping("/voteForBestMovie")
    public String voteForBestMovie(HttpServletRequest request, Model model) {

        String movieTitle = request.getParameter("movieTitle");

        // int new_movie = Integer.parseInt(movieTitle);
        // new_movie++;
        model.addAttribute("BestMovieVote", movieTitle);

    return "voteForTheBestMovie";
    }
    */
    ///* 
    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/addMovieForm")
    public String addMovieForm() {
        return "addMovie";
    }

    @RequestMapping("/addMovie")
    public String voteForBestMovie(HttpServletRequest request, Model model) {

        String movieTitle = request.getParameter("movieTitle");
        String maturityRating = request.getParameter("maturityRating");
        String genre = request.getParameter("genre");

        model.addAttribute("addMovieTitle", movieTitle);
        model.addAttribute("addMaturityRating", maturityRating);
        model.addAttribute("addgenre", genre);

        //new movientity object
        //setters for fields

        MovieEntity movie1 = new MovieEntity();
        movie1.setTitle(movieTitle);
        movie1.setMaturityRating(maturityRating);
        movie1.setGenre(genre);
       
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        System.out.println("--------Begin-------");
        session.save(movie1);
        System.out.println("--------Save-------");
        session.getTransaction().commit();
        System.out.println("--------Commit-------");
        
    return "addMovie";
    }
    //*/
}

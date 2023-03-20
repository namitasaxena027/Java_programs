package com.javaunit3.springmvc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaunit3.springmvc.model.MovieEntity;
import com.javaunit3.springmvc.model.VoteEntity;

@Controller
public class MovieController {
    @Autowired
    private BestMovieService bestMovieService;
    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/")
    public String getIndexPage()
    {
        return "index";
    }
    
    @RequestMapping("/bestMovie")
    public String getBestMoviePage( Model model) {

    model.addAttribute("BestMovie", bestMovieService.getBestMovie().getTitle());
        return "bestMovie";
    }
    
    @RequestMapping("/voteForBestMovieForm")
    public String voteForBestMovieFormPage() {
    return "voteForTheBestMovie";
    }

    @RequestMapping("/voteForBestMovie")
    public String voteForBestMovie(HttpServletRequest request, Model model){
        String movieId = request.getParameter("movieId");
        String voterName = request.getParameter("voterName");
        
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        MovieEntity movieEntity = (MovieEntity) session.get(MovieEntity.class, Integer.parseInt(movieId));
        
        VoteEntity newVote = new VoteEntity();
        newVote.setVoterName(voterName);
        movieEntity.addVote(newVote);
        session.update(movieEntity);
        session.getTransaction().commit();
        return "voteForBestMovie";
    }

    @RequestMapping("/addMovieForm")
    public String addMovieForm() {
        return "addMovie";
    }

    @RequestMapping("/addMovie")
    public String addMovie(HttpServletRequest request, Model model) {

        String movieTitle = request.getParameter("movieTitle");
        String maturityRating = request.getParameter("maturityRating");
        String genre = request.getParameter("genre");

        model.addAttribute("addMovieTitle", movieTitle);
        model.addAttribute("addMaturityRating", maturityRating);
        model.addAttribute("addgenre", genre);

        MovieEntity movieEntity = new MovieEntity();

        movieEntity.setTitle(movieTitle);
        movieEntity.setMaturityRating(maturityRating);
        movieEntity.setGenre(genre);
       
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(movieEntity);
        session.getTransaction().commit();
        
    return "addMovie";
    }

    @RequestMapping("/voteForBestMovieForm")
    public String voteForBestMovieFormPage(Model model){ 
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<MovieEntity> movieEntityList = session.createQuery("from MovieEntity").list();
        session.getTransaction().commit();
        model.addAttribute("movies", movieEntityList);
        return "voteForBestMovie";
    }
    
}

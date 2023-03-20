package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class BestMovieService {
    /*@Autowired
    private Movie movie;
    public Movie getBestMovie(){
        return movie;
    }*/
    //@Autowired
    private Movie movie;
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }
    /*@Autowired
    public BestMovieService(Movie movie) {
        this.movie = movie;
    }*/
    public Movie getBestMovie() {
        return movie;
    }
    

    
}

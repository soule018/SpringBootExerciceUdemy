package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {
    //private MovieRepository movieRepository=new MovieRepository();
    private GoLiveMovieRepository movieRepository=new GoLiveMovieRepository();

    public void registerMovie(Movie movie){
        movieRepository.add(movie);


    }
}

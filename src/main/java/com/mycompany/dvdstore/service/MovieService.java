package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;


public class MovieService implements MovieServiceInterface {
    //private MovieRepository movieRepository=new MovieRepository();
    private MovieRepositoryInterface movieRepository;

    public void registerMovie(Movie movie){
        movieRepository.add(movie);


    }
}

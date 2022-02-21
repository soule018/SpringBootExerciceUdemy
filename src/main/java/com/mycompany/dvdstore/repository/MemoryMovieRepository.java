package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface{

    private static List<Movie>movies=new ArrayList<>();

    /*
    cette méthode consiste à ajouter ce film movie à la liste statique de films
     */
    public void add(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");


    }
}

package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {
    private MovieServiceInterface movieService;

    public void addUsingConsole(){
        Scanner sc=new Scanner(System.in);
        System.out.println( "what is the title of the movie ?" );
        String title=sc.nextLine();
        System.out.println("what is the genre of the movie to be added ?");
        String genre=sc.nextLine();
        Movie movie=new Movie();
        movie.setGenre(genre);
        movie.setTitle(title);
        movieService.registerMovie(movie);
    }
}

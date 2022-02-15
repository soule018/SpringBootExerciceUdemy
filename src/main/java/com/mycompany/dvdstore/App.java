package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println( "what is the title of the movie ?" );
        String title=sc.nextLine();
        System.out.println("what is the genre of the movie to be added ?");
        String genre=sc.nextLine();
        Movie movie=new Movie();
        movie.setGenre(genre);
        movie.setTitle(title);
        MovieService movieService=new MovieService();
        movieService.registerMovie(movie);



    }
}

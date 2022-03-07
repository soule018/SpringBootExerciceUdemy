package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {
    private static long lastNumber=0L;

    private static List<Movie>movies=new ArrayList<>();

    /*
    cette méthode consiste à ajouter ce film movie à la liste statique de films
     */
    public void add(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");


    }

    @Override
    public List<Movie> list() {
        Movie movieOne=new Movie();
        movieOne.setTitle("Rasta Rocket");
        movieOne.setGenre("Comédie");
        movieOne.setDescription("Rasta Rocket");
        movieOne.setId(1L);
        Movie movieTwo=new Movie();
        movieTwo.setTitle("Dracula");
        movieTwo.setGenre("Horreur");
        movieTwo.setId(2L);
        movieTwo.setDescription("Dracula");
        return List.of(movieOne,movieTwo);
    }

    @Override
    public Movie getById(long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }
}

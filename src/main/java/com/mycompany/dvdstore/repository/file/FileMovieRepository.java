package com.mycompany.dvdstore.repository.file;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.FileWriter;
import java.io.IOException;

@Repository

public class FileMovieRepository implements MovieRepositoryInterface {

    @Value("${movies.file.location}")
    FileWriter file;

    public FileWriter getFile() {
        return file;
    }

    public void setFile(FileWriter file) {
        this.file = file;
    }

    public void add(Movie movie){


        try{

            file=new FileWriter("C:\\temp\\movies.csv",true);
            file.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}

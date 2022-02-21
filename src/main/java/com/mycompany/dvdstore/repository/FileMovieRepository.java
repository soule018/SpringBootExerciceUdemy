package com.mycompany.dvdstore.repository;
import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface {
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

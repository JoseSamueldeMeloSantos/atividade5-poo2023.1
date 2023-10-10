package com.samuel.javaflix.model;

import com.samuel.javaflix.dao.DataRecorder;
import com.samuel.javaflix.exceptions.HasNoMovieInSystemException;
import com.samuel.javaflix.exceptions.InvalidMovieException;
import com.samuel.javaflix.exceptions.MovieAlreadyExistException;
import com.samuel.javaflix.exceptions.MovieDoesNotExistException;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author José Samuel de Melo Santos
 *
 * This class it is in charge to control all movies in system
 */
public class JavaFlixSystem implements JavaFlixOperations {

    private Map<String, Movie> movies = new HashMap<>();
    private DataRecorder dr = new DataRecorder();

    public JavaFlixSystem() {
        recorverData();
    }

    private void recorverData() {
        try {
            Map<String, Movie> aux = dr.recover();
            if (aux != null) {
                movies = aux;
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null
                    ,"It wasn't possible to recover the data");
        }
    }

    public void recorderData() throws IOException {
        try {
            dr.recorder(movies);
        }
        catch (IOException e) {
            throw e;
        }
    }

    @Override
    public void addMovie(Movie movie)
            throws MovieAlreadyExistException, InvalidMovieException {
        if (!movies.containsKey(movie.getName())) {
            if (movie.getName().equals("") ||
                movie.getGender().equals("") ||
                movie.getReleaseDate().equals("") ||
                movie.getProducer().equals("")) {
                throw new InvalidMovieException();
            }
            movies.put(movie.getName(), movie);
        }
        else {
            throw new MovieAlreadyExistException();
        }
    }

    @Override
    public void removeMovie(String nameMovie)
            throws MovieDoesNotExistException {
        if (movies.containsKey(nameMovie)) {
            movies.remove(nameMovie);
        }
        else {
            throw new MovieDoesNotExistException();
        }
    }

    @Override
    public Movie reseachMovie(String nameMovie)
            throws MovieDoesNotExistException {
        if (movies.containsKey(nameMovie)) {
            return movies.get(nameMovie);
        }
        else {
            throw new MovieDoesNotExistException();
        }
    }

    @Override
    public void removeAllMovies()
            throws HasNoMovieInSystemException {
        if (movies.size() > 0) {
            movies.clear();
        }
        else {
            throw new HasNoMovieInSystemException();
        }
    }

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movieList = new ArrayList<>();
        for (Movie m : movies.values()) movieList.add(m);

        return movieList;
    }
}

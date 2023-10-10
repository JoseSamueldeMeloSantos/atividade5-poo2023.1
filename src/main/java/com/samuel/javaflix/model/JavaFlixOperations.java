package com.samuel.javaflix.model;

import com.samuel.javaflix.exceptions.HasNoMovieInSystemException;
import com.samuel.javaflix.exceptions.InvalidMovieException;
import com.samuel.javaflix.exceptions.MovieAlreadyExistException;
import com.samuel.javaflix.exceptions.MovieDoesNotExistException;

import java.util.List;

/**
 * @author José Samuel de Melo Santos
 */
public interface JavaFlixOperations {
    
    void addMovie(Movie m) throws MovieAlreadyExistException, InvalidMovieException;
    void removeMovie(String nameMovie) throws MovieDoesNotExistException;
    Movie reseachMovie(String nameMovie) throws MovieDoesNotExistException;
    void removeAllMovies() throws HasNoMovieInSystemException;
    List<Movie>  getAllMovies();
}

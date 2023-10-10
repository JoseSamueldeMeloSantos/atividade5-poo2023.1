package com.samuel.javaflix.exceptions;

/**
 * @author José Samuel de Melo Santos
 */
public class MovieDoesNotExistException extends Exception{

    public MovieDoesNotExistException() {
        super("MovieDoesNotExistException");
    }
}

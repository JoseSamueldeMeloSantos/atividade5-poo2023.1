package com.samuel.javaflix.controllers;

import com.samuel.javaflix.exceptions.HasNoMovieInSystemException;
import com.samuel.javaflix.exceptions.InvalidMovieException;
import com.samuel.javaflix.exceptions.MovieAlreadyExistException;
import com.samuel.javaflix.exceptions.MovieDoesNotExistException;
import com.samuel.javaflix.gui.FlixFrame;
import com.samuel.javaflix.model.Movie;
import com.samuel.javaflix.model.JavaFlixSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

/**
 * @author José Samuel de Melo Santos
 */
public class MenuController implements ActionListener {

    private JavaFlixSystem systemJF;
    private FlixFrame flixf;

    public MenuController(JavaFlixSystem systemJF, FlixFrame flixf) {
        this.systemJF = systemJF;
        this.flixf = flixf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == flixf.getRegisterB()) {
            registerMovie();
            updateData();
        }
        else if (e.getSource() == flixf.getRemoveB()) {
            removeMovie();
            updateData();
        }
        else if (e.getSource() == flixf.getReseachB()) {
            reseachMovie();
        }
        else if (e.getSource() == flixf.getShowAllMoviesB()) {
            showAllMovies();
        }
        else if(e.getSource() == flixf.getRemoveAllMoviesB()) {
            removeAllMovies();
            updateData();
        }
        else if (e.getSource() == flixf.getQuitB()) {
            quitProgram();
        }
    }

    private void updateData() {
        try {
            systemJF.recorderData();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null
                    ,"It wasn't possible to recorder the data");
        }
    }

    private void removeAllMovies() {
        try {
            int option = JOptionPane.showConfirmDialog(null
                    ,"Do you want to remove all movies of the system?"
                    , "", JOptionPane.YES_NO_OPTION);

            if (option == 0) {
                systemJF.removeAllMovies();
            }
        }
        catch(HasNoMovieInSystemException e){
            JOptionPane.showMessageDialog(null
                    , "No Has any movie registred in system"
                    , "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void quitProgram() {
        System.exit(1);
    }

    private void showAllMovies() {
        List<Movie> moviesList = systemJF.getAllMovies();

        if (moviesList.size() > 0) {
            String moviesStr = "";
            for (Movie m : moviesList) moviesStr += m + "\n";

            JOptionPane.showMessageDialog(null, moviesStr
                    ,"Movies Registered", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null
                    ,"Has no movies registered in system"
                    , "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void removeMovie() {
        String nameMovie = JOptionPane.showInputDialog(null
                , "What's the name of the movie you what to remove"
                , "", JOptionPane.QUESTION_MESSAGE);

        try {
            systemJF.removeMovie(nameMovie);
            JOptionPane.showMessageDialog(null
                    , "Movie removed success"
                    , "", JOptionPane.INFORMATION_MESSAGE);
        } catch (MovieDoesNotExistException e) {
            JOptionPane.showMessageDialog(null
                    , "This movie does not exist in system"
                    , "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void reseachMovie() {
        String movieName = JOptionPane.showInputDialog(null
                , "What's the name of the movie you what to reseach"
                , "", JOptionPane.QUESTION_MESSAGE);

        try {
            Movie m = systemJF.reseachMovie(movieName);
            JOptionPane.showMessageDialog(null, m
                    , "The movie what you reseach", JOptionPane.PLAIN_MESSAGE);
        }
        catch (MovieDoesNotExistException e) {
            JOptionPane.showMessageDialog(null
                    , "This movie does not exist in system"
                    , "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void registerMovie() {
        String name = JOptionPane.showInputDialog(null
                , "What is the name of the movie?"
                , "", JOptionPane.QUESTION_MESSAGE);
        String gender = JOptionPane.showInputDialog(null
                , "What is the gender of the movie?"
                , "", JOptionPane.QUESTION_MESSAGE);
        String releaseDate = JOptionPane.showInputDialog(null
                , "Now put the release Date"
                , "", JOptionPane.QUESTION_MESSAGE);
        String producer = JOptionPane.showInputDialog(null
                , "At last you need to put the producer of the movie"
                , "", JOptionPane.QUESTION_MESSAGE);

        Movie m = new Movie(name, gender, releaseDate, producer);
        System.out.println("-" + m);
        try {
            systemJF.addMovie(m);
            JOptionPane.showMessageDialog(null
                    , "Movie registered successfully"
                    , "", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (InvalidMovieException e) {
            JOptionPane.showMessageDialog(null
                    , "This movie is invalid to register in system"
                    , "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch (MovieAlreadyExistException e) {
            JOptionPane.showMessageDialog(null
                    , "This movie already exist in system"
                    , "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}

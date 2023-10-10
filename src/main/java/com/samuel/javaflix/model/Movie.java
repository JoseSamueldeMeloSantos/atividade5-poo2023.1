package com.samuel.javaflix.model;

import java.io.Serializable;

/**
 * @author José Samuel de Melo Santos
 */
public class Movie implements Serializable {

    private String name;
    private String gender;
    private String releaseDate;
    private String producer;

    public Movie(String name, String gender, String releaseDate, String producer) {
        this.name = name;
        this.gender = gender;
        this.releaseDate = releaseDate;
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return name.equals(movie.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return  "name: " + name +
                ", gender: " + gender +
                ", releaseDate: " + releaseDate +
                ", producer: " + producer;
    }
}

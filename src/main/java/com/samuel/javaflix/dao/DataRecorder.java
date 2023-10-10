package com.samuel.javaflix.dao;

import com.samuel.javaflix.model.Movie;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author José Samuel de Melo Santos
 */
public class DataRecorder {

    private final String FILE_NAME = "movies.dat";

    public HashMap<String, Movie> recover() throws IOException {

        HashMap<String, Movie> m = null;

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(FILE_NAME));
            m = (HashMap<String, Movie>) in.readObject();
        }
        catch (ClassNotFoundException e) {
            System.err.print(e);
        }
        catch (IOException e) {
            throw e;
        }
        finally {
            if (in != null) in.close();
        }

        return m;
    }

    public void recorder(Map<String, Movie> movies) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(movies);
        }
        catch (IOException e) {
            throw e;
        }
        finally {
            if (out != null) out.close();
        }
    }
}

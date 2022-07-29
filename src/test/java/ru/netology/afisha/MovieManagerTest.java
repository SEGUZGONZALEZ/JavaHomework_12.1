package ru.netology.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void shouldAddMovie() {
        MovieManager movieManager = new MovieManager();

        String[] movieTest = new String[]{"Hannibal", "Red Dragon", "Hannibal Rising"};
        movieManager.setCinema(movieTest);
        String addMovie = "HannibalTV";
        movieManager.add(addMovie);
        String[] expected = new String[]{"Hannibal", "Red Dragon", "Hannibal Rising", "HannibalTV"};
        String[] actual = movieManager.getCinema();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        MovieManager movieManager = new MovieManager();

        String[] movieTest = new String[]{"Hannibal", "Red Dragon", "Hannibal Rising", "HannibalTV"};
        movieManager.setCinema(movieTest);
        movieManager.findAll();
        String[] expected = new String[]{"Hannibal", "Red Dragon", "Hannibal Rising", "HannibalTV"};
        String[] actual = movieManager.getCinema();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastDefaultLength() {
        MovieManager movieManager = new MovieManager();

        String[] movieTest = new String[]{"Cinema1", "Cinema2", "Cinema3", "Cinema4", "Cinema5", "Cinema6", "Cinema7", "Cinema8", "Cinema9", "Cinema10", "Cinema11", "Cinema12"};
        movieManager.setCinema(movieTest);
        movieManager.findLast();
        String[] expected = new String[]{"Cinema12", "Cinema11", "Cinema10", "Cinema9", "Cinema8", "Cinema7", "Cinema6", "Cinema5", "Cinema4", "Cinema3"};
        String[] actual = movieManager.getCinema();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastSpecificLength() {
        MovieManager movieManager = new MovieManager(5);

        String[] movieTest = new String[]{"Cinema1", "Cinema2", "Cinema3", "Cinema4", "Cinema5", "Cinema6", "Cinema7", "Cinema8", "Cinema9", "Cinema10"};
        movieManager.setCinema(movieTest);
        movieManager.findLast();
        String[] expected = new String[]{"Cinema10", "Cinema9", "Cinema8", "Cinema7", "Cinema6"};
        String[] actual = movieManager.getCinema();

        assertArrayEquals(expected, actual);
    }
}
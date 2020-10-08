package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input scanner = new Input();
        Movie[] allMovies = MoviesArray.findAll();
        while (true) { // could use recursion , put this part in a method
            int userNumberInput = userConfirmation(scanner);
            if (userNumberInput == 0) // switch
                break;
            else if (userNumberInput == 1)
                displayMovies("all", allMovies);
            else if (userNumberInput == 2)
                displayMovies("drama", allMovies);
            else if (userNumberInput == 3)
                displayMovies("scifi", allMovies);
            else if (userNumberInput == 4)
                displayMovies("musical", allMovies);
            else if (userNumberInput == 5)
                displayMovies("animated", allMovies);
            else if (userNumberInput == 6)
                displayMovies("comedy", allMovies);
            else if (userNumberInput == 7)
                displayMovies("horror", allMovies);
            else if (userNumberInput == 8)
                addNewMovie(scanner, allMovies);
        }
    }

    public static int userConfirmation(Input scanner) {
        System.out.println("\nWhat would you like to do?\n\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the drama category\n" +
                "3 - view movies in the scifi category\n" +
                "4 - view movies in the musical category\n" +
                "5 - view movies in the animated category\n" +
                "6 - view movies in the comedy category\n" +
                "7 - view movies in the horror category\n" +
                "8 - add your own movie\n");
        return scanner.getInt(0, 8, "Enter your choice: ");
    }

    public static void displayMovies(String category, Movie[] allMovies) {
        if (category.equals("all")) {
            for (Movie movie : allMovies)
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        } else {
            for (Movie movie : allMovies) {
                if (category.equals(movie.getCategory()))
                    System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
//        for (Movie movie : allMovies) {
//            if (movie.getCategory().equals(category))
//                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
//            else
//                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
//        }
    }

    public static void addNewMovie(Input scanner, Movie[] allMovies) {
        scanner.getString();
        String newMovieName = scanner.getString("Enter the name of your movie: ");
        String newMovieCategory = scanner.getString("Enter the category of your movie: ");
        Movie[] newMovieArray = Arrays.copyOf(allMovies, allMovies.length + 1);
        Movie newMovie = new Movie(newMovieName, newMovieCategory);
        newMovie.setName(newMovieName); // to format user input
        newMovie.setCategory(newMovieCategory); // to format user input
        newMovieArray[newMovieArray.length - 1] = newMovie;
//        allMovies = newMovieArray; // does not change the original allMovies array, scoping??
//        displayMovies("all", allMovies);
        displayMovies("all", newMovieArray);
    }
}
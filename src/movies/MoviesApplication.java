package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
//    static Movie[] allMovies = MoviesArray.findAll(); // by putting the movie array here, all the methods can use it and no need to pass it as a parameter, also solve the scoping issue!!

    public static void main(String[] args) {
        Input scanner = new Input();
        Movie[] allMovies = MoviesArray.findAll();
        while (true) { // could use recursion , put the while body in a method, in the end of method, call itself again,also for _== 0, use System.exit(0)
            int userNumberInput = userConfirmation(scanner);
//            if (userNumberInput == 0)
//                break;
//            else if (userNumberInput == 1)
//                displayMovies("all", allMovies);
//            else if (userNumberInput == 2)
//                displayMovies("drama", allMovies);
//            else if (userNumberInput == 3)
//                displayMovies("scifi", allMovies);
//            else if (userNumberInput == 4)
//                displayMovies("musical", allMovies);
//            else if (userNumberInput == 5)
//                displayMovies("animated", allMovies);
//            else if (userNumberInput == 6)
//                displayMovies("comedy", allMovies);
//            else if (userNumberInput == 7)
//                displayMovies("horror", allMovies);
//            else if (userNumberInput == 8)
//                addNewMovie(scanner, allMovies);
            switch (userNumberInput) {
                case 0:
                    System.exit(0); // "break;" on next line only break out of the switch, need this to exit the program
                    break;
                case 1:
                    displayMovies("all", allMovies);
                    break;
                case 2:
                    displayMovies("drama", allMovies);
                    break;
                case 3:
                    displayMovies("scifi", allMovies);
                    break;
                case 4:
                    displayMovies("musical", allMovies);
                    break;
                case 5:
                    displayMovies("animated", allMovies);
                    break;
                case 6:
                    displayMovies("comedy", allMovies);
                    break;
                case 7:
                    displayMovies("horror", allMovies);
                    break;
                case 8:
                    addNewMovie(scanner, allMovies);
            }
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
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory()); // this line here could be extract as a movie.printOut() method that belongs in the Movie class
//                movie.printOut();
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
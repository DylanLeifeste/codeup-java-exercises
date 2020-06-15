package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class MoviesApplication {
    //        using our previously created Input class to instantiate a scanner
    static Input input = new Input();
    //        creating a new movies array that stores the return of findAll()
//        method in MoviesArray class
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean keepChoosing = true;
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category\n" +
                    "6 - add a new movie\n");

            int userChoice = input.getInt(0,6);
//            this is to prevent Scanner from holding onto the new line character once we press enter
            input.getString();


            switch (userChoice){
                case 0:
                    System.out.println("Thanks for using Movie App!");
                    keepChoosing = false;
                    break;
                case 1:
                    for (Movie movie : movies){
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("animated")){
                            System.out.println(movie.getName() + "--" + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("drama")){
                            System.out.println(movie.getName() + "--" + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("horror")){
                            System.out.println(movie.getName() + "--" + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("scifi")){
                            System.out.println(movie.getName() + "--" + movie.getCategory());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Prepare to add a new movie.");
//                    take user input for new movie name
                    System.out.println("What is the movie name?");
                    String newName = input.getString();
//                    input.getString();
//                    take user input for new category
                    System.out.println("What is the movie category?");
                    String newCat = input.getString();
//                    create a new Movie object to add to our list
                    Movie newMovie = new Movie(newName,newCat);
                    System.out.println("Your new movie is being added to the " +
                            "list. Please wait...");

                    ArrayList<Movie> myMovies =
                            new ArrayList<>(Arrays.asList(movies));
                    myMovies.add(newMovie);
                    movies = myMovies.toArray(movies);
                    for (Movie movie : movies){
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }

                default:
                    System.out.println("Please enter one of the options.");
            }
        } while(keepChoosing);
    }
}

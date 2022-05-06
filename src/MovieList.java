import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieList {

//	After the list is displayed, the user is asked if he or she wants to continue. If not, the program ends.

//	Extended Exercises:

//	Standardize the category codes by displaying a menu of categories and having the user select the category 
//	by number rather than entering the name.

//	Get the class MoviesIO from the GC GitHub. This class has a method named getMovie(). Use this method to 
//	fill the array list with 100 Movie objects. No Plz.
//	
//	Each movie should be represented by an object of type Movie - done
//	(2pts) The Movie class must provide two private fields: title and category and the properties that go with them - done
//	(2pts) The class should also provide a constructor that accepts a title and category as parameters and uses the values passed to it to initialize its fields - done
//	(2pts) When the user enters a category, the program should read through all of the movies in the List and display a line for any movie whose category matches the category entered by the user - done
//	Validate input don’t accept blanks for any of the questions
//	(2pts) Correct answer in Lab Summary when submitting to the LMS

	public static void main(String[] args) {
		boolean yesOrNo;
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are 10 movies in this list.");
		ArrayList<Movie> movieList = new ArrayList<>();
		
		movieList.add(new Movie("Paris Je T'aime", "drama"));
		movieList.add(new Movie("Inception", "scifi"));
		movieList.add(new Movie("Soul", "animated"));
		movieList.add(new Movie("Encanto", "animated"));
		movieList.add(new Movie("Get Out", "horror"));
		movieList.add(new Movie("Free Solo", "drama"));
		movieList.add(new Movie("Star Wars: A New Hope", "scifi"));
		movieList.add(new Movie("Avatar", "scifi"));
		movieList.add(new Movie("The Quiet Place", "horror"));
		movieList.add(new Movie("Steel Magnolias", "drama"));
		Scanner scnr = new Scanner(System.in);
do {
		System.out.println("Please choose from the following movie genres: drama, scifi, animated or horror");
		String userInput = scnr.nextLine().toLowerCase();
//		Display the movies for the selected category in alphabetical order.
		Collections.sort(movieList, Movie.sortTitle);

//		ArrayList and display a line for any movie whose category matches the category entered by the user.
		for (Movie movie : movieList) {
			if (movie.getCategory().equals(userInput)) {
//	Display the movies for the selected category in alphabetical order.
				
				System.out.println(movie.getTitle());
			}

		} 
		System.out.println("\nWould you like to know about another genre? (yes or no)");
		String answer = scnr.nextLine();
		if (answer.equalsIgnoreCase("yes")) {
			yesOrNo = true;
		} else {
			System.out.println("Enjoy your movie!");
			break;
		}
		} while (yesOrNo = true);
	scnr.close();
	}

}

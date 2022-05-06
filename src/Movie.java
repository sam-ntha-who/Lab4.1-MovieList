import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Movie {
//	The Movie class must provide two private fields: title and category. 
	private String title;
	private String category;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) { 
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Movie() {
		
	}
//	Both of these fields should be Strings. The class should also provide a constructor 
//	that accepts a title and category as parameters and uses the values passed to it to initialize its fields.
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}
	@Override
	
	public String toString() {
		return title + ", " + category;
	}
	public static Comparator<Movie> sortTitle = new Comparator<Movie>() {

		public int compare(Movie m1, Movie m2) {

			String movie1 = m1.getTitle();
			String movie2 = m2.getTitle();

			return movie1.compareTo(movie2);

		}

	};
	

    
}


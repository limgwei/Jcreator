

public class Movie {
	private int id;
	private String title;
	private String rating; // e.g. "G", "PG-13", "R"
	private int daysLate;
	
	/** 3-arg constructor */
	public Movie(int id, String title, String rating, int daysLate) {	 
     	this.id = id;
     	this.title = title;
     	this.rating = rating;
     	this.daysLate=daysLate;
	}
	public int getDaysLate(){
		return daysLate;
	}
	public int getID(){
		return id;
	}
	/** provide a description of a movie */
	public String toString() {
		return "Movie ID:" + this.id + 
			"\nTitle: " + this.title +
			"\nRating: " + this.rating + 
			"\nDays Late: " +this.daysLate;
			
	}	 
	
	/** calculate charge for each day the movie is late */
	public double calcLateFees(){
		
		return 0;
	}
	
} 
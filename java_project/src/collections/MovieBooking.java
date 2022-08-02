package collections;

import java.util.ArrayList;
import java.util.List;

public class MovieBooking implements Comparable<MovieBooking>{
	String movieName;
	String showTime;
	String userName;
	List<String> mytickets;
	
	public MovieBooking(String moviename, String showtime, String username) {
		this.movieName = moviename;
		this.showTime = showtime;
		this.userName = username;
		this.mytickets = new ArrayList<>();
	}
	public void bookTicket(String seatNo) {
		this.mytickets.add(seatNo);
	}
	public String toString() {
		return "\nUser: " + userName + ", Movie: " + movieName + ", Show Time: " 
				+showTime + ", Tickets: " + mytickets;
	}
	@Override
	public int compareTo(MovieBooking o) {
		return this.showTime.compareTo(o.showTime);
	}
	
}


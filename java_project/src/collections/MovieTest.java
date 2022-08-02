package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MovieTest{
	public static void main(String[] args) {
		
		Set<MovieBooking> movieBookings = new HashSet<>();
		
		MovieBooking booking1 = new MovieBooking("The minions", "12:00 PM", "Alen");
		booking1.bookTicket("A1");
		booking1.bookTicket("A2");
		
		
		MovieBooking booking2 = new MovieBooking("The minions", "12:00 PM", "Alen");
		booking2.bookTicket("B1");
		booking2.bookTicket("B2");
		
		
		movieBookings.add(booking1);
		movieBookings.add(booking2);
		System.out.println(movieBookings);
		
	}
}

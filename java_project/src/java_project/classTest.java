package java_project;


class Bicycle{
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBreak(int decrement) {
		speed = speed - decrement;
	}
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	public String toString() {
		return ("Gear of Bicycle: " + gear + "\n Current Speed " + speed + "\n Speed after break ");
	}
}

class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		seatHeight = startHeight;
	}
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	public String toString() {
		return (super.toString() + "\nSeat height is " + seatHeight);
	}
}


public class classTest {
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 213, 45);
		System.out.println(mb.toString());
	}
}

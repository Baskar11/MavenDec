package classActivity.day1;

public class MyCar {

	public static void main(String[] args) {
		Car test = new Car();
		System.out.println("Car model is " +test.CarName);
		System.out.println("Car number is " +test.CarNumber);
		System.out.println("Vehicle capacity is " +test.Capacity);
		System.out.println("Is the Car punctured? " +test.IsPunctured);
		System.out.println("Max speed is " +test.maxSpeed());
		System.out.println("Air pressure is " +test.airPressure());
		System.out.println("Engine is on? " +test.isEngineOn());

	}

}

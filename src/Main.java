import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto car = new Auto("Car", 001, 5, 80);
		Auto truck  = new Auto("Truck", 002, 10, 120);
		Auto pickupTruck = new Auto("Pickup Truck", 003, 2, 7, 100);
		
		System.out.println("Welcome to the Car Rent Center. The available autos are shown.");
		System.out.println("NAME   ID   OCCUPANCY LOAD  PRICE/DAY");
		System.out.println(car.getName() + "\t" + car.getId() + "\t" + car.getOccupancy() + "\t" + 0 + "\t" + car.getPrice());
		System.out.println(truck.getName() + "\t" + truck.getId() + "\t" + truck.getOccupancy() + "\t" + 0 + "\t" + truck.getPrice());
		System.out.println("PkUpTrk" + "\t" + pickupTruck.getId() + "\t" + pickupTruck.getOccupancy() + "\t" + 0 + "\t" + pickupTruck.getPrice());
		
		int sum = 0;
		int number = 0, day = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("How many car and how many days would like to rent?");
		car.setNumber(s.nextInt());
		car.setDay(s.nextInt());
		sum += car.getNumber()*car.getDay()*car.getPrice();
		System.out.println("How many truck and how many days would like to rent?");
		truck.setNumber(s.nextInt());
		truck.setDay(s.nextInt());
		sum += truck.getNumber()*truck.getDay()*truck.getPrice();
		System.out.println("How many PkUpTrk and how many days would like to rent?");
		pickupTruck.setNumber(s.nextInt());
		pickupTruck.setDay(s.nextInt());
		sum += pickupTruck.getNumber()*pickupTruck.getDay()*pickupTruck.getPrice();
		
		System.out.println("Here is your conclusion:");
		System.out.println(car.getName() + "\t" + car.getNumber() + "\t" +car.getDay());
		System.out.println(truck.getName() + "\t" + truck.getNumber() + "\t" +truck.getDay());
		System.out.println("PkUpTrk" + "\t" + pickupTruck.getNumber() + "\t" +pickupTruck.getDay());
		System.out.println("Overall charge: " + sum);
		
	}

}

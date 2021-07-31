
public class VehicleDemo {

	public static void main(String[] args) {
		
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		Vehicle truck = new Vehicle(45, 22, 22);
		
		
		int dist = 252;
		
		System.out.println("To go " + dist + " miles minivan needs " + 
				minivan.gallons(dist) + " gallons of fuel.");
		
		System.out.println("To go " + dist + " miles sportscar needs " + 
				sportscar.gallons(dist) + " gallons of fuel.");
		

	}

}

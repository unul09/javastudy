
public class Vehicle {
	public int passengers;
	public int fuelcap;
	public int mpg;
	
	public Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	public int range() {
		return mpg * fuelcap;
	}
	
	public double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
	
	public double gallons(int dist) {
		return this.fuelneeded(dist);
	}

}

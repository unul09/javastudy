
public class MethodOverloading {
	
	public int getSum(int i, int j) {
		return i+j;
	}
	
	public int getSum(int i, int j, int k) {
		int a = this.getSum(i, j);
		return a+k;
	}
	
	public double getSum(double i, double j) {
		return i+j;
	}

}

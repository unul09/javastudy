
public class MethodOverloadingEx {

	public static void main(String[] args) {
		
		MethodOverloading a = new MethodOverloading();
		
		
		int i = a.getSum(1, 2);
		int j = a.getSum(1, 2, 3);
		double k = a.getSum(1.7, 2.1);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

}

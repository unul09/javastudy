
public class SampDemo {

	public static void main(String[] args) {
		
		Samp ob1 = new Samp(3);
		Samp ob2 = new Samp(3);
		Samp ob3 = new Samp(3);
		
		ob1.set(5);
		ob2.set(6);
		ob3.set(7);
		
		System.out.println(ob1.get());
		System.out.println(ob2.get());
		System.out.println(ob3.get());

	}

}

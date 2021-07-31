
public class CallByValueEx {

	public static void main(String[] args) {
		
		Person aPerson = new Person("ȫ�浿");
		int a = 33;
		
		aPerson.setAge(a);
		
		System.out.println(a);

	}

}

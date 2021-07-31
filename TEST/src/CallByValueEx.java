
public class CallByValueEx {

	public static void main(String[] args) {
		
		Person aPerson = new Person("홍길동");
		int a = 33;
		
		aPerson.setAge(a);
		//setAge()가 호출되면 매개변수 n이 생성된다.
		//setAge()가 끝나면 n은 사라진다.
		
		System.out.println(a);

	}

}

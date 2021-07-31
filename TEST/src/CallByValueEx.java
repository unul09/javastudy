
public class CallByValueEx {

	public static void main(String[] args) {
		
		Person aPerson = new Person("홍길동"); //person객체 aperson 생성
		MyInt a = new MyInt(33);//MyInt객체 a 생성
		
		aPerson.setAge(a);
		//객체가 복사되어 전달되는 것이 아닌, 객체에 대한 레퍼런스가 복사되어 전달된다.
		//MyInt객체 a 에서의 val값이 33 -> 34로 저장된다.
		
		System.out.println(a.val);
		//34 출력

	}

}

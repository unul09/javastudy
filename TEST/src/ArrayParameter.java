
public class ArrayParameter {
	
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++)
			if (a[i] == ' ')
				a[i] = ',';
		
	}
	
	static void printCharArray(char a[]) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}

}
/*
정적 메소드는 2가지로 간략히 말할 수 있다.



클래스의 인스턴스 없이 호출이 가능하며, 인스턴스에서는 호출 할 수 없다. 
유틸리티 함수를 만드는데 유용하게 사용된다.

한 문장으로 말하자면 다음과 같다.

"어떤 메소드가 인스턴스가 생성되지 않았더라도, 호출 할 것인가?"  => "그렇다."

위와 같다면, 그것은 정적이라고 보면 된다.

*/




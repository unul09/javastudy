
public class StaticDemo1 {

	public static void main(String[] args) {
		
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.n = 5; //s1 n=5
		s1.g(); // m=20
		s1.m = 50; // m=50
		
		s2 = new StaticSample();
		s2.n = 8; //s2 n=8
		s2.h(); // m=30
		s2.f(); // m=5
		System.out.println("s1 m:" + s1.m + "/ s1 n:" + s1.n);
		System.out.println("s2 m:" + s2.m + "/ s2 n:" + s2.n);
		
		//m�� static����̱� ������, ��ü���� ���� �����Ǵ� ���� �ƴ� �ϳ��� �����Ǵ� �����.

	}

}

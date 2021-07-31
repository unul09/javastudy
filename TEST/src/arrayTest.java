//import java.util.Scanner;
public class arrayTest { //메소드를 통한 배열 리턴받기 예제
	
	
	public static void main(String[] args) {		
		//Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=0; i<args.length; i++) {
			int n = Integer.parseInt(args[i]);
			sum += n;
		}
		
		System.out.println("합계는 " + sum);
		//sc.close();
			

	}

}

//import java.util.Scanner;
public class arrayTest { //�޼ҵ带 ���� �迭 ���Ϲޱ� ����
	
	
	public static void main(String[] args) {		
		//Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=0; i<args.length; i++) {
			int n = Integer.parseInt(args[i]);
			sum += n;
		}
		
		System.out.println("�հ�� " + sum);
		//sc.close();
			

	}

}

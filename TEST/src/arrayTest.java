import java.util.Scanner;
public class arrayTest { //0���� ���� �� �߻��ϴ� ArithmeticException ���� ó��
	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�������� �Է��Ͻÿ�:");
			int dividend = sc.nextInt(); // ������ �Է�
			System.out.print("�������� �Է��Ͻÿ�:");
			int divisor = sc.nextInt(); // ������ �Է�
			
			try {
				System.out.println(dividend+"�� "+divisor+"�� ���� ���� "+dividend/divisor+"�Դϴ�.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ������ ���ÿ�! �ٽ�.");
			}

		}
			
	}

}

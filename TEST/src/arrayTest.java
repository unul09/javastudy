import java.util.Scanner;
import java.util.InputMismatchException;

public class arrayTest { // �Է¿��� ����ó��

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��� �ּ���. -1 �Է½� ���α׷� ����");

		while (true) {
			try {
				System.out.print(">");
				int a = sc.nextInt();
				if (a == -1) {
					System.out.println("���α׷� ����");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�! �ٽ� �Է����ּ���");
				sc.next();
			}
		}

		sc.close();

	}

}

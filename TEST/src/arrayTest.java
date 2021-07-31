import java.util.Scanner;
import java.util.InputMismatchException;

public class arrayTest { // 입력오류 예외처리

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력해 주세요. -1 입력시 프로그램 종료");

		while (true) {
			try {
				System.out.print(">");
				int a = sc.nextInt();
				if (a == -1) {
					System.out.println("프로그램 종료");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다! 다시 입력해주세요");
				sc.next();
			}
		}

		sc.close();

	}

}

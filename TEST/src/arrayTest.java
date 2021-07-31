//import java.util.Scanner;
public class arrayTest { // 정수가 아닌 문자열을 정수로 변환할 때 예외 발생

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		String stringNumber[] = { "23", "4.555", "788", "df" };

		for (int i = 0; i < stringNumber.length; i++) {
			try {
				int num = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값은 " + num);
			} catch (NumberFormatException e) {
				System.out.println(stringNumber[i] + "은 정수 변환 불가");
			}

		}

		// sc.close();

	}

}

//import java.util.Scanner;
public class arrayTest { // ������ �ƴ� ���ڿ��� ������ ��ȯ�� �� ���� �߻�

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		String stringNumber[] = { "23", "4.555", "788", "df" };

		for (int i = 0; i < stringNumber.length; i++) {
			try {
				int num = Integer.parseInt(stringNumber[i]);
				System.out.println("������ ��ȯ�� ���� " + num);
			} catch (NumberFormatException e) {
				System.out.println(stringNumber[i] + "�� ���� ��ȯ �Ұ�");
			}

		}

		// sc.close();

	}

}

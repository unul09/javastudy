//import java.util.Scanner;
public class arrayTest { //������ ��� �迭�� ����
	
	
	public static void main(String[] args) {		
		//Scanner sc = new Scanner(System.in);
		int intArray[] = new int[4];
		
		
		
		try {
			for(int i=0; i<5; i++) {
			intArray[i] = 4;
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�� �ε����� ���� �Ұ��ѵ���.");
			
		}
		//sc.close();
			
	}

}

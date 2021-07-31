//import java.util.Scanner;
public class arrayTest { //범위를 벗어난 배열의 접근
	
	
	public static void main(String[] args) {		
		//Scanner sc = new Scanner(System.in);
		int intArray[] = new int[4];
		
		
		
		try {
			for(int i=0; i<5; i++) {
			intArray[i] = 4;
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("그 인덱스는 접근 불가한데요.");
			
		}
		//sc.close();
			
	}

}

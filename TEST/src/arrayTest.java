import java.util.Scanner;
public class arrayTest { //string array, for-each
	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String name[] = new String[3];
		
		for(String n : name) {
			n = sc.next();
			System.out.println(n);
		}
		sc.close();
			
	}

}

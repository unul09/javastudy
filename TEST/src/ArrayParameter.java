
public class ArrayParameter {
	
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++)
			if (a[i] == ' ')
				a[i] = ',';
		
	}
	
	static void printCharArray(char a[]) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}

}
/*
���� �޼ҵ�� 2������ ������ ���� �� �ִ�.



Ŭ������ �ν��Ͻ� ���� ȣ���� �����ϸ�, �ν��Ͻ������� ȣ�� �� �� ����. 
��ƿ��Ƽ �Լ��� ����µ� �����ϰ� ���ȴ�.

�� �������� �����ڸ� ������ ����.

"� �޼ҵ尡 �ν��Ͻ��� �������� �ʾҴ���, ȣ�� �� ���ΰ�?"  => "�׷���."

���� ���ٸ�, �װ��� �����̶�� ���� �ȴ�.

*/




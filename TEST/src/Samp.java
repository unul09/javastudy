
public class Samp {
	
	int id;
	
	public Samp(int id) {
		this.id = id;
		System.out.println("public Samp(int id)");
	}
	
	public Samp() {
		this.id = 0;
		System.out.println("public Samp()");
	}
	//������ �����ε�, �����ڴ� ����Ÿ�� ����. �������̸��� Ŭ�����̸��� ����
	
	public void set(int id) {
		this.id = id;
		System.out.println("set");
	}
	
	public int get() {
		System.out.println("get");
		return this.id;
	}

	public static void main(String[] args) {

		Samp ob1 = new Samp(3); 
		Samp ob2 = new Samp();
		//��ü1,2�� �� �ش� ������ ȣ��
		Samp s;
		
		ob1.set(5);
		ob2.set(6);
		

		System.out.println(ob1.get());
		System.out.println(ob2.get());
	

	}

}


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
	//생성자 오버로딩, 생성자는 리턴타입 없음. 생성자이름은 클래스이름과 동일
	
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
		//객체1,2는 각 해당 생성자 호출
		Samp s;
		
		ob1.set(5);
		ob2.set(6);
		

		System.out.println(ob1.get());
		System.out.println(ob2.get());
	

	}

}

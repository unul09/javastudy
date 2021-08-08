
public class DefaultConstructor {
	int x;
	public void setX(int x) {this.x = x;}
	public int getX() {return x;}

	public static void main(String[] args) {
		
		DefaultConstructor p = new DefaultConstructor();
		p.setX(3);
		System.out.println(p.getX());
		
		//디폴트 생성자가 컴파일러에 의해 자동 삽입된다고 하는데,
		//삽입된거 같긴 한데 보이지가 않는다. 문제가 있을까?

	}

}

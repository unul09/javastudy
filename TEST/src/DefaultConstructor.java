
public class DefaultConstructor {
	int x;
	public void setX(int x) {this.x = x;}
	public int getX() {return x;}
	
	public DefaultConstructor(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		
		DefaultConstructor p = new DefaultConstructor();
		p.setX(3);
		System.out.println(p.getX());
		
		
		/* 기본 생성자가 자동 생성되지 않는 경우
		 * 
		 * 클래스에 생성자가 하나라도 존재하면 자동으로 기본생성자가 생성되지 않음
		 */
	}

}

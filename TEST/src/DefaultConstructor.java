
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
		
		
		/* �⺻ �����ڰ� �ڵ� �������� �ʴ� ���
		 * 
		 * Ŭ������ �����ڰ� �ϳ��� �����ϸ� �ڵ����� �⺻�����ڰ� �������� ����
		 */
	}

}

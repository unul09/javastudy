
public class CallByValueEx {

	public static void main(String[] args) {
		
		Person aPerson = new Person("ȫ�浿"); //person��ü aperson ����
		MyInt a = new MyInt(33);//MyInt��ü a ����
		
		aPerson.setAge(a);
		//��ü�� ����Ǿ� ���޵Ǵ� ���� �ƴ�, ��ü�� ���� ���۷����� ����Ǿ� ���޵ȴ�.
		//MyInt��ü a ������ val���� 33 -> 34�� ����ȴ�.
		
		System.out.println(a.val);
		//34 ���

	}

}

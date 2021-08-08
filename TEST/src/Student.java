
public class Student {
	
	public String name=null;
	public int age=0;
	public char score='0';
	
	public Student(String name) {
		this.name = name;		
	}
	
	public Student(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public Student(String name, int age, char score) {
		this(name, age);
		this.score = score;
	}
	
	public void show() {
		System.out.println(name+" :" + age + " ::" + score);
	}

	public static void main(String[] args) {
		Student A = new Student("A");
		Student B = new Student("B", 17);
		Student C = new Student("C", 19, 'f');
		
		A.show();
		B.show();
		C.show();

	}

}

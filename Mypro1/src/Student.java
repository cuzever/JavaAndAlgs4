/**
 * ѧ����
 * @author 11522
 *
 */
public class Student {

	String name;
	int id;
	int weight;
	int age;
	String gender;
	Computer computer;

	public void study() {
		System.out.println(name+"����ѧϰ");
	}
	public void sayHello(String sname) {
		System.out.println(name+"��"+sname+"�ʺã�");
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age = 18;
		s1.name = "����";
		s1.study();
		s1.sayHello("����");
		
	}
	
	
}

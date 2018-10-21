/**
 * 学生类
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
		System.out.println(name+"正在学习");
	}
	public void sayHello(String sname) {
		System.out.println(name+"向"+sname+"问好！");
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age = 18;
		s1.name = "张三";
		s1.study();
		s1.sayHello("李四");
		
	}
	
	
}

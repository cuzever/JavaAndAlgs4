
public class TestOne {
	public static void main(String[] args) {

	Student s1 = new Student();
	s1.name = "����";
	s1.age = 18;
	
	Computer c = new Computer();
	c.brand = "����";
	c.cpuSpeed = 100;
	
	
	s1.computer = c;
	System.out.println(s1.computer.brand);
	
	
	
	
	}
}

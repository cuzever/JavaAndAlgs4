package cn.zhf.array;

public class Test01 {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 23;
		a[1] = 28;
		a[2] = 32; 
		
//		Car[] cars = new Car[2];
//		cars[0] = new Car("±¼³Û");
//		cars[1] = new Car("±¦Âí");
		Car[] cars = {new Car("±¼³Û"),new Car("±ÈÑÇµÏ"),new Car("±¦Âí")};
		Car c2 = new Car("±¼³Û");
		System.out.println(cars[0]==c2);
		System.out.println(cars[0].name==c2.name);

				
	}
}

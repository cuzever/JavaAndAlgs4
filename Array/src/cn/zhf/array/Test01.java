package cn.zhf.array;

public class Test01 {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 23;
		a[1] = 28;
		a[2] = 32; 
		
//		Car[] cars = new Car[2];
//		cars[0] = new Car("����");
//		cars[1] = new Car("����");
		Car[] cars = {new Car("����"),new Car("���ǵ�"),new Car("����")};
		Car c2 = new Car("����");
		System.out.println(cars[0]==c2);
		System.out.println(cars[0].name==c2.name);

				
	}
}

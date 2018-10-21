package cn.zhf.TestWrapperClass;
/**
 * 测试自动装箱和自动拆箱
 * @author 11522
 *
 */
public class TestBox {
	public static void main(String[] args) {
		Integer a = 1000; //jdk5.0 之后自动装箱，编译器改进为Integer a = new Integer(1000);
		Integer b = 2000;
		Integer a1 = new Integer(1000);
		System.out.println(a.intValue());
		System.out.println(b);
		System.out.println(a1);
		
		System.out.println("##########################");
		
		int c = new Integer(1500);//自动拆箱，编译器改进：new Integer(1500).intValue();
		int d = b;
		System.out.println(d);
		System.out.println(c);
		
		System.out.println("##########################");
		
		Integer e1 = 123;
		Integer e2 = 123;
		System.out.println(e1==e2);
		
		
	}
}

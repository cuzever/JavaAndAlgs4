package cn.zhf.TestWrapperClass;
/**
 * �����Զ�װ����Զ�����
 * @author 11522
 *
 */
public class TestBox {
	public static void main(String[] args) {
		Integer a = 1000; //jdk5.0 ֮���Զ�װ�䣬�������Ľ�ΪInteger a = new Integer(1000);
		Integer b = 2000;
		Integer a1 = new Integer(1000);
		System.out.println(a.intValue());
		System.out.println(b);
		System.out.println(a1);
		
		System.out.println("##########################");
		
		int c = new Integer(1500);//�Զ����䣬�������Ľ���new Integer(1500).intValue();
		int d = b;
		System.out.println(d);
		System.out.println(c);
		
		System.out.println("##########################");
		
		Integer e1 = 123;
		Integer e2 = 123;
		System.out.println(e1==e2);
		
		
	}
}

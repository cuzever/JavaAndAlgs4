import java.util.Scanner;


/**
 * ����Scanner��ʹ��
 * @author 11522
 *
 */
public class test01 {
	/**
	 * ��ͨ����
	 */

	
	public static void test1() {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(str);
		
	}
	/**
	 * �ӷ�����
	 * @author zhf
	 */
	public static void test2() {
		Scanner s = new Scanner(System.in);
		System.out.println("�����������");
		int a = s.nextInt();
		System.out.println("�����뱻������");
		int b = s.nextInt();
		int c = a+b;
		System.out.println("����ˣ��ͣ�"+c);
		
		
				
	}
	
	public static void main(String[] args) {
		
		test2();
		
	}
}

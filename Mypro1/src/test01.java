import java.util.Scanner;


/**
 * 测试Scanner的使用
 * @author 11522
 *
 */
public class test01 {
	/**
	 * 普通测试
	 */

	
	public static void test1() {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(str);
		
	}
	/**
	 * 加法运算
	 * @author zhf
	 */
	public static void test2() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入加数：");
		int a = s.nextInt();
		System.out.println("请输入被加数：");
		int b = s.nextInt();
		int c = a+b;
		System.out.println("算对了，和："+c);
		
		
				
	}
	
	public static void main(String[] args) {
		
		test2();
		
	}
}

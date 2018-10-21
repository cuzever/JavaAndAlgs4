package cn.zhf.TestWrapperClass;
/**
 * 测试包装类的基本用法
 * @author 11522
 *
 */
public class TestWrapperClass {

	public static void main(String[] args) {
		Integer i = new Integer(1000);
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		Integer i2 = Integer.parseInt("23456");
		System.out.println(i2);
	}
}

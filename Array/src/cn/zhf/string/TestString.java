package cn.zhf.string;

public class TestString {
	public static void main(String[] args) {
		String str = "abcd";
		String str2 = new String("abcd");
		String str3 = new String("abcd");
		String str4 = "abcd";
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str2==str3);
		System.out.println(str.equals(str2));
		System.out.println(str==str4);
		System.out.println(str.length());
		System.out.println(str.charAt(1));
	}
}

package cn.zhf.StringBuilder;

public class Test01 {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		a.delete(3, 5).append("abc");
		System.out.println(a);
		a.reverse();
		System.out.println(a);
		StringBuffer b = new StringBuffer();
	}
}

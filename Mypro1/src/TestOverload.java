
public class TestOverload {

	public static void main(String[] args) {
		MyMath m = new MyMath();
		int result = m.add(4, 5,8);
		System.out.println(result);
	}
}

class MyMath {
	public int add(int a,int b) {
		return a+b;
		
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
}
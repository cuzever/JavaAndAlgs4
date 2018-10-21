package cn.zhf.innerclass;

public class Outer {
	public static void main(String[] args) {
		Face f = new Face();
		Face.Nose n = f.new Nose();
		n.breath();

		Face.Ears e = new Face.Ears();
		e.listen();
		
	}
	
	
}

class Face {
	int type;
	String shape = "¹Ï×ÓÁ³";	
	static String color = "ºìÈó";
	class Nose{
		String type;
		String shape ="Ó¥¹³±Ç";
		
		void breath() {
			System.out.println(shape);
			System.out.println(Face.this.type);
			System.out.println("ºôÎü");
		}
	}
	
	static class Ears {
		
		void listen() {
			System.out.println();
			System.out.println("ÎÒÔÚÌı");
		}
	}
}
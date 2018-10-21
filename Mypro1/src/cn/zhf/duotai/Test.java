package cn.zhf.duotai;

public class Test {
	public static void testAnimal(Animal c) {
		c.voice();
	}
/*
	public static void testAnimal(Cat c) {
		c.voice();
	}
	
	public static void testAnimal(Dog c) {
		c.voice();
	}
	*/
	public static void main(String[] args) {
		Animal a = new Cat();
		Animal b = new Dog();
		Animal c = new Pig();
		a.voice();
		testAnimal(b);
		testAnimal(c);
		
		Cat a2 =(Cat)a;
		a2.catchMouse();
		
	}
}

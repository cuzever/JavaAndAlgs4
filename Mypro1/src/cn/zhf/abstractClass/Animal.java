package cn.zhf.abstractClass;

public abstract class Animal {
	String str;
	public abstract void run();
	public void breath() {
		System.out.println("呼吸");
		run();//实例化，多态例子；
	}
	
	public Animal() {
		System.out.println("创造一个动物");
	}
}

class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("猫步小跑");
		
	}	
}

class Dog  extends Animal{

	@Override
	public void run() {
		System.out.println("狗跑");
		
	}
	
}
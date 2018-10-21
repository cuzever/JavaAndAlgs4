package cn.zhf.learn;

public class Animal {

	String eye;
	
	public void run() {
		System.out.println("跑");
	}
	public void eat() {
		System.out.println("吃");
	}
}


class Mammal extends Animal{

	public void taisheng() {
		System.out.println("我是胎生");
	}
}

class Bird extends Animal{
	
	
	public void eggSheng() {
		System.out.println("我是卵生");
	}
	
}
package cn.zhf.abstractClass;

public abstract class Animal {
	String str;
	public abstract void run();
	public void breath() {
		System.out.println("����");
		run();//ʵ��������̬���ӣ�
	}
	
	public Animal() {
		System.out.println("����һ������");
	}
}

class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("è��С��");
		
	}	
}

class Dog  extends Animal{

	@Override
	public void run() {
		System.out.println("����");
		
	}
	
}
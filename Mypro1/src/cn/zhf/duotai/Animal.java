package cn.zhf.duotai;

public class Animal {
	String str;
	public void voice() {
		System.out.println("��ͨ�������");
	}

}

class Cat extends Animal{
	public void voice() {
		System.out.println("����");
	}
	public void catchMouse() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal{
	public void voice() {
		System.out.println("����");
	}
	public void seeDoor() {
		System.out.println("����");
	}
}

class Pig extends Animal{
	public void voice() {
		System.out.println("�ߺ�");
	}
}

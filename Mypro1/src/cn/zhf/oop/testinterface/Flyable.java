package cn.zhf.oop.testinterface;

public interface Flyable {
	int MAX_SPEED=11000;
	int MIN_HEIGHT=1;
	void fly();
}

interface Attack{
	
}
class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("�ɻ�������������");
		
	}
	
}

class Man implements Flyable{

	@Override
	public void fly() {
		System.out.println("���������ɣ�");
		
	}
	
}

class stone implements Flyable,Attack{

	@Override
	public void fly() {
		System.out.println("���ԣ��ɣ�");
		
	}

	
}

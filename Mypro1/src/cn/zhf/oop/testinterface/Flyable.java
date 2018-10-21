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
		System.out.println("飞机依靠发动机飞");
		
	}
	
}

class Man implements Flyable{

	@Override
	public void fly() {
		System.out.println("跳起来，飞！");
		
	}
	
}

class stone implements Flyable,Attack{

	@Override
	public void fly() {
		System.out.println("被仍，飞！");
		
	}

	
}

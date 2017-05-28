package spring.ex02.hw02;

public interface Refrigerator extends HomeAppliances{

	@Override
	public void turnOff();
	@Override
	public void turnOn();
	abstract void open();
	abstract void close();
}

package spring.ex02.hw02;

import org.springframework.stereotype.Component;

@Component
public class KimchiRefrigerator implements Refrigerator{
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("��ġ����� ����");
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("��ġ����� ����");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("��ġ����� ����");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("��ġ����� ����");
	}
}

package spring.ex02.hw02;

import org.springframework.stereotype.Component;

@Component
public class Radio implements HomeAppliances{
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
	}
}

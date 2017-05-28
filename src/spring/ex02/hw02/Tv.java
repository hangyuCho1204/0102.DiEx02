package spring.ex02.hw02;

import org.springframework.stereotype.Component;

@Component
public class Tv implements HomeAppliances{
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Æ¼ºñ ²¨Áü");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Æ¼ºñ ÄÑÁü");
	}
}

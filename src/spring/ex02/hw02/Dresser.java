package spring.ex02.hw02;

import org.springframework.stereotype.Component;

@Component
public class Dresser implements Furniture{
	@Override
	public void putIn() {
		// TODO Auto-generated method stub
		System.out.println("Dresser�� Dress�� putIn");
	}
	@Override
	public void putOut() {
		// TODO Auto-generated method stub
		System.out.println("Dresser�� Dress�� putOut");
	}
}

package spring.ex02.hw02;

import org.springframework.stereotype.Component;

@Component
public class Bookcase implements Furniture{
	@Override
	public void putIn() {
		// TODO Auto-generated method stub
		System.out.println("Bookcase�� å�� putIn");
	}
	@Override
	public void putOut() {
		// TODO Auto-generated method stub
		System.out.println("Bookcase�� å�� putOut");
	}
}

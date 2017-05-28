package spring.ex02.hw02;

import org.springframework.stereotype.Component;

@Component
public class Bookcase implements Furniture{
	@Override
	public void putIn() {
		// TODO Auto-generated method stub
		System.out.println("Bookcase에 책을 putIn");
	}
	@Override
	public void putOut() {
		// TODO Auto-generated method stub
		System.out.println("Bookcase에 책을 putOut");
	}
}

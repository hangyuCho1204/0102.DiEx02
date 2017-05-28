package spring.ex02.hw02;

import org.springframework.stereotype.Component;

@Component
public class Wardrobe implements Furniture{
	@Override
	public void putIn() {
		// TODO Auto-generated method stub
		System.out.println("Wardrobeø° ø ¿ª ≥÷¿Ω");
	}
	@Override
	public void putOut() {
		// TODO Auto-generated method stub
		System.out.println("Wardrobeø° ø ¿ª ≤®≥ø");
	}
}

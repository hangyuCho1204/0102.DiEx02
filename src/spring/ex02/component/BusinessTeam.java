package spring.ex02.component;

import org.springframework.stereotype.Component;

@Component
public class BusinessTeam implements Department{
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("¿µ¾÷");
	}
}

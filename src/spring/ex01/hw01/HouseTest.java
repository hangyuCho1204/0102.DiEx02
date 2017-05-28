package spring.ex01.hw01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HouseTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex01/hw01/BeanDeclare.xml");
		
		//byType
		
		Bookcase bc = (Bookcase)ctx.getBean("bc");
		Dresser br = (Dresser)ctx.getBean("br");
		Wardrobe wr = (Wardrobe)ctx.getBean("wr");
		KimchiRefrigerator kr = (KimchiRefrigerator)ctx.getBean("kr");
		NormalRefrigerator nr = (NormalRefrigerator)ctx.getBean("nr");
		Radio ra = (Radio)ctx.getBean("ra");
		Tv tv = (Tv)ctx.getBean("tv");
		
		bc.putIn();
		bc.putOut();
		
		br.putIn();
		br.putOut();
		
		wr.putIn();
		wr.putOut();
		
		kr.turnOn();
		kr.turnOff();
		kr.open();
		kr.close();
		
		nr.turnOn();
		nr.turnOff();
		nr.open();
		nr.close();
		
		ra.turnOn();
		ra.turnOff();
		
		tv.turnOn();
		tv.turnOff();
		
		/*Dresser
		Wardrobe
		KimchiRefrigerator
		NormalRefrigerator
		Radio
		Tv*/
		
	}
}
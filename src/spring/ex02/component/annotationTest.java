package spring.ex02.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex02/component/bean-annotation.xml");
		
		Employee employee = (Employee)ctx.getBean("employee");
		//System.out.println(emp);
	}
}

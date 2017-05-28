package spring.ex02.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex02/annotation/bean-annotation.xml");
		
		Employee employee = (Employee)ctx.getBean("employee");
		
		employee.dept.work();
	}
}


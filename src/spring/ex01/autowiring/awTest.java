package spring.ex01.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class awTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex01/autowiring/bean-autowiring.xml");
		
		Employee emp = (Employee)ctx.getBean("employee");
		System.out.println(emp.getName());
		System.out.println();
		emp.getDept().work();
	}
}

package spring.ex02.component;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	//@Autowired
	Department dept;
	
	public Employee(){}
	//@Autowired
	public Employee(Department dept){
		this.dept = dept;
	}
	
	//@Autowired
	public void play(Department dept){
		dept.work();
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
	
	
}

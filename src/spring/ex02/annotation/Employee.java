package spring.ex02.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	//@Qualifier("d01")
	Department dept;
	@Autowired(required=false)
	Kang k;
	public Employee(){}
	//@Autowired
	public Employee(Department dept){
		this.dept = dept;
	}
	
	//@Autowired(required=false)
	//@Qualifier("d01")
	public void play(Department dept){
		this.dept = dept;
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

	
	
	
	
	
}

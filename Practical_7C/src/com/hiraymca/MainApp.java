package com.hiraymca;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new ClassPathXmlApplicationContext("Beans.xml");
		Employee e=(Employee)factory.getBean("emp");
		e.display();
	}
}

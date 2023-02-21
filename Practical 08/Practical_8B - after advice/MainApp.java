package com.hiraymca;
import org.springframework.context.ApplicationContext;
import
org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
public static void main(String[] args) {
// TODO Auto-generated method stub
ApplicationContext context=new
ClassPathXmlApplicationContext("Beans.xml");
Student s=(Student)context.getBean("student");
s.getName();
s.getAge();
}
}
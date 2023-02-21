package com.hiraymca;
public class Student {
private int age;
private String name;
public int getAge() {
System.out.println("Age-"+age);
return age;
}
public void setAge(int age) {
this.age = age;
}
public String getName() {
System.out.println("Name="+name);
return name;
}
public void setName(String name) {
this.name = name;
}
}
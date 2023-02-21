package com.hiraymca;
import java.util.List;
import javax.sql.DataSource;
public class Student {
int id;
int rollno;
String sname;
int age;
public Student(int rollno, String sname, int age) {
this.rollno = rollno;
this.sname = sname;
this.age = age;
}
public int getId() {
return id;
}
public void setId(int id) {
    this.id = id;
}
public int getRollno() {
return rollno;
}
public void setRollno(int rollno) {
this.rollno = rollno;
}
public String getSname() {
return sname;
}
public void setSname(String sname) {
this.sname = sname;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
}
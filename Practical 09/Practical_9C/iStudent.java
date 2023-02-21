package com.hiraymca;
import java.util.List;
import javax.sql.DataSource;
public interface IStudent {
//setting data source
public void setDataSource(DataSource datasource);
//creating records- inserting record into table
public void create(int rollno,String name, int age);
//listing all records
public List<Student> listStudents();
}
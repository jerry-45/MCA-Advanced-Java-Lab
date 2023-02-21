package com.hiraymca;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.RowMapper;
public class StudentMapper implements RowMapper<Student>
{
public Student mapRow(ResultSet rs, int rowNum) throws
SQLException {
    Student student = new Student();
student.setId(rs.getInt("id"));
student.setRollno(rs.getInt("rollno"));
student.setSname(rs.getString("sname"));
student.setAge(rs.getInt("age"));
return student;
}
}
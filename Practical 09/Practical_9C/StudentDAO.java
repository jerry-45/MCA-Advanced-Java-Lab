package com.hiraymca;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDAO {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
    }
    public Boolean saveStudent(final Student s)
    {
    String query="insert into
    student2(rollno,sname,age)values(?,?,?)";
    return jdbcTemplate.execute(query,new
    PreparedStatementCallback<Boolean>() {
    @Override
    public Boolean doInPreparedStatement(PreparedStatement
    ps)
    throws SQLException, DataAccessException {
    ps.setInt(1,s.getRollno());
    ps.setString(2,s.getSname());
    ps.setFloat(3,s.getAge());
    return ps.execute();
    }
    });
    }
    public List<Student> getAllStudents(){
    return jdbcTemplate.query("select * from student2",
    new ResultSetExtractor<List<Student>>() {
        @Override
public List<Student> extractData(ResultSet rs)
throws SQLException, DataAccessException {
// TODO Auto-generated method stub
List<Student>list=new ArrayList<Student>();
while(rs.next())
{
Student s=new Student();
s.setId(rs.getInt(1));
s.setRollno(rs.getInt(2));
s.setSname(rs.getString(3));
s.setAge(rs.getInt(4));
list.add(s);
}
return list;
}
});
}
}
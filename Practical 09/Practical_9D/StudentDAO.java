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
    public List<Student> listStudents() {
        // TODO Auto-generated method stub
        String sql="select * from student2";
        List<Student> students=jdbcTemplate.query(sql, new
        StudentMapper());
        return students;
        }
        }
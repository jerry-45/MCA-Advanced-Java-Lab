package com.hiraymca;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
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
    }
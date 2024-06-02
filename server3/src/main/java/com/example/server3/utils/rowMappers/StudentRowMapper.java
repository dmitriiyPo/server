package com.example.server3.utils.rowMappers;

import com.example.server3.enums.StudentStatus;
import com.example.server3.model.Student;
import org.flywaydb.core.internal.jdbc.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs) throws SQLException {
        long id = rs.getLong("id");
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String patronymic = rs.getString("patronymic");
        StudentStatus status = StudentStatus.valueOf(rs.getString("status"));
        long idGroup = rs.getLong("group_id");
        return new Student(id, firstName, lastName, patronymic, idGroup, status);
    }
}

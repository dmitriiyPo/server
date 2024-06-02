package com.example.server3.repository.impl;

import com.example.server3.exception.RepositoryException;
import com.example.server3.model.Student;
import com.example.server3.repository.IStudentRepository;
import com.example.server3.utils.pojos.CreateOrUpdateStudentPojo;
import com.example.server3.utils.rowMappers.StudentRowMapper;
import lombok.Builder;
import lombok.Data;
import org.apache.logging.log4j.CloseableThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Types;
import java.util.List;


@Repository
@Data
@Builder
public class StudentRepository implements IStudentRepository {

    private final JdbcTemplate jdbc;
    private final StudentRowMapper studentRowMapper;

    @Autowired
    public StudentRepository(JdbcTemplate jdbc, StudentRowMapper studentRowMapper) {
        this.jdbc = jdbc;
        this.studentRowMapper = studentRowMapper;
    }

    @Override
    public long addStudent(CreateOrUpdateStudentPojo studentPojo) throws RepositoryException {

        String sql = "INSERT INTO student (first_name, last_name, patronymic, id_group, status) " +
                "VALUES(?, ?, ?, ?, ?)";
        
        KeyHolder keyHolder = new GeneratedKeyHolder();
        try{

            jdbc.update((Connection connection) -> {
                    PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
                    ps.setString(1, studentPojo.getFirstName());
                    ps.setString(2, studentPojo.getLastName());
                    ps.setString(3, studentPojo.getPatronymic());
                    ps.setLong(4, studentPojo.getIdGroup());
                    ps.setString(5, String.valueOf(studentPojo.getStatus()));
                    return ps;
                },
                keyHolder
            );
            return keyHolder.getKey().longValue();

        }catch (Exception e) {
            throw new RepositoryException("BD EROOR WHILE ADD STUDENT: query " + sql + "Student" + studentPojo, e);
        }
    }

    @Override
    public void editStudent(long studentId, CreateOrUpdateStudentPojo studentPojo) throws RepositoryException {
        String sql = "UPDATE student SET first_name = ?, last_name = ?, patronymic = ?, id_group = ?, status = ? WHERE id = ?";

        try{
            jdbc.update(sql,
                    new Object[] {studentPojo.getFirstName(), studentPojo.getLastName(), studentPojo.getPatronymic(),
                            studentPojo.getIdGroup(), String.valueOf(studentPojo.getStatus()), studentId},
                    new int[] {Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.BIGINT, Types.VARCHAR, Types.BIGINT}
            );
        }catch (Exception e) {
            throw new RepositoryException("BD ERROR WHILE EDIT STUDENT: query " + sql + "Student" + studentId, e);
        }
    }

    @Override
    public void deleteStudentById(long studentId) throws RepositoryException {
        String sql ="DELETE FROM student WHERE id = ?";
        try{
            jdbc.update(sql, new Object[]{studentId}, new int[]{Types.BIGINT});
        }catch (Exception e) {
            throw new RepositoryException("BD ERROR WHILE DELETE STUDENT BY ID: query " + sql + "ID" + studentId, e);
        }
    }

    @Override
    public Student getStudentById(long studentId) throws RepositoryException {
        String sql = "SELECT id, first_name, last_name, patronymic, id_group, status FROM student WHERE id = ?";

        try{

//            return jdbc.queryForObject(sql, new Object[]{studentId}, new int[]{Types.BIGINT});
          

        }catch (Exception e) {
            throw new RepositoryException("Student getting by id error: query " + sql + "ID" + studentId, e);
        }
    }

    @Override
    public List<Student> getStudentByGroup(long idGroup) throws RepositoryException {
        return null;
    }


}

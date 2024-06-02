package com.example.server3.repository;

import com.example.server3.exception.RepositoryException;
import com.example.server3.model.Student;
import com.example.server3.utils.pojos.CreateOrUpdateStudentPojo;

import java.util.List;

public interface IStudentRepository {

    /**
     * добавление студента
     * @param student студент (с id == null)
     * @return id (!= null) добавленого студента
     */
    long addStudent(CreateOrUpdateStudentPojo studentPojo) throws RepositoryException;

    /**
     * редактирование студента
     * @param student студент (с id != null)
     */
    void editStudent(long studentId, CreateOrUpdateStudentPojo studentPojo) throws RepositoryException;

    /**
     * удаление студента
     * @param id id студента
     */
    void deleteStudentById(long studentId) throws RepositoryException;

    /**
     * получение студента по id
     * @param id id студента
     * @return студент
     */
    Student getStudentById(long id) throws RepositoryException;

    /**
     * получение студентов по id группы
     * @param idGroup id группы
     * @return список студентов из группы
     */
    List<Student> getStudentByGroup(long idGroup) throws RepositoryException;
}

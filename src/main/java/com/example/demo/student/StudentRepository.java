package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

    @Query("SELECT s FROM Student s WHERE s.name = ?1")
    Optional<Student> findStudentByName(String name);

    @Query("SELECT s FROM Student s WHERE s.parentName = ?1")
    Optional<Student> findStudentByParentName(String parentName);

//    @Query("SELECT s FROM Student s WHERE s.name = ?1 AND s.parentName = ?1")
//    Optional<Student> findStudentByNameAndParentName(String name, String parentName);

}

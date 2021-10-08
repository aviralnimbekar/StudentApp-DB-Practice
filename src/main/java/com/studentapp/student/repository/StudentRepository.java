package com.studentapp.student.repository;

import com.studentapp.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

    @Override
    Optional<StudentEntity> findById(Integer integer);
}

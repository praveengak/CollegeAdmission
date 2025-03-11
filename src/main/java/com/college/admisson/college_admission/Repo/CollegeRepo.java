package com.college.admisson.college_admission.Repo;

import com.college.admisson.college_admission.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface CollegeRepo extends JpaRepository<Student, UUID> {
}

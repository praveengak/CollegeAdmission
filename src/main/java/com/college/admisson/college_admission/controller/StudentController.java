package com.college.admisson.college_admission.controller;

import com.college.admisson.college_admission.DTO.StudentRequestDTO;
import com.college.admisson.college_admission.DTO.StudentResponseDTO;
import com.college.admisson.college_admission.Service.CollegeService;
import com.college.admisson.college_admission.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentController {

    private final CollegeService collegeService;

    public StudentController(CollegeService collegeService){
        this.collegeService=collegeService;
    }

    @GetMapping
    public ResponseEntity<List<StudentResponseDTO>> getAllPatientDetails(){
        List<StudentResponseDTO> studentResponseDTO = collegeService.getAllPatientDetails();

        return ResponseEntity.ok().body(studentResponseDTO);
    }
}

package com.college.admisson.college_admission.mapper;

import com.college.admisson.college_admission.DTO.StudentResponseDTO;
import com.college.admisson.college_admission.model.Student;

public class StudentMapper {

    public static StudentResponseDTO toDto(Student student){
        StudentResponseDTO studentResponseDTO = new StudentResponseDTO();
        studentResponseDTO.setName(student.getStudentName());
        studentResponseDTO.setAddress(student.getAddress());
        studentResponseDTO.setEmail(student.getEmail());
        studentResponseDTO.setTotalMark(student.getTotalMark());
        studentResponseDTO.setPhoneNumber(student.getPhoneNumber());
        studentResponseDTO.setHscId(student.getHscId());

        return studentResponseDTO;
    }
}

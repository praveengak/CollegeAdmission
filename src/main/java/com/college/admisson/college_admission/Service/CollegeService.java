package com.college.admisson.college_admission.Service;

import com.college.admisson.college_admission.DTO.StudentRequestDTO;
import com.college.admisson.college_admission.DTO.StudentResponseDTO;
import com.college.admisson.college_admission.Repo.CollegeRepo;
import com.college.admisson.college_admission.mapper.StudentMapper;
import com.college.admisson.college_admission.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.StreamSupport.stream;

@Service
public class CollegeService {

    private CollegeRepo collegeRepo;

    public CollegeService(CollegeRepo collegeRepo){
        this.collegeRepo=collegeRepo;
    }


    public List<StudentResponseDTO> getAllPatientDetails() {
        List<Student>  students=collegeRepo.findAll();
        List<StudentResponseDTO> studentResponseDTOS = new ArrayList<>();

        for(int i =0;i<students.size();i++){
            Student student = students.get(i);
            StudentResponseDTO studentResponseDTO = StudentMapper.toDto(student);
            studentResponseDTOS.add(studentResponseDTO);
        }

        return studentResponseDTOS;
    }
}

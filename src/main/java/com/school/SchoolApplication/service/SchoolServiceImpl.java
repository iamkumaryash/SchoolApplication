package com.school.SchoolApplication.service;

import com.school.SchoolApplication.Repository.SchoolRepository;
import com.school.SchoolApplication.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    @Override
    public Optional<School> getSchool(int id){
        Optional<School> school = schoolRepository.findById(id);
        return school;
    }

    @Override
    public List<School> getAllSchool(){
        List<School> schoolList = (List<School>) schoolRepository.findAll();
        return schoolList;
    }


}

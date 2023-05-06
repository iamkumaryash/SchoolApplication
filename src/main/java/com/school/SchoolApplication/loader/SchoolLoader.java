package com.school.SchoolApplication.loader;

import com.school.SchoolApplication.Repository.SchoolRepository;
import com.school.SchoolApplication.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class SchoolLoader {

    @Autowired
    private SchoolRepository schoolRepository;

    @PostConstruct
    @Transactional
    public void loadAll() {
        System.out.println("LOADING DATA");
        schoolRepository.saveAll(getData());
        System.out.println("LOADING COMPLETE");
    }

 private List<School> getData(){
     List<School> schoolList = new ArrayList<>();
     schoolList.add(new School("KSM", 1, "CS"));
     schoolList.add(new School("KYM", 2, "IT"));
     schoolList.add(new School("AKM", 3, "EC"));
     schoolList.add(new School("SM", 4, "MECH"));

     return schoolList;
 }
}

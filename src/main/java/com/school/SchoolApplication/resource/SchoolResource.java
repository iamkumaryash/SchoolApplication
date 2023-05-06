package com.school.SchoolApplication.resource;

import com.school.SchoolApplication.Repository.SchoolRepository;
import com.school.SchoolApplication.model.School;
import com.school.SchoolApplication.service.SchoolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("rest/School")
public class SchoolResource {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    SchoolServiceImpl schoolService;

    @GetMapping("/getSchool")    //localhost:8080/rest/getSchool
    public Optional<School> getSchool() {
        int id = 1;
        Optional<School> school = schoolService.getSchool(id);
        System.out.println(school + "1");
        return school;
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody School school) {
        schoolRepository.save(school);
        System.out.println("STUDENT ADDED SUCCESSFULLY");
    }

    @GetMapping("/getAllSchool")    //localhost:8080/rest/getSchool
    public List<School> getAllSchool() {
        List<School> school = schoolService.getAllSchool();
        System.out.println(school);
        return school;
    }

    @GetMapping("/getSchool/{id}")    //localhost:8080/rest/getSchool
    @ResponseBody
    public String getSchool(@RequestParam int id) {
        String school = schoolService.getSchool(id).get().getName();
        System.out.println(school);
        return school;
    }
}

//    @PostMapping("/add/{name}/{dept}") // Map ONLY POST Requests
//    public void addNewUser (@RequestParam String name
//            , @RequestParam String dept) {
//        // @ResponseBody means the returned String is the response, not a view name
//        // @RequestParam means it is a parameter from the GET or POST request
//
//        School n = new School();
//        n.setName(name);
//        n.setRollNo(55);
//        n.setDepartment(dept);
//        schoolRepository.save(n);
//    }


    //@PostMapping("/add/{name}/{dept}") // Map ONLY POST Requests
    //public void addNewUser (@RequestParam String name,@RequestParam String dept) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

       // School n = new School();
       // n.setName(name);
       // n.setRollNo(55);
       // n.setDepartment(dept);
        //schoolRepository.save(n);
    //hello

package com.school.SchoolApplication.service;

import com.school.SchoolApplication.model.School;

import java.util.List;
import java.util.Optional;

public interface SchoolService {
    Optional<School> getSchool(int a);

    List<School> getAllSchool();
}

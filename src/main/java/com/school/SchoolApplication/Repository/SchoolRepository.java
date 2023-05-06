package com.school.SchoolApplication.Repository;

import com.school.SchoolApplication.model.School;
import org.springframework.data.repository.CrudRepository;

public interface SchoolRepository extends CrudRepository<School, Integer> {
}

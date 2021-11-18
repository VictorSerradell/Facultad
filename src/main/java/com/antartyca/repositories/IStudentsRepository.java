package com.antartyca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antartyca.domain.Students;
import com.antartyca.domain.StudentsPresenter;
import com.antartyca.model.Course;
@Repository
public interface IStudentsRepository extends JpaRepository<com.antartyca.model.Students,Long> {

	List<Course>findByName(String name);

	StudentsPresenter save(StudentsPresenter studentsModel);

	com.antartyca.model.Students save(com.antartyca.model.Students studentsModel);
}

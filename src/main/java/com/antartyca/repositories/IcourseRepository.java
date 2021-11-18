package com.antartyca.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antartyca.model.Course;
import com.antartyca.model.Students;
@Repository
public interface IcourseRepository  extends JpaRepository<Course, Long> {

	List<Course> findByNameAndActiveTrueOrderBySurnameAsc(String name);

	Students save(Students coursesModel);

	Course save(Course coursesModel);

	Optional<com.antartyca.domain.Course> findById(String id);

	List<com.antartyca.domain.Course> getStudentsList();

	List<com.antartyca.domain.Course> getTeacherList();

}

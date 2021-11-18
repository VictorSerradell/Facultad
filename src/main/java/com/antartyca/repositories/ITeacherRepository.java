package com.antartyca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antartyca.model.Teacher;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher,Long>{

//	List<Course>findByName(String name);
//
//
//	com.antartyca.model.Teacher save(com.antartyca.model.Teacher teacherModel);
//
//
//	java.util.Optional<com.antartyca.model.Teacher> findById(String id);
//
//
//	List<Teacher> findByFirstnameEquals(String name);
//
//
//	List<Teacher> findByStartDateBetween(Date dateOfBird);



	}

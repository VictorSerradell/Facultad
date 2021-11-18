package com.antartyca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antartyca.model.Students;

@Repository
public interface IStudentsRepository extends JpaRepository<Students,Long> {

	List<Students>findByName(String name);

}

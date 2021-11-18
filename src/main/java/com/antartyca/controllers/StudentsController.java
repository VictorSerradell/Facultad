package com.antartyca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antartyca.domain.Students;
import com.antartyca.domain.StudentsPresenter;
import com.antartyca.repositories.IStudentsRepository;
import com.antartyca.services.impl.StudentsServiceImpl;
import com.antartyca.validation.StudentsValidatorImpl;

@RestController
@RequestMapping(value ="/Students")
public class StudentsController {
	
	@Autowired
	private StudentsServiceImpl studentService;
	
	@Autowired
	private StudentsValidatorImpl studentValidator;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?>getStudent(@PathVariable(name = "id") String studentId){
		
		StudentsPresenter studentPresenter = studentService.getStudents(studentId);
		
		return new ResponseEntity<>(studentPresenter,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?>createStudent(@RequestBody Students students){
		
		if(!studentValidator.validateStudents(students))
			return new ResponseEntity<>(HttpStatus.PRECONDITION_FAILED);
		
		StudentsPresenter studentsPresenter = studentService.createStudents(students);
		return new ResponseEntity<>(studentsPresenter,HttpStatus.OK);
	}
	
	

}

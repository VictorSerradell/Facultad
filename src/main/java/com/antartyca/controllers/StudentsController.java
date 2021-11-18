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

import com.antartyca.domain.StudentRegisterDto;
import com.antartyca.domain.StudentsPresenterDto;
import com.antartyca.services.IStudentsService;
import com.antartyca.validation.IStudentsValidator;

@RestController
@RequestMapping(value ="/Students")
public class StudentsController {
	
	@Autowired
	private IStudentsService studentService;
	
	@Autowired
	private IStudentsValidator studentValidator;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?>getStudent(@PathVariable(name = "id") Long studentId){
		
		StudentsPresenterDto studentPresenter = studentService.getStudents(studentId);
		
		return new ResponseEntity<StudentsPresenterDto>(studentPresenter,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?>createStudent(@RequestBody StudentRegisterDto students){
		
		if(!studentValidator.validateStudentRegister(students))
			return new ResponseEntity<String>(HttpStatus.PRECONDITION_FAILED);
		
		StudentsPresenterDto studentsPresenter = studentService.createStudents(students);
		return new ResponseEntity<StudentsPresenterDto>(studentsPresenter,HttpStatus.OK);
	}
	
	

}

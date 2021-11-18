package com.antartyca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antartyca.domain.Teacher;
import com.antartyca.domain.TeacherPresenter;
import com.antartyca.services.ITeacherService;
import com.antartyca.validation.ITeacherValidator;

@RestController
@RequestMapping(value ="/Teacher")
public class TeacherController {
	
	@Autowired
	private ITeacherValidator teacherValidator;
	
	@Autowired
	private ITeacherService teacherService;
	
	
	
	public String getString1() {
		return "users";
	}
	
	
	@GetMapping(value = "/{id}" )
	public String getUserById(@PathVariable(name = "id") String userId) {
		System.out.println();
		return userId;
	}
	
	@PostMapping
	public ResponseEntity<?> createTeacher(@RequestBody Teacher teacher){
		
		if(!teacherValidator.validateTeacher(teacher))
			return new ResponseEntity<>(HttpStatus.PRECONDITION_FAILED);
		
		TeacherPresenter teacherPresenter = teacherService.createTeacher(teacher);
		
		return new ResponseEntity<>(teacherPresenter, HttpStatus.OK);
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity<?> listTeachers(){
		List<TeacherPresenter> teacherList = teacherService.listTeachers();
		return new ResponseEntity<>(teacherList, HttpStatus.OK);
	}
	
	@PutMapping("/{id}/activate")
	public ResponseEntity<?> activate(@PathVariable(name = "id") String personId){
		
		TeacherPresenter teacher = teacherService.activate(personId);
		return new ResponseEntity<>(teacher, HttpStatus.OK);
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<?> getTeacherByName(@PathVariable(name = "name") String teacherName){
		
		List<TeacherPresenter> teacher = teacherService.getTeacherByName(teacherName);
		return new ResponseEntity<>(teacher, HttpStatus.OK);
	}
}
package com.antartyca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.antartyca.domain.TeacherPresenterDto;
import com.antartyca.domain.TeacherRegisterDto;
import com.antartyca.services.ITeacherService;
import com.antartyca.validation.ITeacherValidator;

@RestController
@RequestMapping(value ="/Teacher")
public class TeacherController {
	
	@Autowired
	private ITeacherValidator teacherValidator;
	
	@Autowired
	private ITeacherService teacherService;
	
	
	@PostMapping
	public ResponseEntity<?> createTeacher(@RequestBody TeacherRegisterDto teacher){
		
		if(!teacherValidator.validateTeacherRegister(teacher)) {
			return new ResponseEntity<>(HttpStatus.PRECONDITION_FAILED);
		}
		
		TeacherPresenterDto teacherPresenter = teacherService.createTeacher(teacher);
		
		return new ResponseEntity<TeacherPresenterDto>(teacherPresenter, HttpStatus.OK);
	}
	
		
	@GetMapping(value = "/{id}" )
	public String getUserById(@PathVariable(name = "id") String userId) {
		//System.out.println();
		return userId;
	}
	
	
	
	@GetMapping(value = "/list")
	public ResponseEntity<?> listTeachers(){
		//List<TeacherPresenter> teacherList = teacherService.listTeachers();
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	@PutMapping("/{id}/activate")
	public ResponseEntity<?> activate(@PathVariable(name = "id") Long teacherId, @RequestParam(name = "activo") boolean activo ){
		
		TeacherPresenterDto teacher = teacherService.activate(teacherId,activo);
		return new ResponseEntity<TeacherPresenterDto>(teacher, HttpStatus.OK);
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<?> getTeacherByName(@PathVariable(name = "name") String teacherName){
		
		//List<TeacherPresenter> teacher = teacherService.getTeacherByName(teacherName);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
}
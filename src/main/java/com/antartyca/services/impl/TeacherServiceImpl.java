package com.antartyca.services.impl;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antartyca.converters.ICourseConverter;
import com.antartyca.converters.ITeacherConverter;
import com.antartyca.domain.TeacherPresenter;
import com.antartyca.model.Teacher;
import com.antartyca.repositories.ITeacherRepository;
import com.antartyca.services.ITeacherService;

@Service
public class TeacherServiceImpl implements ITeacherService {
	
	@Autowired
	private ITeacherConverter teacherConverter;
	
	@Autowired
	private ITeacherRepository teacherRepository;
	
	@Autowired
	private ICourseConverter courseConverter;
	
	
	@Override
	public List<TeacherPresenter> listTeachers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Id
	@Override
	public TeacherPresenter getTeacher(String id) {
		
		Optional<Teacher> teacherOpt = teacherRepository.findById(id);
		Teacher teacherModel;
		
		try {
			teacherModel = teacherOpt.orElseThrow();
		}catch (NoSuchElementException nsee) {
			return null;
		}
		
		TeacherPresenter teacherPresenter = teacherConverter.convert(teacherModel);
		
		return teacherPresenter;
	}
	
	///Create Teacher
	
	@Override
	public TeacherPresenter createTeacher(com.antartyca.domain.Teacher teacherDomain) {
	
	Teacher teacherModel = teacherConverter.convert(teacherDomain);
	
	teacherModel = teacherRepository.save(teacherModel);
	
	TeacherPresenter teacherPresenter = teacherConverter.convert(teacherModel);
	
	return teacherPresenter;
	
	}
	
	
	//ListTeacher by name Equals ("nombre" con igual)
	@Override
	public List<TeacherPresenter> getTeacherByName(String name) {
		
		List<Teacher> teachersListModel = teacherRepository.findByFirstnameEquals(name);
		
		List<TeacherPresenter> teachersListDomain = 
				teachersListModel.stream()
				.map(t -> teacherConverter.convert(t))
				.collect(Collectors.toList());
		
		return teachersListDomain;
	}
	
	
	//ListTeacher by secondName Like("apellidos" con LIKE)
	
	@Override
	public List<TeacherPresenter> findByFirstSecondNameLike(String secondName) {
		
		List<Teacher> teachersListModel = teacherRepository.findByFirstnameEquals(secondName);
		
		List<TeacherPresenter> teachersListDomain = 
				teachersListModel.stream()
				.map(t -> teacherConverter.convert(t))
				.collect(Collectors.toList());
		
		return teachersListDomain;
	}
	
	
	///ListTeacher byBetween ("fecha_nacimiento" con un rango")
	
	@Override
	public List<TeacherPresenter> findByStartDateBetween(Date dateOfBird) {
		
		List<Teacher> teachersListModel = teacherRepository.findByStartDateBetween(dateOfBird);
		
		List<TeacherPresenter> teachersListDomain = 
				teachersListModel.stream()
				.map(t -> teacherConverter.convert(t))
				.collect(Collectors.toList());
		
		return teachersListDomain;
	}
	
	

	@Override
	public TeacherPresenter activate(String personId) {
		Optional<Teacher> personOpt = teacherRepository.findById(personId);
		Teacher teacherModel;
		
		try {
			teacherModel = personOpt.orElseThrow();
		}catch (NoSuchElementException nsee) {
			return null;
		}
		
		teacherModel.setActive(!teacherModel.isActive());
		teacherRepository.save(teacherModel);
		
		com.antartyca.domain.TeacherPresenter personPresenter = teacherConverter.convert(teacherModel);

		return personPresenter;
	}

	@Override
	public List<TeacherPresenter> findByFirstnameLike(String Name) {
		List<Teacher> teachersListModel = teacherRepository.findByFirstnameEquals(Name);
		
		List<TeacherPresenter> teachersListDomain = 
				teachersListModel.stream()
				.map(t -> teacherConverter.convert(t))
				.collect(Collectors.toList());
		
		return teachersListDomain;
		
	}

	
	
	
}

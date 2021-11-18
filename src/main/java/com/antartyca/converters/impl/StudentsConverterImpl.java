package com.antartyca.converters.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antartyca.converters.ICourseConverter;
import com.antartyca.converters.IStudentsConverter;
import com.antartyca.domain.StudentRegisterDto;
import com.antartyca.domain.StudentsPresenterDto;
import com.antartyca.model.Students;

@Service
public class StudentsConverterImpl implements IStudentsConverter {

	@Autowired
	private IStudentsConverter studentsConverter;

	@Autowired
	private ICourseConverter courseConverter;

	@Override
	public Students convert(StudentRegisterDto studentsDomain) {
		
		
		Students result = new Students();
		
		result.setName(studentsDomain.getNombre());
		result.setSurname(studentsDomain.getSurname());
		result.setAge(studentsDomain.getEdad());
		result.setPassword(studentsDomain.getPass());
		
		result.setCreateAt(new Date());
		
		return result;
	}

	@Override
	public StudentsPresenterDto convert(Students studentsModel) {
		
		StudentsPresenterDto result = new StudentsPresenterDto();
		result.setName(studentsModel.getName());
		result.setSurname(studentsModel.getSurname());
		result.setAge(studentsModel.getAge());
		
		result.setFullName(studentsModel.getName() + " " + studentsModel.getSurname());
		
		
		//TODO tranformer de courseDTo to course y al reves
		//result.setCourseList(null);
		//TODO tranformer de studentDTo to student y al reves
		//result.setStudentsList(studentsList);
		
		return result;
	}

	/*
	 * @Override public StudentsPresenter convert(com.antartyca.model.Students
	 * studentsModel) {
	 * 
	 * StudentsPresenter studentsPresenter = new StudentsPresenter();
	 * 
	 * 
	 * studentsPresenter.setName(studentsModel.getName());
	 * studentsPresenter.setSurname(studentsModel.getSurname());
	 * studentsPresenter.setAge(studentsModel.getAge());
	 * studentsPresenter.setCourseList();
	 * 
	 * List<CoursePresenter>courseListDomain = new ArrayList<>();
	 * 
	 * 
	 * 
	 * if(studentsModel.getCourseList() != null &&
	 * !studentsModel.getCourseList().isEmpty()) { courseListDomain =
	 * studentsModel.getCourseList() .stream().map(course ->
	 * courseConverter.convert(course)) .collect(Collectors.toList()); }
	 * 
	 * studentsPresenter.setCourseList();
	 * 
	 * return studentsPresenter;
	 * 
	 * 
	 * }
	 */

	/*
	 * @Override public Students convert(com.antartyca.domain.Students
	 * studentsDomain) {
	 * 
	 * Students studentsModel = new Students();
	 * 
	 * studentsModel.setName(studentsDomain.getName());
	 * studentsModel.setSurname(studentsDomain.getSurname());
	 * studentsModel.setAge(studentsDomain.getAge());
	 * studentsModel.setPassword(studentsDomain.getPassword());
	 * //studentsModel.setCourseList(studentsDomain.getListCourse());;
	 * 
	 * return studentsModel; }
	 * 
	 * @Override public StudentsPresenter convert(StudentsPresenter
	 * studentsPresenter) { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public Object convert(Course course) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public StudentsPresenter convertl(Students studentsModel) { // TODO
	 * Auto-generated method stub return null; }
	 */

}

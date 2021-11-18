package com.antartyca.converters.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antartyca.converters.ICourseConverter;
import com.antartyca.converters.IStudentsConverter;
import com.antartyca.domain.Course;
import com.antartyca.domain.CoursePresenter;
import com.antartyca.domain.StudentsPresenter;
import com.antartyca.model.Students;

@Service("studentsConverterImpl")
public class StudentsConverterImpl implements IStudentsConverter {

	@Autowired
	private IStudentsConverter studentsConverter;

	@Autowired
	private ICourseConverter courseConverter;

	@Override
	public Students convert(com.antartyca.domain.Students studentsDomain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentsPresenter convert(Students studentsModel) {
		// TODO Auto-generated method stub
		return null;
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

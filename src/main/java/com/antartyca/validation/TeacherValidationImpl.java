package com.antartyca.validation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;


import com.antartyca.domain.Teacher;
import com.antartyca.domain.TeacherPresenter;

@Service("teacherValidatorImpl")
public class TeacherValidationImpl  implements ITeacherValidator{

	
	  @Value("${patterns.password}") private String passwordPattern;
	  
	  @Override public boolean validateTeacher(TeacherPresenter teacher ) {
	  
	  if(teacher.getName().length() > 5) return false;
	  
	
	  
	  return true; }
	 
	  @Override
		public boolean validateTeacher(Teacher teacher) {
			
			if(teacher == null)
				return false;

			if(StringUtils.isBlank(teacher.getName()) || teacher.getName().length() < 5)
				return false;
		
			
			Pattern pattern = Pattern.compile(passwordPattern);
			Matcher matcher = pattern.matcher(teacher.getPassword());  
			
			if(!matcher.matches())
				return false;
			
			return true;
		}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.service;

import java.util.List;

import com.Beans.ApplicationForm;
import com.Beans.Courses;
import com.Beans.Students;
import com.Beans.questionnaire;

public interface serviceInterace {

	 public List<Courses> getCourses() ;

	 public Courses getCourseById(String courseCode );
	 public int updateCourse(Courses c);
	 
	 public List<Students> getStudents();

	 public Students getEmpById(String studentMatNo);

	 public int update(Students p);

	 public int delete(String studentMatNo);

	 public int save(ApplicationForm app);

	 public List<questionnaire> getQues();
	 
	 
	 
}

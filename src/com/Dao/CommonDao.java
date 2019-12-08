package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Beans.ApplicationForm;
import com.Beans.Courses;
import com.Beans.Students;
import com.Beans.questionnaire;

public interface CommonDao {

	void setTemplate(JdbcTemplate template);

	List<Students> getStudents();

	Students getEmpById(String studentMatNo);

	int update(Students p);

	int delete(String studentMatNo);

	List<Courses> getCourses();

	Courses getCourseById(String courseCode);

	int updateCourse(Courses c);

	int save(ApplicationForm app);

	List<questionnaire> getQues();

}
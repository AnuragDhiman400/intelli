package com.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.Beans.ApplicationForm;
import com.Beans.Courses;
import com.Beans.Students;
import com.Beans.questionnaire;
import com.dao.CommonDao;
import com.service.serviceInterace;

public class serviceImpl implements serviceInterace {
    @Autowired CommonDao dao;
    
    
	@Override
	public List<Courses> getCourses() {
		
		return dao.getCourses();
	}

	@Override
	public Courses getCourseById(String courseCode ) {
		return dao.getCourseById( courseCode);
	}

	@Override
	public int updateCourse(Courses c) {
		
		return dao.updateCourse(c);
	}

	@Override
	public List<Students> getStudents() {
		// TODO Auto-generated method stub
		return dao.getStudents();
	}

	@Override
	public Students getEmpById(String studentMatNo) {
		// TODO Auto-generated method stub
		return dao.getEmpById(studentMatNo);
	}

	@Override
	public int update(Students p) {
		// TODO Auto-generated method stub
		return dao.update(p);
	}

	@Override
	public int delete(String studentMatNo) {
		// TODO Auto-generated method stub
		return dao.delete(studentMatNo);
	}

	@Override
	public int save(ApplicationForm app) {
		// TODO Auto-generated method stub
		return dao.save(app);
	}

	@Override
	public List<questionnaire> getQues() {
		// TODO Auto-generated method stub
		return dao.getQues();
	}

	
	

}

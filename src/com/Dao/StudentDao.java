package com.Dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Beans.ApplicationForm;
import com.Beans.Courses;
import com.Beans.Students;


public class StudentDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Students> getStudents() {
		return template.query(
				"select student.studentMatNo,course.courseTitle, student.firstName,student.lastName,student.gsmNo,student.phoneNo,student.intercomExt,student.program,student.department,student.college,student.date  from student LEFT JOIN course ON student.courseCode = course.courseCode",
				new RowMapper<Students>() {
					public Students mapRow(ResultSet rs, int row) throws SQLException {
						Students c = new Students();
						Courses cour = new Courses();
						
						
						  c.setStudentMatNo(rs.getString(1));
						  
						  c.setFirstName(rs.getString(3));
						  c.setLastName(rs.getString(4));
						
						  c.setGsmNo(rs.getInt(5)); 
						  c.setPhoneNo(rs.getString(6));
						  c.setIntercomExt(rs.getInt(7)); 
						  c.setProgram(rs.getString(8));
						  c.setDepartment(rs.getString(9)); 
						  c.setCollege(rs.getString(10));
						  c.setDate(rs.getString(11));
						 
						 
						 

						c.setCourseTitle(rs.getString(2));
						return c;
					}
				});
	}

	public Students getEmpById(String studentMatNo) {
		String sql = "select * from student where studentMatNo=?";
		return template.queryForObject(sql, new Object[] { studentMatNo },
				new BeanPropertyRowMapper<Students>(Students.class));
	}

	public int update(Students p) {

		String sql = "update student set firstName='" + p.getFirstName() + "',lastName='" + p.getLastName()
				+ "', gsmNo='" + p.getGsmNo() + "', phoneNo='" + p.getPhoneNo() + "', intercomExt='"
				+ p.getIntercomExt() + "', program='" + p.getProgram() + "', department='" + p.getDepartment()
				+ "', college='" + p.getCollege() + "', date='" + p.getDate() + "' where studentMatNo='"
				+ p.getStudentMatNo() + "'";

		// String sql = "update student set studentPassword='"+p.getStudentPassword()+"'
		// where studentMatNo = '"+p.getStudentMatNo()+"'";
		return template.update(sql);
	}

	public int delete(String studentMatNo) {
		String sql = "delete from student where studentMatNo='" + studentMatNo + "'";
		return template.update(sql);
	}

///////////////////////
//Course table data////
///////////////////////

	public List<Courses> getCourses() {
		return template.query("select * from course", new RowMapper<Courses>() {
			public Courses mapRow(ResultSet rs, int row) throws SQLException {
				Courses c = new Courses();

				c.setCourseCode(rs.getString(1));
				c.setCourseTitle(rs.getString(2));
				c.setCourseUnit(rs.getInt(3));

				return c;
			}
		});
	}

	public Courses getCourseById(String courseCode) {
		String sql = "select * from course where courseCode=?";
		return template.queryForObject(sql, new Object[] { courseCode },
				new BeanPropertyRowMapper<Courses>(Courses.class));
	}

	public int updateCourse(Courses c) {
		System.out.println("data is here");
		String sql = "update course set courseTitle='" + c.getCourseTitle() + "',courseUnit='" + c.getCourseUnit()
				+ "' where courseCode='" + c.getCourseCode() + "'";

		// String sql = "update student set studentPassword='"+p.getStudentPassword()+"'
		// where studentMatNo = '"+p.getStudentMatNo()+"'";
		return template.update(sql);
	}
	

///////////////////////
//ApplicationForm table data////
///////////////////////
	
	public int save(ApplicationForm app){  
	    String sql="insert into applicationDetail(date,firstName,lastName,emailId, phone, city,province,country,organization,jobTitle,totalExperience,collegeName,collegeYear) values('"+app.getDate()+"',"+app.getFirstName()+",'"+app.getLastName()+"','"+app.getEmailId()+"','"+app.getPhone()+"','"+app.getCity()+"','"+app.getProvince()+"','"+app.getCountry()+"','"+app.getOrganization()+"','"+app.getJobTitle()+"','"+app.getTotalExperience()+"',''"+app.getCollegeName()+",'"+app.getCollegeYear()+"')";  
	    return template.update(sql);  
	} 

}

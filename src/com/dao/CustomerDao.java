package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Beans.Customers;


public class CustomerDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  

public List<Customers> getCustomers(){  
    return template.query("select * from student",new RowMapper<Customers>(){  
        public Customers mapRow(ResultSet rs, int row) throws SQLException {  
        	Customers c=new Customers();  
            c.setStudentMatNo(rs.getString(1));
      c.setStudentPassword(rs.getInt(2));
      c.setFirstName(rs.getString(3));
           c.setSurName(rs.getString(4));
           c.setGsmNo(rs.getInt(5));
           c.setPhoneNo(rs.getInt(6));
           c.setIntercomExt(rs.getInt(7));
           c.setProgram(rs.getString(8));
           c.setDepartment(rs.getString(9));
           c.setCollege(rs.getString(10));
           c.setDate(rs.getString(11));
            return c;  
        }  
    });  
} 

public Customers getEmpById(String studentMatNo){    
    String sql="select * from student where studentMatNo=?";    
    return template.queryForObject(sql, new Object[]{studentMatNo},new BeanPropertyRowMapper<Customers>(Customers.class));    
}  

public int update(Customers p){    
    String sql="update student set studentPassword='"+p.getStudentPassword()+"',firstName='"+p.getFirstName()+"',surName='"+p.getSurName()+"',gsmNo='"+p.getGsmNo()+", phoneNo='"+p.getPhoneNo()+"' , intercomExt='"+p.getIntercomExt()+"' ,program='"+p.getProgram()+"' ,department='"+p.getDepartment()+"' ,college='"+p.getCollege()+"' ,date='"+p.getDate()+"' where studentMatNo='"+p.getStudentMatNo()+"'";    
    return template.update(sql);    
}  

public int delete(String studentMatNo){    
    String sql="delete from student where studentMatNo='"+studentMatNo+"'";    
    return template.update(sql);    
}   

}

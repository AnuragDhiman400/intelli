<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Edit Employee</h1>
       <form:form method="POST" action="/project-Intelli/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="studentMatNo" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="firstName"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="surName" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="gsmNo" /></td>
         </tr> 
           <tr>  
          <td>Designation :</td>  
          <td><form:input path="phoneNo" /></td>
         </tr> 
           <tr>  
          <td>Designation :</td>  
          <td><form:input path="intercomExt" /></td>
         </tr> 
           <tr>  
          <td>Designation :</td>  
          <td><form:input path="program" /></td>
         </tr> 
           <tr>  
          <td>Designation :</td>  
          <td><form:input path="department" /></td>
         </tr> 
           <tr>  
          <td>Designation :</td>  
          <td><form:input path="college" /></td>
         </tr> 
           <tr>  
          <td>Designation :</td>  
          <td><form:input path="date" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  

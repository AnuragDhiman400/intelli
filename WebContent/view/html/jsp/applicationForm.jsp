<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<%@ page import="java.io.*,java.util.*, javax.servlet.*"%>
<%@ page import="com.countryList.countryList"%>
<%@ page import="java.util.Locale"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>Grandin I Fast build Admin dashboard for any platform</title>
<meta name="description"
	content="Grandin is a Dashboard & Admin Site Responsive Template by hencework." />
<meta name="keywords"
	content="admin, admin dashboard, admin template, cms, crm, Grandin Admin, Grandinadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application" />
<meta name="author" content="hencework" />

<!-- Favicon -->
<link rel="shortcut icon" href="../view/html/jsp/favicon.ico?">
<link rel="icon" href="../jsp/favicon.ico?" type="image/x-icon">

<!-- vector map CSS -->
<link
	href="../vendors/bower_components/jasny-bootstrap/dist/css/jasny-bootstrap.min.css"
	rel="stylesheet" type="text/css" />


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/css/bootstrap-select.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/js/bootstrap-select.min.js"></script>

<!-- (Optional) Latest compiled and minified JavaScript translation files -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/js/i18n/defaults-*.min.js"></script>





<!-- Custom CSS -->

<link rel="stylesheet" type="text/css"
	href="<c:url value="../jsp/dist/css/style.css"/>" />

<style>
body {
	background-color: #F5F3F3;
}

@media only screen and (max-width: 540px) {
	h3 {
		margin-left: 50%;
	}
}
</style>
</head>

<body>


	<div class="container-fluid">

		<!-- Title -->
		<div class="row heading-bg">

			<h3>Application Form</h3>




		</div>
		<!-- /Title -->



		<h1>Add New Employee</h1>
    <%--    <form:form method="post" action="/project-Intelli/appsave">  
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="firstName"  /></td>
         </tr>  
       <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>   --%>

       
       
       <!-- Row -->
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default card-view">
					<div class="panel-heading">
						<div class="pull-left">
							<%
										         Date date = new Date();
								         out.print( "<h6> Application Date: "+"  " +date.toString()+"</h6>");
								      %>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="panel-wrapper collapse in">
						<div class="panel-body">
							<div class="row">
								<div class="col-md-12">
									<div class="form-wrap">
										
										  <form:form method="post" action="/project-Intelli/appsave">  
     
											<div class="form-body">
												<h6 class="txt-dark capitalize-font">
													<i class="zmdi zmdi-account mr-10"></i>Person's Info
												</h6>
												<hr class="light-grey-hr" />
												<div class="row">
													<div class="col-md-6">
														<div class="form-group">
															<label class="control-label col-md-3">First Name</label>
															<div class="col-md-9">
																<form:input path="firstName"  type="text" class="form-control" placeholder=" First Name"/> <span
																	class="help-block"> This is inline help </span>
															</div>
														</div>
													</div>
													<!--/span-->
													<div class="col-md-6">
														<div class="form-group has-error">
															<label class="control-label col-md-3">Last Name</label>
															<div class="col-md-9">
																<form:input path="lastName"  type="text" class="form-control" placeholder=" last Name"/> 
																<span class="help-block"> This field has error. </span>
															</div>
														</div>
													</div>
													<!--/span-->
													<!--/span-->
													<div class="col-md-6">
														<div class="form-group has-error">
															<label class="control-label col-md-3">Email</label>
															<div class="col-md-9">
																<form:input path="emailId" type="email" class="form-control"
																	placeholder="email"/> <span class="help-block">
																	This field has error. </span>
															</div>
														</div>
													</div>
													<!--/span-->
													<!--/span-->
													<div class="col-md-6">
														<div class="form-group has-error">
															<label class="control-label col-md-3">Phone
																Number</label>
															<div class="col-md-9">
																<form:input path="phone" type="number" class="form-control"
																	placeholder="phone"/> <span class="help-block">
																	This field has error. </span>
															</div>
														</div>
													</div>
													<!--/span-->
												</div>
												<!-- /Row -->



												<div class="seprator-block"></div>

												<h6 class="txt-dark capitalize-font">
													<i class="zmdi zmdi-account-box mr-10"></i>address
												</h6>
												<hr class="light-grey-hr" />
												<!-- /Row -->
												<div class="row">
													<div class="col-md-6">
														<div class="form-group">
															<label class="control-label col-md-3">Address</label>
															<div class="col-md-9">
																<input type="text" class="form-control">
															</div>
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label class="control-label col-md-3">City</label>
															<div class="col-md-9">
																<form:input path="city" class="form-control" placeholder="city"/>
															</div>
														</div>
													</div>
												</div>
												<div class="row">
													<div class="col-md-6">
														<div class="form-group">
															<label class="control-label col-md-3">Province</label>
															<div class="col-md-9">
																<form:input path="province" type="text" class="form-control" placeholder="province"/>
															</div>
														</div>
													</div>
													<!--/span-->
													<div class="col-md-6">
														<div class="form-group">
																<label class="control-label col-md-3">Country</label>
															<div class="col-md-9">
																
																<form:select path="country" class="form-control">
																	<form:option value="NONE" label="--Select--" />

																	<% 
																		String[] locales = Locale.getISOCountries();
																		for (String countryCode : locales) {
																	    Locale obj = new Locale("", countryCode);
																	    String countries = obj.getDisplayCountry();
																	    pageContext.setAttribute("countries",countries);
																	    %>

																	<form:option value="${countries }" label="${countries}">
																		<c:out value='${countries}' />
																	</form:option>

																	<form:options items="${countryList}" />

																	<%  }  %>
																</form:select>
															</div>
														</div>
													</div> 
													<!--/span-->
													<div class="col-md-6">
														<div class="form-group">
															<label class="control-label col-md-3">Currently Are you working</label>
															<div class="col-md-9">
																<div class="radio-list">
																	<div class="radio-inline pl-0">
																		<span class="radio radio-info">																																			
																		
																		 <input
																			type="radio" name="radio7" id="radio_9"
																			value="option1"> <label for="radio_9">Yes</label>
																		</span>
																	</div>
																	<div class="radio-inline pl-0">
																		<span class="radio radio-info"> <input
																			type="radio" name="radio7" id="radio_10"
																			value="option2"> <label for="radio_10">No</label>
																		</span>
																	</div>
																</div>
															</div>
														</div>
													</div>
													<!--/span-->
												</div>
												<!--If yes organisation  -->

												<div id="org1">


													<div class="seprator-block"></div>

													<h6 class="txt-dark capitalize-font">
														<i class="zmdi zmdi-account-box mr-10"></i>professional
														details
													</h6>
													<hr class="light-grey-hr" />

													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Organization</label>
																<div class="col-md-9">
																<form:input path="organization"  type="text" class="form-control" placeholder="province"/>
														
																	<input type="text" class="form-control">
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Current
																	Job Title</label>
																<div class="col-md-9">
																	<form:input path="jobTitle"  type="text" class="form-control"/>
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Total
																	Experience</label>
																<div class="col-md-9">
																	<form:input path="totalExperience" type="text" class="form-control" />
																</div>
															</div>
														</div>
													</div>

												</div>
												<!--If yes organisation  -->




												<!--If No organisation  -->

												<div id="org2">


													<div class="seprator-block"></div>

													<h6 class="txt-dark capitalize-font">
														<i class="zmdi zmdi-account-box mr-10"></i>professional
														details
													</h6>
													<hr class="light-grey-hr" />

													<div class="row">


														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">What are
																	you doing currently</label>
																<div class="col-md-9">
																	<select class="form-control"
																		data-placeholder="Choose a Category" id="drop"
																		tabindex="1">
																		<option value="Category 4">Choose a Category</option>
																		<option value="1">Education</option>
																		<option value="2">Searching for Job</option>
																		<option value="3">NA</option>

																	</select>
																</div>
															</div>
														</div>

													</div>



													<div id="edu">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">College/University
																	Name</label>
																<div class="col-md-9">
																	<form:input path="collegeName" type="text" class="form-control"/>
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Year</label>
																<div class="col-md-9">
																	<form:input path="collegeYear" type="text" class="form-control" />
																</div>
															</div>
														</div>
													</div>
													
												
													
												</div>
	                                                <div id="org5">
													<div class="seprator-block"></div>

													<h6 class="txt-dark capitalize-font">
														<i class="zmdi zmdi-account-box mr-10"></i>questionnaire
														
													</h6>
													<hr class="light-grey-hr" />
													
													<div class="row">


														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">questionnaire
																	</label>
																<div class="col-md-9">
																	<form:select path= "question" class="form-control"
																		data-placeholder="Choose a Category" id="drop"
																		tabindex="1">
																		 <c:forEach var="emp" items="${list}"> 
																		<form:option value="Category 4">Choose a Category</form:option>
																		<form:option value="1"><${emp.question}></form:option>
																		
                                                                        </c:forEach> 

																	</form:select> 	
																</div>
															</div>
														</div>

													</div>
													
											</div>
											<!--If No organisation  -->





											<div class="form-actions mt-10">

												<div class="col-md-offset-3 col-md-9">
													<button type="submit" class="btn btn-success  mr-10">Submit</button>
													<button type="button" class="btn btn-default">Cancel</button>
												</div>


												<div class="col-md-6"></div>

											</div>
										</form:form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /Row -->
		
		</div>

	<!-- /#wrapper -->

	<!-- JavaScript -->

	<!-- jQuery -->
	<script src="../vendors/bower_components/jquery/dist/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="../vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<script
		src="../vendors/bower_components/jasny-bootstrap/dist/js/jasny-bootstrap.min.js"></script>

	<!-- Slimscroll JavaScript -->
	<script src="../jsp/dist/js/jquery.slimscroll.js"></script>

	<!-- Fancy Dropdown JS -->
	<script src="../jsp/dist/js/dropdown-bootstrap-extended.js"></script>

	<!-- Owl JavaScript -->
	<script
		src="../vendors/bower_components/owl.carousel/dist/owl.carousel.min.js"></script>

	<!-- Switchery JavaScript -->
	<script
		src="../vendors/bower_components/switchery/dist/switchery.min.js"></script>

	<!-- Init JavaScript -->
	<script src="../jsp/dist/js/init.js"></script>

	<script>
	
 $(document).ready(function(){
	 
	    $("#org1").hide();
	    $("#org2").hide();
	
	});
 
 
$(document).ready(function(){
	    $('input[name="radio7"]').change(function(){
	        if($('#radio_9').prop('checked')){
	        	$("#org1").show();
	        	$("#org2").hide();
	        }else{
	        	$("#edu").hide();
	        	$("#org1").hide();
	        	$("#org2").show();
	        }
	    });
	}); 
	$(document).ready(function(){
		  $("#drop").on('change' , function(){
			  if(this.value == '1')
				  {
				  
				  $("#edu").show();
				  }
			  else
				  {
				  $("#edu").hide();
				  
				  }
		   
		  });
		 
		}); 
	
	
	</script>


</body>
</html>
		
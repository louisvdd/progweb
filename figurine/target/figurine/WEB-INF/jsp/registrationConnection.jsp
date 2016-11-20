<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>


<html>

	<head>
		<title><spring:message code="registrationConnection"/></title>
	</head>
	
	<body>
	
	<div class="container"> 
		<div class="menuInscription">
		  <ul class="collapsible" data-collapsible="accordion">
		    <li>
		      <div class="collapsible-header"><i><img src="images/iconConnection.png" height="20px"></i><spring:message code="connection"/></div>
		      <div class="collapsible-body">
		      	<form:form 	id="connectionForm"
		      				method="POST"
		      				action="/figurine/registrationConnection/connection"
		      				modelAttribute="currentUser">
		         
			        <div class="input-field col s6">
			          <form:input path="idUser" type="text" class="validate"/>
			          <form:label path="idUser"><spring:message code="userName"/></form:label>
			        </div>
				
					<div class="input-field col s6">
			          <form:input path="password" type="password" class="validate"/>
			          <form:label path="password"><spring:message code="password"/></form:label>
			        </div>

			        <form:button class="btn waves-effect waves-light">
			        	<spring:message code="connectionButton"/>
	  				</form:button>
	  			</form:form>
		      </div>
		  
		    </li>
		    <li>
		      <div class="collapsible-header"><i><img src="images/iconInscription.png" height="20px"></i><spring:message code="registration"/></div>
		      <div class="collapsible-body">
		      
		      	<form:form 	id="registrationForm"
		      				method="POST"
		      				action="/figurine/registrationConnection/registration"
		      				modelAttribute="registration">
			      	<div class="input-field col s6">
			          <form:input path="idUser" type="text" class="validate"/>
			          <form:label path="idUser" ><spring:message code="userName"/></form:label>
			        </div>
			      	<div class="input-field col s6">
			          <form:input path="lastName" type="text" class="validate"/>
			          <form:label path="lastName" ><spring:message code="lastName"/></form:label>
			        </div>
			        
			        <div class="input-field col s6">
			          <form:input path="firstName" type="text" class="validate"/>
			          <form:label path="firstName" ><spring:message code="firstName"/></form:label>
			        </div>
			        
			        <div class="input-field col s6">
			          <form:input path="password" type="password" class="validate"/>
			          <form:label path="password" ><spring:message code="password"/></form:label>
			        </div>
			        
			        <div class="input-field col s6">
			          <form:input path="password" type="password" class="validate"/>
			          <form:label path="password" ><spring:message code="verificationPassword"/></form:label>
			        </div>
			        
			        <div class="input-field col s6">
			          <form:input path="street" type="text" class="validate"/>
			          <form:label path="street" ><spring:message code="street"/></form:label>
			        </div>
			        
			        <div class="input-field col s6">
			          <form:input path="city" type="text" class="validate"/>
			          <form:label path="city" ><spring:message code="city"/></form:label>
			        </div>
			        
			        <div class="input-field col s6">
			          <form:input path="postalCode" type="text" class="validate"/>
			          <form:label path="postalCode" ><spring:message code="postalCode"/></form:label>
			        </div>
			        
			        <div class="input-field col s6">
			          <form:input path="country" type="text" class="validate"/>
			          <form:label path="country" ><spring:message code="country"/></form:label>
			        </div>
			        
			        <div class="input-field col s6">
			          <form:input path="email" type="text" class="validate"/>
			          <form:label path="email" ><spring:message code="email"/></form:label>
			        </div>
			        
					<button class="btn waves-effect waves-light" type="submit" name="action">
						<spring:message code="validateButton"/>
					  	<i class="material-icons right">send</i>
					</button>
				</form:form>
        
		      </div>
		    </li>
		  </ul> 
		  </div>
		  <div class="imageClass">
			<img src ='<spring:url value="/images/connection.png"/>'/>
		</div>      
    </div>
	</body>
	
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>


<html>

	<head>
		<title><spring:message code="registration"/></title>
	</head>
	
	<body>
	
	<div class="container"> 
		<div class="menuInscription">
		  <ul class="collapsible" data-collapsible="accordion">
		    <li>
		      <div class="collapsible-header"><i class="material-icons">filter_drama</i><spring:message code="connection"/></div>
		      <div class="collapsible-body">
		      	<form:form 	id="connectionForm"
		      				method="POST"
		      				action="/figurine/registration/connection"
		      				modelAttribute="user">
		         
			        <div class="input-field col s6">
			          <form:input path="idUser" type="text" class="validate"/>
			          <form:label path="idUser"><spring:message code="userName"/></form:label>
			        </div>
				
					<div class="input-field col s6">
			          <form:input path="password" type="password" class="validate"/>
			          <form:label path="password"><spring:message code="password"/></form:label>
			        </div>

			        <form:button class="btn waves-effect waves-light">
			        	<spring:message code="connection"/>
	  				</form:button>
	  			</form:form>
		      </div>
		  
		    </li>
		    <li>
		      <div class="collapsible-header"><i class="material-icons">place</i><spring:message code="registration"/></div>
		      <div class="collapsible-body">
		      	<div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="lastName"/></label>
		        </div>
		        
		        <div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="firstName"/></label>
		        </div>
		        
		        <div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="password"/></label>
		        </div>
		        
		        <div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="street"/></label>
		        </div>
		        
		        <div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="postalCode"/></label>
		        </div>
		        
		        <div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="country"/></label>
		        </div>
		        
		        <div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="email"/></label>
		        </div>
		        
		        <div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="password"/></label>
		        </div>
		        
		        
				<button class="btn waves-effect waves-light" type="submit" name="action">
					<spring:message code="validate"/>
				  	<i class="material-icons right">send</i>
				</button>
        
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
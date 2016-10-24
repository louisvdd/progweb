<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Inscription!</title>
	</head>
	
	<body>
	
	<div class="container">
		<div class="imageClass">
			<img src ='<spring:url value="/images/connection.png"/>'/>
		</div> 
	
		  <ul class="collapsible" data-collapsible="accordion">
		    <li>
		      <div class="collapsible-header"><i class="material-icons">filter_drama</i><spring:message code="connection"/></div>
		      <div class="collapsible-body">
		      	<div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="userName"/></label>
		        </div>
			
				<div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name"><spring:message code="password"/></label>
		        </div>
		        
		        <button class="btn waves-effect waves-light" type="submit" name="action">
		        	<spring:message code="connection"/>
  				</button>
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
	</body>
	
</html>
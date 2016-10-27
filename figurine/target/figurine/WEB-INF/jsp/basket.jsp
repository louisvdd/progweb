<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>


<html>

	<head>
		<title><spring:message code="basket"/></title>
	</head>
	
	<body>
		<div class="container">
			<div class="row">
				<div class="col s9">
				<h1><spring:message code="basketTitle"/></h1>
			  	<ul class="collection">
				    <li class="collection-item avatar">
				      <img src="images/figurine1.png" alt="" height="50px">
				      <span class="title"><a href="#!">Figurine 1</a></span>
				      <p><spring:message code="brand"/> : Marque1 <br>
				         <spring:message code="description"/> : <div class="truncate"><spring:message code="long"/></div>
				      </p>
				      <p class="secondary-content">Prix</p>
				    </li>
				    <li class="collection-item avatar">
				      <img src="images/figurine2.png" alt="" height="50px">
				      <span class="title"><a href="#!">Figurine 2</a></span>
				      <p><spring:message code="brand"/> : Marque2 <br>
				         <spring:message code="description"/> : <p class="truncate"><spring:message code="long"/></p>
				      </p>
				      <p class="secondary-content">Prix</p>
				    </li>
				    <li class="collection-item avatar">
				      <img src="images/figurine3.png" alt="" height="50px">
				      <span class="title"><a href="#!">Figurine 3</a></span>
				      <p><spring:message code="brand"/> : Marque3 <br>
				         <spring:message code="description"/> : <p class="truncate"><spring:message code="long"/></p>
				      </p>
				      <p class="secondary-content">Prix</p>
				    </li>
				  </ul>
	            
	            	<button class="btn waves-effect waves-light" type="submit" name="action">
			        	<spring:message code="command"/>
	  				</button>
	  			</div>
	  			
	  			<div class="col s3">
	  				Bonjour
	  			</div>
  			</div>
		</div>
	</body>
	
</html>
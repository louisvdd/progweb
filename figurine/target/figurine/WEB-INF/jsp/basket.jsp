<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>


<html>

	<head>
		<title><spring:message code="basket"/></title>
	</head>
	
	<body>
		<div class="container">
			<h1><spring:message code="basketTitle"/></h1>
		  	<ul class="collection">
			    <li class="collection-item avatar">
			      <img src="images/figurine1.png" alt="" weight="50px" height="50px">
			      <span class="title"><a href="#!">Figurine 1</a></span>
			      <p><spring:message code="brand"/> : Marque1 <br>
			         <spring:message code="description"/> : <p class="truncate"><spring:message code="long"/></p>
			      </p>
			      <p class="secondary-content">Prix</p>
			    </li>
			    <li class="collection-item avatar">
			      <img src="images/figurine2.png" alt="" weight="50px" height="50px">
			      <span class="title"><a href="#!">Figurine 2</a></span>
			      <p><spring:message code="brand"/> : Marque2 <br>
			         <spring:message code="description"/> : <p class="truncate"><spring:message code="long"/></p>
			      </p>
			      <p class="secondary-content">Prix</p>
			    </li>
			    <li class="collection-item avatar">
			      <img src="images/figurine3.png" alt="" weight="50px" height="50px">
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
	</body>
	
</html>
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
			      <img src="images/figurine1.png" alt="">
			      <span class="title">Figurine 1</span>
			      <p>Marque :  <br>
			         Description :
			      </p>
			      <a href="#!" class="secondary-content">Prix</a>
			    </li>
			    <li class="collection-item avatar">
			      <img src="images/figurine2.png" alt="">
			      <span class="title">Figurine 2</span>
			      <p>Marque :  <br>
			         Description :
			      </p>
			      <a href="#!" class="secondary-content">Prix</a>
			    </li>
			    <li class="collection-item avatar">
			      <img src="images/figurine3.png" alt="">
			      <span class="title">Figurine 2</span>
			      <p>Marque :  <br>
			         Description :
			      </p>
			      <a href="#!" class="secondary-content">Prix</a>
			    </li>
			  </ul>
            
		</div>
	</body>
	
</html>
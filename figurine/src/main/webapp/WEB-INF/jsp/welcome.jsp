<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>


<html>

	<head>
		<title><spring:message code="reception"/></title>
		<script type="text/javascript">
		// Pause slider
		$('.slider').slider('pause');
		// Start slider
		$('.slider').slider('start');
		// Next slide
		$('.slider').slider('next');
		// Previous slide
		$('.slider').slider('prev');
		</script>	
	</head>
	
	<body>
	
		<div class="section no-pad-bot">
		    <div class="container">
		        <h1 class="header center rbwd-red-text text-base thin-text">Madoline</h1>
		        <h2 class="header center light thin-text">
		        	<spring:message code="figurineSite"/>
		        </h2>
		    </div>
		</div>
		
		
	<%-- <div class="container">		
					
		  <div class="slider">
		    <ul class="slides">
		      <li>
		        <img src="images/fond.jpg"> 
		        <div class="caption center-align">
		          <h3>Le meilleur site de vente de figurine</h3>
		          <h5 class="light grey-text text-lighten-3">Vous pouvez trouver tout type de figurine</h5>
		        </div>
		      </li>
		      <li>
		        <img src="images/animé.jpg"> 
		        <div class="caption left-align">
		          <h3>Des figurines d'animés</h3>
		          <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
		        </div>
		      </li>
		      <li>
		        <img src="images/original.png">
		        <div class="caption right-align">
		          <h3>Des figurines de films</h3>
		          <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
		        </div>
		      </li>
		      <li>
		        <img src="images/jeuxvidéo.jpeg">
		        <div class="caption center-align">
		          <h3>Des figurines de jeux vidéo.</h3>
		          <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
		        </div>
		      </li>
		    </ul>
		  </div>
		 --%>
		

		</div>
	</body>
	
</html>
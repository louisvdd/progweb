<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE HTML>
<html>

	<head>
		<meta http-equiv="Content-type" content="type=text/html; charset=UTF-8"/>

		<link type="text/css" href="<spring:url value='/css/materialize.css/'/>" 
				rel="Stylesheet">
		<link type="text/css" href="<spring:url value='/css/style.css/'/>" 
				rel="Stylesheet">
		<link href="<spring:url value='http://fonts.googleapis.com/icon?family=Material+Icons' />" rel="stylesheet">
		<script type="text/javascript"></script>
		<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="<spring:url value='js/materialize.js' />" ></script>
		
	</head>
	
	<body>
	
		<!-- DropDown figurine structure -->
		<ul id="dropdownFigurine" class="dropdown-content">
		  <li>
		  	<a href="movie">
		  		<spring:message code="movie"/>
		  	</a>
		  </li>
		  <li>
		  	<a href="videoGame">
		  		<spring:message code="videoGame"/>
		  	</a>
		  </li>
		  <li>
		  	<a href="japaneseAnimation">
		  		<spring:message code="animationJapanese"/>
		  	</a>
		  </li>
		</ul>
		
		<spring:url var="localeEn" value="">
			<spring:param name="locale" value="en"/>
		</spring:url>
		<spring:url var="localeFr" value="">
			<spring:param name="locale" value="fr"/>
		</spring:url>
		
		<header>
			<nav class="grey">
				<div class="nav-wrapper container">
				 	<a href="#" class="brand-logo black-text">
				 		<img src ='<spring:url value="/images/logo.png"/>' height="40px" width="33px"/>
				 		Madoline
					</a>
				 	<a class="button-collapse" href="#" data-activates="nav-mobile">
				 		<i class="material-icons black-text">menu</i>
				 	</a>
				 	<ul class="right hide-on-med-and-down">
				 		<li>
				 			<a class="nav-btn waves-effect waves-light" href="welcome">
				 				<spring:message code="reception"/>
							</a>
				 		</li>
				 		<li>
				 			<li>
					 			<a class="dropdown-button" href="#!" data-activates="dropdownFigurine" data-beloworigin="true">
						 			<spring:message code="figurine"/>
						 			<i class="material-icons right">arrow_drop_down</i>
					 			</a>
				 			</li>	
						</li>
				 		<li>
				 			<a class="nav-btn waves-effect waves-light" href="basket">
				 			<spring:message code="basket"/>
				 			</a>
				 		</li>				 
				 		<li>
				 			<a class="nav-btn waves-effect waves-light" href="registrationConnection">
				 				<spring:message code="myAccount"/>
							</a>
				 		</li>
				 		
				 		<li><a class="nav-btn waves-effect waves-light" href="${localeFr}">	
								<img src ='<spring:url value="/images/francais.png"/>' height="30px" width="30px"/>
							</a>
						</li>
				 		<li><a class="nav-btn waves-effect waves-light" href="${localeEn}">
								<img src ='<spring:url value="/images/anglais.png"/>' height="30px" width="30px"/>
				 			</a>
				 		</li>
				 				
				 	</ul>
				 	<ul class="side-nav" id="nav-mobile" >
				 		<li><a href="#">Lien1</a></li>
				 		<li><a href="#">Lien2</a></li>
				 		<li><a href="#">Lien3</a></li>
				 		<li><a href="#"><spring:message code="choiceLanguage"/></a></li>
				 	</ul>				 					 
				</div>
			</nav>
		</header>
		<div>
			<tiles:insertAttribute name="main-content"/>
		</div>
		
				
		<footer class="page-footer grey z-depth-5">
			<div class="container">
				<div class="row">
					<div class="col l6 s12">
						<h5>
							<spring:message code="damienLouis"/>
						</h5>
					</div>
					<div class="col l4 offset-l2 s12">
						<h5 class="black-text">
							<spring:message code="link"/>
						</h5>
						<ul>
							<li><a>Facebook</a></li>
							<li><a>Twitter</a></li>
						</ul>
					</div>
				</div>
			</div>
			
		<div class="footer-copyright">
            <div class="container">
	            2016 Copyright Henallux LouisDamien
	            <a class="grey-text text-lighten-4 right" href="#!">
	            	<spring:message code="moreLink"/>
	            </a>
            </div>
          </div>
		</footer>
	</body>
	
</html>
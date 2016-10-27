<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>


<html>

	<head>
		<title><spring:message code="animationJapanese"/></title>
	</head>
	
	<body>
		<div class="container">
			<h2>Trouvez la figurine d'animé que vous désirez</h2>
			<div class="row">
				<div class="col s3">
					<form>
						<div class="input-field">
							<input id="search" type="search" required>
							<label for="search"><i class="material-icons">search</i></label>
							<i class="material-icons">close</i>
						</div>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col s3">
					<ul class="collapsible" data-collapsible="accordion">
					 	<li>
							<div class="collapsible-header"><i class="material-icons">filter_drama</i>Prix</div>
							<div class="collapsible-body"><p>Lorem ipsum dolor sit amet.</p></div>
					    </li>
					    <li>
					      	<div class="collapsible-header"><i class="material-icons">place</i>Taille</div>
					      	<div class="collapsible-body"><p>Lorem ipsum dolor sit amet.</p></div>
					    </li>
					    <li>
					      	<div class="collapsible-header"><i class="material-icons">whatshot</i>Poids</div>
					      	<div class="collapsible-body"><p>Lorem ipsum dolor sit amet.</p></div>
					    </li>
					</ul>
	        	</div>
	        	
	        	<div class="col s9">
	        		<div class="row">
	        			<div class="col s3">
	        				<div class="card">
	        					<div class="card-image">
	        						<img src="images/animé.jpg" alt="" height="200px">
	        					</div>
	        					<div>
	        						<h4 class="center-align">Figurine animé</h4>
	        					</div>
	        					<div>
	        						<h5 class="center-align">Prize : 50euros</h5>
	        					</div>
	        				</div>
	        			</div>
	        			<div class="col s3">
	        				<div class="card">
	        					<div class="card-image">
	        						<img src="images/original.png" alt="" height="200px">
	        					</div>
	        					<div>
	        						<h4 class="center-align">Figurine animé</h4>
	        					</div>
	        					<div>
	        						<h5 class="center-align">Prize : 50euros</h5>
	        					</div>
	        				</div>
	        			</div>
	        			<div class="col s3">
	        				<div class="card">
	        					<div class="card-image">
	        						<img src="images/jeuxvidéo.jpeg" alt="" height="200px">
	        					</div>
	        					<div>
	        						<h4 class="center-align">Figurine animé</h4>
	        					</div>
	        					<div>
	        						<h5 class="center-align">Prize : 50euros</h5>
	        					</div>
	        				</div>
	        			</div>
	        		</div>
	        	</div>
        	</div>
		</div>
	</body>
	
</html>
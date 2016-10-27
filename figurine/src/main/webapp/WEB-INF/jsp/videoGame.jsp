<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>


<html>

	<head>
		<title><spring:message code="videoGame"/></title>
	</head>
	
	<body>
		<div class="container">
			<h2>Trouvez la figurine de jeu que vous désirez</h2>
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
							<div class="collapsible-header"><i><img src="images/euro.png" height="20px"></i>Prix</div>
							<div class="collapsible-body">
								<div class="row">
					      			<form class="col s12">
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">De</label>
								        </div>
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">à euros</label>
								        </div>							       
					      			</form>
					      			<button class="waves-effect waves-light btn">Chercher</button>
					      		</div>
							</div>
					    </li>
					    <li>
					      	<div class="collapsible-header"><i><img src="images/taille.png" height="20px"></i>Taille</div>
					      	<div class="collapsible-body">
					      		<div class="row">
					      			<form class="col s12">
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">De</label>
								        </div>
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">à cm</label>
								        </div>							       
					      			</form>
					      			<button class="waves-effect waves-light btn">Chercher</button>
					      		</div>
					      	</div>
					    </li>
					    <li>
					      	<div class="collapsible-header"><i><img src="images/poids.png" height="20px"></i>Poids</div>
					      	<div class="collapsible-body">
					      		<div class="row">
					      			<form class="col s12">
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">De</label>
								        </div>
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">à KG</label>
								        </div>							       
					      			</form>
					      			<button class="waves-effect waves-light btn">Chercher</button>
					      		</div>
					      	</div>
					    </li>
					    <li>
							<div class="collapsible-header"><i><img src="images/marque.png" height="20px"></i>Marque</div>
							<div class="collapsible-body">
								<ul>
									<li>
									  	<input type="checkbox" id="marque1"/>
									  	<label for="marque1">Marque1</label>
									</li>
									<li>
									  	<input type="checkbox" id="marque2"/>
									  	<label for="marque2">Marque2</label>
									</li>
									<li>
									  	<input type="checkbox" id="marque3"/>
									  	<label for="marque3">Marque3</label>
									</li>
									<li>
									  	<input type="checkbox" id="marque4"/>
									  	<label for="marque4">Marque4</label>
									</li>
									<li> 
									  	<input type="checkbox" id="marque5"/>
									  	<label for="marque5">Marque5</label>
									</li>
									<li>
									  	<input type="checkbox" id="marque6"/>
									  	<label for="marque6">Marque6</label>
									</li>
								</ul>
								<button class="waves-effect waves-light btn">Chercher</button>
							</div>
					    </li>
					</ul>
	        	</div>
	        	
	        	<div class="col s9">
	        		<div class="row">
	        			<div class="col s4">
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
	        			<div class="col s4">
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
	        			<div class="col s4">
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
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>


<html>

	<head>
		<title><spring:message code="videoGame"/></title>
		<script type="text/javascript">
		var slider = document.getElementById('test5');
		  noUiSlider.create(slider, {
		   start: [1, 10],
		   connect: true,
		   step: 1,
		   range: {
		     'min': 1,
		     'max': 10
		   },
		   format: wNumb({
		     decimals: 0
		   })
		  });
		</script>
	</head>
	
	<body>
		<div class="container">
			<h2>
				<spring:message code="findGame"/>
			</h2>
				
			<div class="row">
				<div class="col s3">
					<form:form	id="searchNameID"
		      					method="POST"
		      					action="/figurine/movie/searchName"
		      					modelAttribute="searchName">
						<div class="input-field">
							<input id="search" type="search" required>
							<label for="search"><i class="material-icons">search</i></label>
							<i class="material-icons">close</i>							
						</div>		
						<form:button class="waves-effect waves-light btn">
					      	<spring:message code="searchButton"/>
					    </form:button>			
					</form:form>
				</div>
			</div>
			<div class="row">
				<div class="col s3">
					<ul class="collapsible" data-collapsible="accordion">
					 	<li>
							<div class="collapsible-header"><i><img src="images/euro.png" height="20px"></i><spring:message code="prize"/></div>
							<div class="collapsible-body">
								<div class="row">
					      			<form class="col s12">
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">
								          		<spring:message code="from"/>
								          	</label>
								        </div>
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">
								          		<spring:message code="to"/>
								          	</label>
								        </div>							       
					      				<button class="waves-effect waves-light btn">
					      					<spring:message code="searchButton"/>
					      				</button>
					      			</form>
					      		</div>
							</div>
					    </li>
					    <li>
					      	<div class="collapsible-header"><i><img src="images/taille.png" height="20px"></i><spring:message code="height"/> (<spring:message code="cm"/>)</div>
					      	<div class="collapsible-body">
					      		<div class="row">
					      			<form class="col s12">
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">
								          		<spring:message code="from"/>
								          	</label>
								        </div>
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">
								          		<spring:message code="to"/>								          		
								          	</label>							          							          	
								        </div>							       					      			
						      			<button class="waves-effect waves-light btn">
						      				<spring:message code="searchButton"/>
						      			</button>
					      			</form>
					      		</div>
					      	</div>
					    </li>
					    <li>
					      	<div class="collapsible-header"><i><img src="images/poids.png" height="20px"></i><spring:message code="weight"/> (<spring:message code="gram"/>)</div>
					      	<div class="collapsible-body">
					      		<div class="row">
					      			<form class="col s12">
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">
								          		<spring:message code="from"/>
								          	</label>
								        </div>
					      				<div class="input-field col s4">
								          	<input id="icon_prefix" type="text" class="validate">
								          	<label for="icon_prefix">
								          		<spring:message code="to"/>								          		
								          	</label>
								        </div>							       					      			
						      			<button class="waves-effect waves-light btn">
						      				<spring:message code="searchButton"/>
						      			</button>
					      			</form>
					      		</div>
					      	</div>
					    </li>
					    <li>
							<div class="collapsible-header"><i><img src="images/marque.png" height="20px"></i><spring:message code="brand"/></div>
							<div class="collapsible-body">
								<form>
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
									<button class="waves-effect waves-light btn">
						      			<spring:message code="searchButton"/>
						      		</button>
					      		</form>
							</div>
					    </li>
					</ul>
	        	</div>
	        	
	        	<div class="col s9">
	        		<div class="row">
	        			<c:forEach items="${figurineVideoGame}" var="figurine">
		        			<div class="col s4">
		        				<div class="card">	
		        					<form:form	id="addBasketID"
								      			method="POST"
								      			action="/figurine/movie/addBasket"
								      			modelAttribute="addBasket">  
								      	
											<div>
				        						<h4 class="center-align">
				        							${figurine.name}
				        						</h4>
				        					</div>
				        					<div class="card-image">
				        						<img src="images/videoGameFigurine/${figurine.image}" alt="" height="400px">
				        					</div>
				        					
				        					<p class="truncate"><spring:message code="description"/> : ${figurine.description}</p>	
				        					<p><spring:message code="size"/> : ${figurine.size} cm</p>	
				        					<p><spring:message code="weight"/> : ${figurine.weight} g</p>	
				        					<p><spring:message code="brand"/> : ${figurine.brand}</p>	
				        					<div>
				        						<h5 class="center-align"><spring:message code="prize"/> : ${figurine.cost} <spring:message code="euro"/></h5>
				        					</div>
				        					<p class="range-field">
										  		<input type="range" id="test5" min="1" max="10" />
											</p>        					
				        					<form:button class="btn waves-effect waves-light">
				        						<spring:message code="addBasketButton"/>
				        					</form:button>
										    					
		        					</form:form> 
		        				</div>
		        			</div>
	        			</c:forEach> 
	        		</div>
	        	</div>
        	</div>
		</div>
	</body>
	
</html>
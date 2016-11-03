<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>


<html>

	<head>
		<title><spring:message code="basket"/></title>
	</head>
	
	<body>
		<div class="container">
			<div class="row">
				<h1><spring:message code="basketTitle"/></h1>
			</div>
			<div class="row">
				<div class="col s9">
			  	<ul class="collection">
				    <li class="collection-item avatar">
				      <img src="images/figurine1.png" alt="" height="50px">
				      <span class="title"><a href="#!">Figurine 1</a></span>
				      <p><spring:message code="brand"/> : Marque1 <br>
				         <spring:message code="description"/> : <div class="truncate"><spring:message code="long"/></div>
				      </p>
				      <p class="secondary-content"><spring:message code="prize"/> : 50 <spring:message code="euro"/></p>
				    </li>
				    <li class="collection-item avatar">
				      <img src="images/figurine2.png" alt="" height="50px">
				      <span class="title"><a href="#!">Figurine 2</a></span>
				      <p><spring:message code="brand"/> : Marque2 <br>
				         <spring:message code="description"/> : <p class="truncate"><spring:message code="long"/></p>
				      </p>
				      <p class="secondary-content"><spring:message code="prize"/> : 50 <spring:message code="euro"/></p>
				    </li>
				    <li class="collection-item avatar">
				      <img src="images/figurine3.png" alt="" height="50px">
				      <span class="title"><a href="#!">Figurine 3</a></span>
				      <p><spring:message code="brand"/> : Marque3 <br>
				         <spring:message code="description"/> : <p class="truncate"><spring:message code="long"/></p>
				      </p>
				      <p class="secondary-content"><spring:message code="prize"/> : 50 <spring:message code="euro"/></p>
				    </li>
				  </ul>
	                   	
	  			</div>
	  			
	  			<div class="col s3">
	  				<div class="card">
		  				<h5>
		  					<spring:message code="command"/>
						</h5>
		  				<ul>
		  					<div class="row">
		  						<li>
		  							<div class="col s7">
		  								figurine 1
		  							</div>
		  							<div class="col s5">
		  								50 <spring:message code="euro"/>
		  							</div>
		  						</li>
		  					</div>
		  					<div class="row">
		  						<li>
		  							<div class="col s7">
		  								figurine 2
		  							</div>
		  							<div class="col s5">
		  								50 <spring:message code="euro"/>
		  							</div>
		  						</li>
		  					</div>
		  					<div class="row">
		  						<li>
		  							<div class="col s7">
		  								figurine 3
		  							</div>
		  							<div class="col s5">
		  								50 <spring:message code="euro"/>
		  							</div>
		  						</li>
		  					</div>
		  					<hr>
		  					<div class="row">
		  						<li>
		  							<div>
		  								<spring:message code="total"/> : 150 <spring:message code="euro"/>
		  							</div>		  							
		  						</li>
		  					</div>
		  				</ul>		  				
		  			</div>
		  			<form:form 	id="commandUser"
		      					method="POST"
		      					action="/figurine/basket/command"
		      					modelAttribute="command">
			  			<form:button class="btn waves-effect waves-light" type="submit" name="action">
					        <spring:message code="commandButton"/>
			  			</form:button>
		  			</form:form>
	  			</div>
  			</div>
		</div>
	</body>
	
</html>
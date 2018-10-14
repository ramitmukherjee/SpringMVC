<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Create Pet</h1>
	<div>
		
		<form:form action="createPet" method="post">
			<form:errors path="*" />
			<p>
				<label for="petId">
					Pet Id: 
					<input type="text" name="petId" />
				</label>
			</p>
			<p>
				<label for="petName">
					Pet Name: 
					<input type="text" name="petName" />
				</label>
			</p>
			<p>
				<label for="petType">
					Pet Type: 
					<input type="text" name="petType" />				
				</label>
			</p>
			<p>
				<input type="submit" value="Create" />
			</p>
		</form:form>
	</div>
	<div>
		<p>PETS:</p>
		<div>
			<ul>
				<c:forEach var="pet" items="${pets }">
					<li>
						<form method="post" action="deletePet">
							<input type="hidden" name="petId" value="${pet.petId }" />
							<input type="hidden" name="petName" value="${pet.petName }" />
							<input type="hidden" name="petType" value="${pet.petType }" />
							<c:out value="${pet.petId }" /> |
							<c:out value="${pet.petName }" /> |
							<c:out value="${pet.petType }" /> |
							<input type="submit" value="Remove"/> 
						</form>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>
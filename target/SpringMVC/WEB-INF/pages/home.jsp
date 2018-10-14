<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Home</h1>
	<p>Hello ${name }</p>
	<p>Time: ${now }</p>
	<div>
		<form action="createPet" method="get">
			<input type="submit" value="Create Pet"/>
		</form>
	</div>
</body>
</html>
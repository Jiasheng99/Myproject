<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Form</title>
		<style type="text/css">
			body{
				padding: 0;
				margin: 0 auto;
				background-color: skyblue;
			}
			h3{
				font-weight: bold;
				letter-spacing: 5px;
			}
		</style>
	</head>
	<body>
		<h3>Formulari Registre</h3>
		<form action="../Valida" method="Post">
			<fieldset>
				<strong>Nick: </strong><input type="text" name="nick" required  /><br/>
				<strong>E-mail: </strong><input type="text" name="email" required /><br/>
				<strong>Pass: </strong><input type="password" name="pass" required /><br/>
				<input type="submit" value="Submit" />
			</fieldset>
		</form>
	</body>
</html>
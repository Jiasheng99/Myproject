<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
<h3>Formulari Registre</h3>
<form action="../Valida" method="Post">
	<fieldset>
		<b>Nick: </b><input type="text" name="nick" required " /><br/>
		<b>E-mail: </b><input type="text" name="email" required /><br/>
		<b>Pass: </b><input type="password" name="pass" required /><br/>
		<input type="submit" value="Submit" />
	</fieldset>
</form>
</body>
</html>
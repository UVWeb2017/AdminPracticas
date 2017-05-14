<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>INICIO DE SESION</title>

	<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<div id = "login">
	<center><h1>SISTEMA DE PRACTICAS</h1></center><br><br><br>
	 
	<head>
		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">
	</head>
	
		<form action ="iniciar" method = "post">
	
			<center>
			<span class="fontawesome-user"></span>
				<input type = "text" name = "usuario" placeholder = "Usuario"> <br>
			<span class="fontawesome-lock"></span>
				<input type = "password" name = "contraseña" placeholder = "Contraseña"> <br>
				<input type = "submit" value = "Iniciar sesion">
			</center>
		
		</form> <br>
	</div>	
		<center>¿No tienes una cuenta?<a href = "registro.jsp">Crear cuenta</a></center>
</body>
</html>
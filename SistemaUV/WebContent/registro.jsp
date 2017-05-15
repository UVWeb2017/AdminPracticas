<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro</title>
</head>

<body>
<!--<h1><center>REGISTRO</center></h1>
	<form class="form-horizontal" action='' method="POST">
  -->
	<form class="form-horizontal" action='usuarioregistra' method="POST">
	
	  <fieldset>
	    <div id="legend">
	      <legend class="">REGISTRO</legend>
	    </div>
	    <div class="control-group">
	      <!-- Username -->
	      <label class="control-label"  for="username">Nombre</label>
	      <div class="controls">
	     	<input type = "text" name = "nombre" placeholder = "Nombre(s)">
	      </div>
	    </div>
	    
		 <div class="control-group">
		      <!-- Usuario -->
		      <label class="control-label"  for="usuario">Usuario</label>
		      <div class="controls">		       
				<input type = "text" name = "usuario" placeholder = "Usuario">
			  </div>
	    </div>
	    <div class="control-group">
	      <!-- E-mail -->
	      <label class="control-label" for="email">E-mail</label>
	      <div class="controls">
			<input type = "text" name = "email" placeholder = "Email"> <br>
	      </div>
	    </div>
	 
	    <div class="control-group">
	      <!-- Password-->
	      <label class="control-label" for="contraseña">Contreseña</label>
	      <div class="controls">
		      <input type = "password" name = "contraseña" placeholder = "Contraseña"> <br>
	      </div>
	    </div>
	 
	    <div class="control-group">
	      <!-- Password -->
	      <div class="controls"></div>
	    </div>
		 <div class="control-group">
		      <!-- CODIGO DE AUTORIZACION -->
		      <label class="control-label"  for="codigo">Codigo de Autorización</label>
		      <div class="controls">
				<input type = "text" name = "codigo" placeholder = "Codigo"> <br> <br>
		      </div>
		</div>
	    <div class="control-group">
	      <!-- Button -->
	      <div class="controls">
	        <input type = "submit" value = "Registrarme"> 
	      </div>
	    </div>
	  </fieldset>
	</form>
	<!--
	<form action = "usuarioregistra" method = "post">
		<label class="control-label"  for="username">Nombre Completo: </label>
		<input type = "text" name = "nombre" placeholder = "Nombre(s)"> <br>
		
		<label class="control-label"  for="username">Nombre de Usuario: </label>
		<input type = "text" name = "usuario" placeholder = "Usuario"> <br>
		
		<label class="control-label"  for="username">Correo Electronico: </label>
		<input type = "text" name = "email" placeholder = "Email"> <br>
		
		<label class="control-label"  for="username">Contraseña: </label>
		<input type = "password" name = "contraseña" placeholder = "Contraseña"> <br>
		
		<label class="control-label"  for="username">Codigo de Autentificación: </label>
		
		<input type = "text" name = "codigo" placeholder = "Codigo"> <br> <br>
		
		<input type = "submit" value = "Registrarme"> 
	</form>
	-->
</body>

</html>
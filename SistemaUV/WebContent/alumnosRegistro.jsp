<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Alumnos</title>
</head>

<body>

	<form class="form-horizontal" action='usuarioregistra' method="POST">
	
	  <fieldset>
	    <div id="legend">
	      <legend class="">REGISTRO</legend><br>
	    </div>
	    <div class="control-group">
	      <!-- Nombre -->
	      <label class="control-label"  for="nombre">Nombre</label>
	      <div class="controls">
	     	<input type = "text" name = "nombre" placeholder = "Nombre(s)">
	      </div>
	    </div>
		<div class="control-group">
	      <!-- Apellidos -->
	      <label class="control-label"  for="apellido">Apellidos</label>
	      <div class="controls">
			<input type = "text" name = "apellido" placeholder = "Apellido">
	      </div>
	    </div>
	    
	    <div class="control-group">
	      <!-- Apellidos -->
	      <label class="control-label"  for="matricula">Matricula</label>
	      <div class="controls">
			<input type = "text" name = "matricula" placeholder = "Matricula">
		  </div>
	    </div>
	    
	    <div class="control-group">
	      <!-- Apellidos -->
	      <label class="control-label"  for="semestre">Semestre</label>
	      <div class="controls">
			<input type = "number" name = "semestre" min = "1" max = "10" placeholder = "Num">
	      </div>
	    </div>
	    
	    <div class="control-group">
	      <!-- Apellidos -->
	      <label class="control-label"  for="carrera">Carrera</label>
	      <div class="controls">
			<select name="Carrera">
			  <option>Ingenier�a El�ctrica</option>
			  <option>Ingenier�a Mec�nica</option>
			  <option>Ingenier�a Industrial</option>
			  <option>Ingenier�a Inform�tica</option>
			  <option>Ingenier�a Electronica Y Comunicaciones</option>
			  <option>Ingenier�a Topografica Geod�sica</option>
			  <option>Ingenier�a Civil</option>
			  <option>Ingenier�a Quimica</option>
			  <option>Ingenier�a Naval</option>
			  <option>Ingenier�a Metalurgica</option>
			</select>
		  </div>
	    </div>
	    
	    <div class="control-group">
	      <!-- Button -->
	      <div class="controls">
	        <br><br><input type = "submit" value = "Registrar"> 
	      </div>
	    </div>
	  </fieldset>
	</form>

</body>

</html>
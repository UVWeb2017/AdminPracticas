<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrar Materias</title>
</head>
<body>
	<form class="form-horizontal" action='nuevaMateria' method="POST">
	
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
	      <!-- Horario -->
	      <label class="control-label"  for="hora">Hora</label>
	      <div class="controls">
	     	<input type = "text" name = "hora" placeholder = "hora">
	      </div>
	    </div>
	     <div class="control-group">
	      <!-- Ao -->
	      <label class="control-label"  for="yeard">Ao</label>
	      <div class="controls">
		  <!--   <input type = "number" name = "semestre" placeholder = "Semestre">-->
		 	<input type = "number" name = "yeard" min = "2017" max = "2030" placeholder = "Num">
	      </div>
	    </div>
	    
	    
	     <div class="control-group">
	      <!-- MES -->
	      <label class="control-label"  for="mes">Mes</label>
	      <div class="controls">
		  <select type = "number" name="mes" placeholder = mes>
		    <option value="1">Enero</option>
		    <option value="2">Febrero</option>
		    <option value="3">Marzo</option>
		    <option value="4">Abril</option>
		    <option value="5">Mayo</option>
		    <option value="6">Junio</option>
		    <option value="7">Julio</option>
		    <option value="8">Agosto</option>
		    <option value="9">Septiembre</option>
		    <option value="10">Octubre</option>
		    <option value="11">Noviembre</option>
		    <option value="12">Diciembre</option>
		 	
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
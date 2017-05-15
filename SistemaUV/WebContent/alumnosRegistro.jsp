<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %><!-- Utilización de sql en jsp -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Alumnos</title>
</head>

<body>

	<form class="form-horizontal" action='nuevoAlumno' method="POST">
	
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
	      <!-- Semestre -->
	      <label class="control-label"  for="semestre">Semestre</label>
	      <div class="controls">
		  <!--   <input type = "number" name = "semestre" placeholder = "Semestre">-->
		 	<input type = "number" name = "semestre" min = "1" max = "10" placeholder = "Num">
	      </div>
	    </div>
	    
	    <div class="control-group">
	      <!-- Carrera -->
	      <label class="control-label"  for="carrera">Carrera</label>
	      <div class="controls">
		  <select type = "number" name="carrera" placeholder = "Carrera">
		 	<%
		        try{
		            Class.forName("com.mysql.jdbc.Driver").newInstance();
		            Connection CON = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/SistemaUV","root","notadesuicidio96");
		            String qrCate = " SELECT "+
									"id, "+
		            				"nombre "+
		                            "FROM Carreras";
		            PreparedStatement  PS   = CON.prepareStatement(qrCate);
		            ResultSet RS            = PS.executeQuery();
		
		            if(!RS.next()){
		                out.println("<OPTION VALUE=\"0\" SELECTED>No hay datos</OPTION>");
		            }else{
		                do{
		                    out.println("<OPTION VALUE=\""+ RS.getString(1) +"\">"+ RS.getString(2) +"</OPTION>");
		                }while(RS.next());
		            }
		        }catch (Exception e) {
		            out.println("<OPTION VALUE=\"0\" SELECTED>No hay datos</OPTION>");
		            e.printStackTrace(System.err);
		        }       
		    %>
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
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controlador.ConexionDB;
import Controlador.Consultas;

/**
 * Servlet implementation class RegistroAlumnos
 */
@WebServlet(name = "nuevoAlumno", urlPatterns = { "/nuevoAlumno" })
public class RegistroAlumnos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();


		String nombre = request.getParameter("nombre");
		String ape = request.getParameter("apellido");
		int semestre = Integer.parseInt(request.getParameter("semestre"));
		int carrera = Integer.parseInt(request.getParameter("carrera"));
		String matricula = request.getParameter("matricula");
		Consultas co = new Consultas();
		//int materia .... Creación de función de recoleccion de materia esto funcionara con la materia a seguir
		if(co.registrarAlumno(nombre, ape, semestre, carrera, matricula, 1)){
			response.sendRedirect("index.jsp");
		}
		else{
			
			response.sendRedirect("alumnosRegistro.jsp");
		}
	}

}
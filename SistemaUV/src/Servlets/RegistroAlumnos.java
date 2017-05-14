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

		Calendar fech = new GregorianCalendar();
		int year = fech.get(Calendar.YEAR);
		int month = fech.get(Calendar.MONTH);
		month++;
		int day = fech.get(Calendar.DAY_OF_MONTH);
		String año = Integer.toString(year);
		String mes = Integer.toString(month);
		String dia = Integer.toString(day);
		
		String fecha = año + "-" + mes + "-" + dia;
		
		
		String nombre = request.getParameter("nombre");
		String ape = request.getParameter("apellido");
		int semestre = Integer.parseInt(request.getParameter("semestre"));
		String carrera = request.getParameter("carrera");
		String mat = request.getParameter("matricula");
		
		Consultas co = new Consultas();
		
		if(co.registrarAlumno(nombre, ape, semestre, carrera, mat, 1, fecha)){
			
			response.sendRedirect("index.jsp");
		}
		else{
			
			response.sendRedirect("alumnosRegistro.jsp");
		}
	}

}
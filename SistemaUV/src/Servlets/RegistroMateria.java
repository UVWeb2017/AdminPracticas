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
@WebServlet(name = "nuevaMateria", urlPatterns = { "/nuevaMateria" })
public class RegistroMateria extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();


		String name = request.getParameter("nombre");
		int idMes = Integer.parseInt(request.getParameter("mes"));
		int yeard = Integer.parseInt(request.getParameter("yeard"));
		String hora = request.getParameter("hora");
		Consultas co = new Consultas();
		if(co.registrarMaterias(name, idMes, yeard, hora)){
			response.sendRedirect("index.jsp");
		}
		else{
			response.sendRedirect("materiasRegistro.jsp");
		}
	}

}

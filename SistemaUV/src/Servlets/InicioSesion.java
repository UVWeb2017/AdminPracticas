package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controlador.Consultas;

/**
 * Servlet implementation class InicioSesion
 */
@WebServlet(name = "iniciar", urlPatterns = { "/iniciar" })
public class InicioSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("contraseña");
		
		Consultas co = new Consultas();
		
		if(co.autenticacion(usuario, contraseña)){
			
			response.sendRedirect("alumnosRegistro.jsp"); 			//Falta crear este apartado
		}
		else{
			
			response.sendRedirect("index.jsp");
		}
	}

}
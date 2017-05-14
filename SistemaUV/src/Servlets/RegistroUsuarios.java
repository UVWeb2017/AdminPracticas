package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controlador.Consultas;

/**
 * Servlet implementation class RegistroUsuarios
 */
@WebServlet(name = "usuarioregistra", description = "RegUsuario", urlPatterns = { "/usuarioregistra" })
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public String getServletInfo() {
		return null; 
	}


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String usuario = request.getParameter("usuario");
		String mail = request.getParameter("email");
		String pass = request.getParameter("contraseña");
		String codigo = request.getParameter("codigo");
		Consultas co = new Consultas();
		System.out.println("Contra:"+pass);
		if(co.registrarUsuario(nombre, usuario, mail, pass,codigo)){
			
			response.sendRedirect("index.jsp");
		}
		else{
			response.sendRedirect("registro.jsp");
		}
	}

}
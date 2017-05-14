package Controlador;

import java.sql.*;
import java.util.Calendar;

public class Consultas extends ConexionDB {
	


	public boolean autenticacion(String usuario, String password){
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try{
			
			String consulta = "select * from usuarios where usuario = ? and contraseña = ?";
			pst = getConexion().prepareStatement(consulta);
			pst.setString(1, usuario);
			pst.setString(2, password);
			
			rs = pst.executeQuery();
			
			if(rs.absolute(1)){			/*Si rs.absolute(1) == true (existe en la db)*/
				
				return true;
			}
			
		}catch(Exception e){
			
			System.err.println("Error " + e);
			
		}finally{
			
			try{
				
				if(getConexion() != null) getConexion().close();
				if(pst != null) pst.close();
				if(rs != null) rs.close();
				
			}catch(Exception e){
				
				System.err.println("Error " + e);
			}
		}
		
		return false;
	}
	public boolean registrarUsuario(String name, String user, String mail, String password, String codigo){
		PreparedStatement pst = null;
		String codigoOficial = "UVWeb2017";//Codigo de autorización para la creación de cuentas
		try{
			if(codigo.equals(codigoOficial) ){
				String consulta = "Insert into Usuarios(Nombre, Usuario, Email, Contraseña) "
						+ "values(?,?,?,?)";
				pst = getConexion().prepareStatement(consulta);
				System.out.println("Contras entra:"+codigo);
				
				pst.setString(1, name);
				pst.setString(2, user);
				pst.setString(3, mail);
				pst.setString(4, password);
				
			}else{
				return false;
			}
			if(pst.executeUpdate() == 1){
				return true;
			}
			
		}catch(Exception e){
			
			System.err.println("Error " + e);
			
		}finally{
			
			try{
				
				if(getConexion() != null) getConexion().close();
				if(pst != null) pst.close();
				
			}catch(Exception e){
				
				System.err.println("Error " + e);
			}
		}
		
		return false;
	}
	
	
	public boolean registrarAlumno(String name, String lastname, int semester, String career,
			String matricula, int id, String fecha){
		
		PreparedStatement pst = null;
		
		try{
		
			String consulta = "insert into alumnos(Nombre, Apellido, Semestre, Carrera,"
					+ "Matricula, id_materia, Fecha_registro) values(?,?,?,?,?,?,?)";
			
			pst = getConexion().prepareStatement(consulta);
			
			pst.setString(1, name);
			pst.setString(2, lastname);
			pst.setInt(3, semester);
			pst.setString(4, career);
			pst.setString(5, matricula);
			pst.setInt(6, id);
			pst.setString(7, fecha);
			
			if(pst.executeUpdate() == 1){
				
				return true;
			}
			
		}catch(Exception e){
			System.err.println("Error " + e);
		}finally{
			
			try{
				
				if(getConexion() != null) getConexion().close();
				if(pst != null) pst.close();
				
			}catch(Exception e){
				System.err.println("Error " + e);
			}
		}
		
		return false;
	}
	
}
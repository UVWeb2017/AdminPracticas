package Controlador;

import java.sql.*;
import java.util.Calendar;

public class Consultas extends ConexionDB {
	


	public boolean autenticacion(String usuario, String password){
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try{
			
			String consulta = "select * from Usuarios where usuario = ? and contraseña = ?";
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
	//public boolean registrarAlumno(String name, String lastname, int semester, String career,
			//	String matricula, int id, String fecha){
	public boolean registrarAlumno(String name, String lastname, int semester, int carrera,
			String matricula, int id){
		
		PreparedStatement pst = null;
		
		try{
		
			String consulta = "insert into Alumnos(Nombre, Apellido, Semestre, idCarreras,"
					+ "Matricula, idMateria) values(?,?,?,?,?,?)";
			
			pst = getConexion().prepareStatement(consulta);
			
			pst.setString(1, name);
			pst.setString(2, lastname);
			pst.setInt(3, semester);
			//pst.setString(4, career);
			pst.setInt(4, carrera);
			pst.setString(5, matricula);
			pst.setInt(6, id);
//			pst.setString(7, fecha);
			
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
	public boolean registrarMaterias(String name,int idMes,int yeard,String hora){
	
		PreparedStatement pst = null;
		
		try{
			String consulta = "insert into Materias(Nombre,idMes,yeard,horario)"
						+ "values(?,?,?,?)";
			pst = getConexion().prepareStatement(consulta);
			pst.setString(1,name);
			pst.setInt(2, idMes);
			pst.setInt(3, yeard);
			pst.setString(4, hora);
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
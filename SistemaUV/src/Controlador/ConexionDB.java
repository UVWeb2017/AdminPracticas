package Controlador;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
	
    // DATOS PARA CONEXION CON BASE DE DATOS MYSQL

    private String USERNAME="root"; //EL MISMO QUE MYSQL
    private String PASSWORD="notadesuicidio96"; //EL MISMO QUE MYSQL 301194
    private String HOST="localhost"; 
    private String PORT="3306";
    private String DATABASE="SistemaUV"; //LA DATABASE A USAR
    private String CLASSNAME="com.mysql.jdbc.Driver";   //EL CONECTOR PARA HACER LA CONEXIÓN
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE+"?user="+USERNAME+"&password="+PASSWORD+"&useSSL=false";
    private Connection conex;

    public ConexionDB(){
        try{
            //TRATA DE REALIZAR LA CONEXIÓN 
        	Class.forName(CLASSNAME);
            conex=DriverManager.getConnection(URL, USERNAME,PASSWORD);
        }
        //SI NO PUEDE MANDA ERROR
        catch(ClassNotFoundException | SQLException e){
            System.err.println("ERROR EN LA CONEXIÓN " +e);
        }

    }
    //OBTEN LA CONEXIÓN
    public Connection getConexion(){
        return conex;
    }

    public static void main(String[] args){
        //CREAR UNA CONEXIÓN
        ConexionDB conex;
        conex = new ConexionDB();
    }
}
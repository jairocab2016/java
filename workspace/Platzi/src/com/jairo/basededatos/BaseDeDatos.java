package com.jairo.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {
	
	private final String URL 		= "jdbc:mysql://localhost/";
	private final String DB 		= "testing";
	private final String USUARIO	= "root";
	private final String PASSWORD 	= "";
	
	public Connection conexion = null;
	
	@SuppressWarnings("finally")
	public Connection conectar(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(URL+DB,USUARIO, PASSWORD);
			if (conexion != null) {
				System.out.println("La conexion se ejecuto exitosamente");
			} else {
				System.out.println("La conexion no fue exitosa");
			}
			
			Statement sentencia =  conexion.createStatement();
			ResultSet consultar = sentencia.executeQuery("select * from tabla");
			while (consultar.next()){
				
				System.out.println(consultar.getString("description"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			return conexion;
		}
		
	}

}

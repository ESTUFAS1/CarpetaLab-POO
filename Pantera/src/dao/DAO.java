package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {//informacion de la cuenta y ruta
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/basedata";
	

	public int Agregar() {
		Connection conexion = null;
		int filas = 0;
		try {
		conexion = conectar();
		String sql = "INSERT INTO `tabla`(`id`,`nombre`,`DNI`)VALUES(6,'panterarosa',3456787)";
		Statement stmt = conexion.createStatement();
		filas = stmt.executeUpdate(sql);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				conexion.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return filas;
		
	}
		
	
	public Connection conectar() {	
		Connection conexion = null;
		try {//conectar a la bd
			conexion = DriverManager.getConnection(path, user, psw);
			System.out.println("si si si");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	
		return conexion;
	}
}
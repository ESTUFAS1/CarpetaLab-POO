package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {//informacion de la cuenta y ruta
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/basedata";
	

	public int agregar() {
		Connection conexion = null;
		int filas = 0;
		try {
		conexion = conectar();
		String sql = "INSERT INTO `humano`(`id`,`nombre`,`DNI`)VALUES(4,'hola',1356326)";
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
	
	//________________________________________TERMINAME :C________________________________________________________
	public int eliminar() {
		Connection conexion = null;
		int filas=0;
		try {
			conexion = conectar();
			String sql = "delete from `basedata`.`humano`";
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

}
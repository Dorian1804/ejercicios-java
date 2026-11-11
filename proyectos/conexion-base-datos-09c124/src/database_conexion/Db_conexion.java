/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_conexion;
import java.sql.*;

/**
 *
 * @author Alumnos
 */
public class Db_conexion {
    static String url="jdbc:mysql://localhost:3306/acceso_ceti";
    static String user ="root";
    static String pass ="";
    
    public static Connection conectar ()
    {
        Connection con=null;
        try
        {
           con= DriverManager.getConnection(url,user,pass);
            System.out.println("conexion exitosa");
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }
            
}

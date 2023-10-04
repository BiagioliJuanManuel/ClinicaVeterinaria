/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * Hola Mundo!!
 */
public class Conexion {    
    private static final String URL ="jdbc:mariadb://localhost/";
    private static final String DB = "veterinaria";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection con;
    
    private Conexion(){}
    
    public static Connection getConexion(){
    
        if(con == null){
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                con = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
//                JOptionPane.showMessageDialog(null, "Conexión exitosa");
		    
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión");
            }
                
        }
        return con;
    }
            
        
}


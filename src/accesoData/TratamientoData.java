package accesoData;

import entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TratamientoData {

    private Connection conexion = null;

    public TratamientoData() {
        conexion = Conexion.getConexion();   
    }

    public void guardarTratamiento(Tratamiento tratamiento) {
        String sql = "INSERT INTO tratamientos (codigo, tipoTratamiento, descripcion, importe, estado) VALUES (?,?,?,?,?)";
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, tratamiento.getCodigoTratamiento());
            ps.setString(2, tratamiento.getTipo());
            ps.setString(3, tratamiento.getDescripcion());
            ps.setDouble(4, tratamiento.getImporte());
            ps.setBoolean(5, tratamiento.isEstado());
            int resultado = ps.executeUpdate();
            if(resultado != 0){
                JOptionPane.showMessageDialog(null, "Tratamiento guardado con éxito.");
            }          
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamientos");
        }
        
    }


    public void modificarTratamiento(Tratamiento tratamiento) {
        String sql = "UPDATE tratamientos SET codigo = ?, tipoTratamiento = ?, descripcion = ?, importe = ?, estado = ? "
                + "WHERE idTratamiento = ?";
        PreparedStatement ps;        
        try{
            ps = conexion.prepareStatement(sql);            
            ps.setInt(1, tratamiento.getCodigoTratamiento());
            ps.setString(2, tratamiento.getTipo());
            ps.setString(3, tratamiento.getDescripcion());
            ps.setDouble(4, tratamiento.getImporte());
            ps.setBoolean(5, tratamiento.isEstado());
            ps.setInt(6,tratamiento.getIdTratamiento());
            int resultado = ps.executeUpdate();
            
            if(resultado != 0){
                JOptionPane.showMessageDialog(null, "Tratamiento modificado con éxito.");
            }
        
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar el tratamiento.");
        }
    }

    public void eliminarTratamiento(int idTratamiento) {
	String sql = "UPDATE tratamientos SET estado = 0 WHERE idTratamiento = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idTratamiento);
            int exito = ps.executeUpdate();
            if (exito != 0) {
                JOptionPane.showMessageDialog(null, "Tratamiento eliminado ");
            }else{
               JOptionPane.showMessageDialog(null, "No se pudo eliminar el tratamiento");  
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamientos" + ex.getMessage());

        }
	
    }

    public Tratamiento buscarTratamiento(int idTratamiento) {
	String sql = "SELECT * FROM tratamientos WHERE idTratamiento = ?";
	Tratamiento respuesta = new Tratamiento();
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setInt(1, idTratamiento);
	    ResultSet rs = ps.executeQuery();
	    if (rs.next()) {
		respuesta.setIdTratamiento(idTratamiento);
		respuesta.setTipo(rs.getString("tipoTratamiento"));
		respuesta.setDescripcion(rs.getString("descripcion"));
		respuesta.setCodigoTratamiento(rs.getInt("codigo"));
		respuesta.setImporte(rs.getDouble("importe"));
		respuesta.setEstado(rs.getBoolean("estado"));
	    }else{
		JOptionPane.showMessageDialog(null, "No se encontro tratamiento con id: " + idTratamiento);
	    }
		
		
	} catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamientos" + ex.getMessage());
	    
	}
	
	return respuesta;
    }
    
    public int buscarTratamientoPorNombre(String nombre){
        String sql = "SELECT idTratamiento FROM tratamientos WHERE tipoTratamiento = ?";
        int respuesta = 0;
        try {    
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
		respuesta = (rs.getInt("idTratamiento"));
                return respuesta; 
            }
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamientos" + ex.getMessage());
        }
                   
       return respuesta;       
    } 
    
    
    public List<Tratamiento> listarTratamientos() {
	String sql = "SELECT * FROM tratamientos";
	ArrayList<Tratamiento> listaTratamientos = new ArrayList<>();
	
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {
		Tratamiento tratamiento = new Tratamiento();
		tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
		tratamiento.setTipo(rs.getString("tipoTratamiento"));
		tratamiento.setDescripcion(rs.getString("descripcion"));
		tratamiento.setCodigoTratamiento(rs.getInt("codigo"));
		tratamiento.setImporte(rs.getDouble("importe"));
		tratamiento.setEstado(rs.getBoolean("estado"));
		listaTratamientos.add(tratamiento);
	    }
		
	} catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamientos" + ex.getMessage());
	    
	}
	
	return listaTratamientos;
    }
}

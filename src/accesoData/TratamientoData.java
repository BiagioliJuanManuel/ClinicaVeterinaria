package accesoData;

import entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    public void eliminarTratamiento() {
    }

    public void mostrarTratamiento() {
    }
}

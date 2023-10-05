package accesoData;

import entidades.Cliente;
import entidades.Mascota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static java.time.temporal.TemporalQueries.localDate;
import javax.swing.JOptionPane;

public class MascotaData {

    private Connection conexion = null;

    public MascotaData() {
        conexion = Conexion.getConexion();       
        
    }

    public void guardarMascota(Mascota mascota) {
        String sql = "INSERT INTO mascotas(alias, sexo, especie, raza, colorPelo, fechaNacimiento, pesoPromedio, pesoActual, estado, idCliente)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1,mascota.getAlias());
            ps.setString(2,mascota.getSexo());
            ps.setString(3,mascota.getEspecie());
            ps.setString(4,mascota.getRaza());
            ps.setString(5,mascota.getColorPelo());
            ps.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));
            ps.setDouble(7,mascota.getPesoPromedio());
            ps.setDouble(8,mascota.getPesoActual());
            ps.setBoolean(9, mascota.isEstado());
            ps.setInt(10, mascota.getIdCliente());
            int resultado = ps.executeUpdate();
            if(resultado != 0){
                JOptionPane.showMessageDialog(null, "Mascota guardada con éxito.");
            }          
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar mascota.");
        }
    }

    public void modificarMascota(Mascota mascota) {
        String sql = "UPDATE mascotas SET alias=?, sexo=?, especie=?, raza=?, colorPelo=?, fechaNacimiento=?, pesoPromedio=?, "
                + "pesoActual=?, estado=?, idCliente=? WHERE idMascota=?";                
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1,mascota.getAlias());
            ps.setString(2,mascota.getSexo());
            ps.setString(3,mascota.getEspecie());
            ps.setString(4,mascota.getRaza());
            ps.setString(5,mascota.getColorPelo());
            ps.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));
            ps.setDouble(7,mascota.getPesoPromedio());
            ps.setDouble(8,mascota.getPesoActual());
            ps.setBoolean(9, mascota.isEstado());
            ps.setInt(10, mascota.getIdCliente());
            ps.setInt(11,mascota.getIdMascota());
            int resultado = ps.executeUpdate();
            if(resultado != 0){
                JOptionPane.showMessageDialog(null, "Mascota modificada con éxito.");
            } else{
              JOptionPane.showMessageDialog(null, "No se pudo modificar la Mascota.");  
            }         
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar mascota.");
        }       
    }

    public void eliminarMascota(Mascota mascota) {
               String sql = "UPDATE mascotas SET estado = 0 WHERE idMascota = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, mascota.getIdMascota());
            int exito = ps.executeUpdate();
            if (exito != 0) {
                JOptionPane.showMessageDialog(null, "Mascota Eliminada "+ mascota.toString());
            }else{
               JOptionPane.showMessageDialog(null, "No se pudo eliminar la Mascota.");  
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascotas" + ex.getMessage());

        }
    }

    public void listarMascotas() {
    }

    public Cliente listarMascotas(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mostrarHistorialVisitas() {
    }
}

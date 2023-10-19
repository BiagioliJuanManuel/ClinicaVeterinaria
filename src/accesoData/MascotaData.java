package accesoData;

import entidades.Cliente;
import entidades.Mascota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MascotaData {

    private Connection conexion = null;

    public MascotaData() {
        conexion = Conexion.getConexion();       
        
    }

    public void guardarMascota(Mascota mascota) {
        String sql = "INSERT INTO mascotas(alias, sexo, especie, raza, colorPelo, fechaNacimiento, estado, idCliente)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1,mascota.getAlias());
            ps.setString(2,mascota.getSexo());
            ps.setString(3,mascota.getEspecie());
            ps.setString(4,mascota.getRaza());
            ps.setString(5,mascota.getColorPelo());
            ps.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));            
            ps.setBoolean(7, mascota.isEstado());
            ps.setInt(8, mascota.getIdCliente());
            int resultado = ps.executeUpdate();
            if(resultado != 0){
                JOptionPane.showMessageDialog(null, "Mascota guardada con éxito.");
            }          
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar mascota.");
        }
    }

    public void modificarMascota(Mascota mascota) {
        String sql = "UPDATE mascotas SET alias=?, sexo=?, especie=?, raza=?, colorPelo=?, fechaNacimiento=?, "
                + " estado=?, idCliente=? WHERE idMascota=?";                
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1,mascota.getAlias());
            ps.setString(2,mascota.getSexo());
            ps.setString(3,mascota.getEspecie());
            ps.setString(4,mascota.getRaza());
            ps.setString(5,mascota.getColorPelo());
            ps.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));            
            ps.setBoolean(7, mascota.isEstado());
            ps.setInt(8, mascota.getIdCliente());
            ps.setInt(9,mascota.getIdMascota());
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
    
    public Mascota buscarMascota(int idMascota){
	String sql = "SELECT * FROM mascotas WHERE idMascota = ? ";
	Mascota mascota = new Mascota();
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setInt(1, idMascota);
	    ResultSet rs = ps.executeQuery();
	    if (rs.next()) {
		mascota.setIdMascota(rs.getInt("idMascota"));
		mascota.setAlias(rs.getString("alias"));
		mascota.setSexo(rs.getString("sexo"));
		mascota.setEspecie(rs.getString("especie"));
		mascota.setRaza(rs.getString("raza"));
		mascota.setColorPelo(rs.getString("colorPelo"));
		mascota.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());		
		mascota.setIdCliente(rs.getInt("idCliente"));
		mascota.setEstado(rs.getBoolean("estado"));
	    }else {
	       JOptionPane.showMessageDialog(null, "No se encontro mascota con id: "+idMascota);
		
	    }
	    
	} catch (SQLException ex) {
	   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascotas");
	}
	return mascota;
    }
    
        public List<Mascota> buscarMascota(String nombre){
	String sql = "SELECT * FROM mascotas WHERE alias = ? ";
	ArrayList<Mascota> mascotas = new ArrayList<>();
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setString(1, nombre);
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {
		Mascota mascota = new Mascota();
		mascota.setIdMascota(rs.getInt("idMascota"));
		mascota.setAlias(rs.getString("alias"));
		mascota.setSexo(rs.getString("sexo"));
		mascota.setEspecie(rs.getString("especie"));
		mascota.setRaza(rs.getString("raza"));
		mascota.setColorPelo(rs.getString("colorPelo"));
		mascota.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());		
		mascota.setIdCliente(rs.getInt("idCliente"));
		mascota.setEstado(rs.getBoolean("estado"));
		mascotas.add(mascota);
	    }
//	    else {
//	       JOptionPane.showMessageDialog(null, "No se encontro mascota con el nombre: "+nombre);
//		
//	    }
	    
	} catch (SQLException ex) {
	   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascotas");
	}
	return mascotas;
    }
    
    public List<Mascota> listarMascotas(){
        String sql = "SELECT * FROM mascotas";
        ArrayList<Mascota> mascotas = new ArrayList<>();  
        try{
         PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());                
                mascota.setEstado(rs.getBoolean("estado"));
                mascota.setIdCliente(rs.getInt("idCliente"));
                mascota.setIdMascota(rs.getInt("idMascota"));
                
                mascotas.add(mascota);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascotas");
        }
        return mascotas;
    }
    
    
    public void mostrarHistorialVisitas() {
    }
}

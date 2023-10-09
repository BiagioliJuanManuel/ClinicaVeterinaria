package accesoData;

import entidades.Mascota;
import entidades.Tratamiento;
import entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VisitaData {

    private Connection conexion = null;
    MascotaData md = new MascotaData();
    TratamientoData td = new TratamientoData();
    Mascota mascota = new Mascota();
    Tratamiento tratamiento = new Tratamiento();

    public VisitaData() {
	conexion = Conexion.getConexion();
    }

    public void guardarVisita(Visita visita) {
	String sql = "INSERT INTO visitas (idVisita, idMascota, idTratamiento, fechaVisita, estado) VALUES (?,?,?,?,?)";
	
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setInt(1, visita.getIdVisita());
	    ps.setInt(2, visita.getMascota().getIdMascota());
	    ps.setInt(3, visita.getTratamiento().getIdTratamiento());
	    ps.setDate(4, Date.valueOf(visita.getFechaVisita()));
	    ps.setBoolean(5, true);
	    int resultado = ps.executeUpdate();
	    if (resultado != 0) {
		JOptionPane.showMessageDialog(null, "Visita guardada");
	    }else{
		JOptionPane.showMessageDialog(null, "No se pudo guardar la visita");
	    }
	} catch (SQLException ex) {
	    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas");
	}
    }

    public void modificarVisita(Visita visita) {
	 String sql = "UPDATE visitas SET idTratamiento = ?, idMascota = ?, fechaVisita = ?, estado = ? "
                + "WHERE idVisita = ?";
        PreparedStatement ps;        
        try{
            ps = conexion.prepareStatement(sql);            

            ps.setInt(1, visita.getTratamiento().getIdTratamiento());
            ps.setInt(2, visita.getMascota().getIdMascota());
            ps.setDate(3, Date.valueOf(visita.getFechaVisita()));
            ps.setInt(4, visita.getIdVisita());
	    ps.setBoolean(5, visita.isEstado());
            int resultado = ps.executeUpdate();
            
            if(resultado != 0){
                JOptionPane.showMessageDialog(null, "Visita modificada con éxito.");
            }else{
		JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas");
		
	    }
        
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas");
        }
    }

    public void eliminarVisita(Visita visita) {
	String sql = "UPDATE visitas SET estado = 0 WHERE idVisita = ?";
	PreparedStatement ps;
	try {
	    ps = conexion.prepareStatement(sql);
	    ps.setInt(1, visita.getIdVisita());
	    int rs = ps.executeUpdate();
	    if (rs != 0) {
		JOptionPane.showMessageDialog(null, "Visita eliminada con éxito.");
	    }else {
		JOptionPane.showMessageDialog(null, "No fue posible eliminar la visita");
	    }
		

	} catch (SQLException ex) {
	    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas");
	}
    }

    public void buscarVisita(Visita visita) {
	String sql = "SELECT * FROM visitas WHERE idVisita = ?";
	Visita respuesta = new Visita();
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setInt(1, visita.getIdVisita());
	    ResultSet rs = ps.executeQuery();
	    
	    if (rs.next()) {
		respuesta.setIdVisita(visita.getIdVisita());
		respuesta.setMascota(mascota = md.buscarMascota(rs.getInt("idMascota")));
		respuesta.setTratamiento(tratamiento = td.buscarTratamiento(rs.getInt("idTratamiento")));
		respuesta.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
		respuesta.setEstado(rs.getBoolean("estado"));
		JOptionPane.showMessageDialog(null, "Visita encontrada ");
	    }else{
		JOptionPane.showMessageDialog(null, "No se encontro visita con id: "+ visita.getIdVisita());
	    }
		
		
	} catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas" + ex.getMessage());
	    
	}
    }
    
    public List<Visita> listarVisitas(){
	String sql = "SELECT * FROM visitas";
	ArrayList<Visita> lista = new ArrayList<>();
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {		
		Visita visita = new Visita();
		visita.setIdVisita(rs.getInt("idVisita"));
		visita.setMascota(mascota = md.buscarMascota(rs.getInt("idMascota")));
		visita.setTratamiento(tratamiento = td.buscarTratamiento(rs.getInt("idTratamiento")));
		visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
		visita.setEstado(rs.getBoolean("estado"));
		lista.add(visita);
	    }
	} catch (SQLException ex) {
	   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas" + ex.getMessage());
	}
	return lista;
}
	
    
}
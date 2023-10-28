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
	String sql = "INSERT INTO visitas (idVisita, idMascota, idTratamiento, descripcion, fechaVisita, pesoActual, pesoPromedio, estado, pago)"
                + " VALUES (?,?,?,?,?,?,?,?,?)";
	
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setInt(1, visita.getIdVisita());
	    ps.setInt(2, visita.getMascota().getIdMascota());
	    ps.setInt(3, visita.getTratamiento().getIdTratamiento());
	    ps.setString(4, visita.getDescripcion());
	    ps.setDate(5, Date.valueOf(visita.getFechaVisita()));
            ps.setDouble(6, visita.getPesoActual());
            ps.setDouble(7, visita.getPesoPromedio());
	    ps.setBoolean(8, true);
	    ps.setBoolean(9, false);
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
	 String sql = "UPDATE visitas SET idTratamiento = ?, idMascota = ?, descripcion = ?, fechaVisita = ?, pesoActual = ?, pesoPromedio = ?, estado = ?, pago = ? "
                + "WHERE idVisita = ?";
        PreparedStatement ps;        
        try{
            ps = conexion.prepareStatement(sql);            

            ps.setInt(1, visita.getTratamiento().getIdTratamiento());
            ps.setInt(2, visita.getMascota().getIdMascota());
	    ps.setString(3, visita.getDescripcion());
            ps.setDate(4, Date.valueOf(visita.getFechaVisita()));
            ps.setDouble(5, visita.getPesoActual());
            ps.setDouble(6, visita.getPesoPromedio());
            ps.setInt(7, visita.getIdVisita());
	    ps.setBoolean(8, visita.isEstado());
	    ps.setBoolean(9, visita.isEstado());
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

    public Visita buscarVisita(int idVisita) {
	String sql = "SELECT * FROM visitas WHERE idVisita = ?";
	Visita respuesta = new Visita();
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setInt(1, idVisita);
	    ResultSet rs = ps.executeQuery();
	    
	    if (rs.next()) {
		respuesta.setIdVisita(idVisita);
		respuesta.setMascota(mascota = md.buscarMascota(rs.getInt("idMascota")));
		respuesta.setTratamiento(tratamiento = td.buscarTratamiento(rs.getInt("idTratamiento")));
		respuesta.setDescripcion(rs.getString("descripcion"));
		respuesta.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                respuesta.setPesoActual(rs.getDouble("pesoActual"));
                respuesta.setPesoPromedio(rs.getDouble("pesoPromedio"));
		respuesta.setEstado(rs.getBoolean("estado"));
		respuesta.setPago(rs.getBoolean("pago"));
//		JOptionPane.showMessageDialog(null, "Visita encontrada ");
	    }else{
		JOptionPane.showMessageDialog(null, "No se encontro visita con id: "+ idVisita);
	    }
		
	} catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas" + ex.getMessage());
	}
	return respuesta;
	    
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
		visita.setDescripcion(rs.getString("descripcion"));
		visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setPesoActual(rs.getDouble("pesoActual"));
                visita.setPesoPromedio(rs.getDouble("pesoPromedio"));
		visita.setEstado(rs.getBoolean("estado"));
		visita.setPago(rs.getBoolean("pago"));
		lista.add(visita);
	    }
	} catch (SQLException ex) {
	   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas" + ex.getMessage());
	}
	return lista;
}
	public List<Visita> listarVisitasPorID(int idMascota){
	String sql = "SELECT * FROM visitas WHERE idMascota = ?";
	ArrayList<Visita> lista = new ArrayList<>();
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idMascota);
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {		
		Visita visita = new Visita();
		visita.setIdVisita(rs.getInt("idVisita"));
		visita.setMascota(mascota = md.buscarMascota(rs.getInt("idMascota")));
		visita.setTratamiento(tratamiento = td.buscarTratamiento(rs.getInt("idTratamiento")));
		visita.setDescripcion(rs.getString("descripcion"));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setPesoActual(rs.getDouble("pesoActual"));
                visita.setPesoPromedio(rs.getDouble("pesoPromedio"));
		visita.setEstado(rs.getBoolean("estado"));
		visita.setPago(rs.getBoolean("pago"));
		lista.add(visita);
	    }
	} catch (SQLException ex) {
	   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas" + ex.getMessage());
	}
	return lista;
    }
        
        public List<Visita> listarVisitasPorIDActivos(int idMascota){
	String sql = "SELECT * FROM visitas WHERE idMascota = ? AND estado = 1 AND pago = 0";
	ArrayList<Visita> lista = new ArrayList<>();
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idMascota);
	    ResultSet rs = ps.executeQuery();
	    while (rs.next()) {		
		Visita visita = new Visita();
		visita.setIdVisita(rs.getInt("idVisita"));
		visita.setMascota(mascota = md.buscarMascota(rs.getInt("idMascota")));
		visita.setTratamiento(tratamiento = td.buscarTratamiento(rs.getInt("idTratamiento")));
		visita.setDescripcion(rs.getString("descripcion"));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setPesoActual(rs.getDouble("pesoActual"));
                visita.setPesoPromedio(rs.getDouble("pesoPromedio"));
		visita.setEstado(rs.getBoolean("estado"));
		visita.setPago(rs.getBoolean("pago"));
		lista.add(visita);
	    }
	} catch (SQLException ex) {
	   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas" + ex.getMessage());
	}
	return lista;
    }
    
    public void pagarVisita(Visita visita) {
//	UPDATE `visitas` SET `pago`='0' WHERE `idVisita`= 28;
	 String sql = "UPDATE visitas SET pago = 1 "
                + "WHERE idVisita = ?";
        PreparedStatement ps;        
        try{
            ps = conexion.prepareStatement(sql);         

            ps.setInt(1, visita.getIdVisita());            
            int resultado = ps.executeUpdate();
            
            if(resultado != 0){
                JOptionPane.showMessageDialog(null, "Pago realizado.");
            }else{
		JOptionPane.showMessageDialog(null, "Error al pagar.");
		
	    }
        
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error pagarVisita "+ex);
        }
    }    
        
}
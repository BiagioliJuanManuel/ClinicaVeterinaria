package accesoData;

import entidades.Mascota;
import entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VisitaData {

    private Connection conexion = null;

    public VisitaData() {
	conexion = Conexion.getConexion();
    }

    public void guardarVisita(Visita visita) {
	String sql = "INSERT INTO visitas (idVisita, idMascota, idTratamiento, fechaVisita) VALUES (?,?,?,?)";
	
	try {
	    PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setInt(1, visita.getIdVisita());
	    ps.setInt(2, visita.getMascota().getIdMascota());
	    ps.setInt(3, visita.getTratamiento().getIdTratamiento());
	    ps.setDate(4, Date.valueOf(visita.getFechaVisita()));
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

    public void modificarVisita() {
    }

    public void eliminarVisita() {
    }

    public void mostrarVisita() {
    }
}

package accesoData;

import entidades.*;
import accesoData.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteData {

    private Connection conexion = null;

    public  ClienteData() {
	conexion = Conexion.getConexion();
    }

    public void guardarCliente(Cliente cliente) {
	String sql = "INSERT INTO clientes(nombre,documento,direccion,telefono,contactoAlternativo,estado)"
		+ "VALUES (?,?,?,?,?,?)";
	PreparedStatement ps;
	try {
	    ps = conexion.prepareStatement(sql);
	    ps.setString(1, cliente.getNombre());
	    ps.setInt(2, cliente.getDocumento());
	    ps.setString(3, cliente.getDireccion());
	    ps.setString(4, cliente.getTelefono());
	    ps.setString(5, cliente.getContactoAlternativo());
	    ps.setBoolean(6, cliente.isEstado());
	    int resultado = ps.executeUpdate();
	    if (resultado != 0) {
		JOptionPane.showMessageDialog(null, "Cliente guardado exitosamente"+cliente.toString());
	    }
	} catch (SQLException ex) {
	    JOptionPane.showMessageDialog(null, "Error al acceder tabla clientes");
	}
	
    }

    public void modificarCliente() {
    }

    public void eliminarCliente() {
    }

    public void listarCliente() {
    }

    public int buscarCliente(int idCliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String buscarCliente(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int buscarClientePorDNI(int documento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

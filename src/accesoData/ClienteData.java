package accesoData;

import entidades.*;
import accesoData.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
		JOptionPane.showMessageDialog(null, "Cliente guardado exitosamente "+cliente.toString());
	    }
	} catch (SQLException ex) {
	    JOptionPane.showMessageDialog(null, "Error al acceder tabla clientes");
	}
	
    }

    public void modificarCliente(Cliente cliente) {
	String sql = "UPDATE clientes SET nombre = ?, direccion = ?, telefono = ?, contactoAlternativo = ?, "
		+ "estado = ? WHERE documento = ?";
	try {
	    PreparedStatement ps  = conexion.prepareStatement(sql);
	    ps.setString(1, cliente.getNombre());	    
	    ps.setString(2, cliente.getDireccion());
	    ps.setString(3, cliente.getTelefono());
	    ps.setString(4, cliente.getContactoAlternativo());
	    ps.setBoolean(5, cliente.isEstado());
	    ps.setInt(6, cliente.getDocumento());
	    int resultado = ps.executeUpdate();
	    if (resultado != 0) {
		JOptionPane.showMessageDialog(null, "Cliente modificado exitosamente "+cliente.toString());
	    }
	} catch (SQLException ex) {
	    JOptionPane.showMessageDialog(null, "Error al acceder tabla clientes");
	    
	}
	
    }

    public void eliminarCliente(Cliente cliente) {
	       String sql = "UPDATE clientes SET estado = 0 WHERE idCliente = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());
            int exito = ps.executeUpdate();
            if (exito != 0) {
                JOptionPane.showMessageDialog(null, "Cliente Eliminado "+ cliente.toString());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());

        }
    }

    public List<Cliente> listarCliente() {
	String sql = "SELECT nombre,documento,direccion,telefono,contactoAlternativo,estado,idCliente FROM clientes WHERE estado = 1";
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDocumento(rs.getInt("documento"));
		cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setContactoAlternativo(rs.getString("contactoAlternativo"));
                cliente.setEstado(rs.getBoolean("estado"));
                cliente.setIdCliente(rs.getInt("idCliente"));

                clientes.add(cliente);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clientes");
        }
        return clientes;
    }

    public Cliente buscarCliente(int idCliente) {
	Cliente cliente = new Cliente();
        String sql = "SELECT nombre,documento,direccion,telefono,contactoAlternativo,estado,idCliente FROM clientes WHERE idCliente = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDocumento(rs.getInt("documento"));
		cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setContactoAlternativo(rs.getString("contactoAlternativo"));
                cliente.setEstado(rs.getBoolean("estado"));
                cliente.setIdCliente(rs.getInt("idCliente"));
            }else{
		JOptionPane.showMessageDialog(null, "No se encontro cliente con id: "+ idCliente);
	    }
		
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clientes");
        }
        return cliente;
    }

    public Cliente buscarCliente(String nombre) {
     	Cliente cliente = new Cliente();
        String sql = "SELECT nombre,documento,direccion,telefono,contactoAlternativo,estado,idCliente FROM clientes WHERE nombre = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
	    ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDocumento(rs.getInt("documento"));
		cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setContactoAlternativo(rs.getString("contactoAlternativo"));
                cliente.setEstado(rs.getBoolean("estado"));
                cliente.setIdCliente(rs.getInt("idCliente"));
            }else{
		JOptionPane.showMessageDialog(null, "No se encontro cliente con el nombre: "+ nombre);
	    }
		
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clientes");
        }
        return cliente;
    }
    

    public Cliente buscarClientePorDNI(int documento) {
	    Cliente cliente = new Cliente();
	    String sql = "SELECT nombre,documento,direccion,telefono,contactoAlternativo,estado,idCliente FROM clientes WHERE documento = ?";
	    try {
		PreparedStatement ps = conexion.prepareStatement(sql);
		ps.setInt(1, documento);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
		    cliente.setNombre(rs.getString("nombre"));
		    cliente.setDocumento(rs.getInt("documento"));
		    cliente.setDireccion(rs.getString("direccion"));
		    cliente.setTelefono(rs.getString("telefono"));
		    cliente.setContactoAlternativo(rs.getString("contactoAlternativo"));
		    cliente.setEstado(rs.getBoolean("estado"));
		    cliente.setIdCliente(rs.getInt("idCliente"));
		}else{
		    JOptionPane.showMessageDialog(null, "No se encontro cliente con el documento: "+ documento);
		}

		ps.close();

	    } catch (SQLException ex) {
		JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clientes");
	    }
	    return cliente;

	}
    
    public List<Mascota> listarMascotas(Cliente cliente) {
        String sql = "SELECT * FROM mascotas WHERE idCliente = ? AND estado = 1"; 
        ArrayList<Mascota> mascotas = new ArrayList<>();  
        try{
         PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1,cliente.getIdCliente());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                mascota.setPesoPromedio(rs.getDouble("pesoPromedio"));
                mascota.setPesoActual(rs.getDouble("pesoActual"));
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
    
}

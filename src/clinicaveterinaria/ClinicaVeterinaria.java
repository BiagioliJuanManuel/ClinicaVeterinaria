/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import accesoData.ClienteData;
import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Manuel Biagioli
 */
public class ClinicaVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
//	// Metodo guardar cliente
//	ClienteData persona = new ClienteData();
//	Cliente mariela = new Cliente("Mariela Rosa Corzo", 6345242, "calle bolivia", "15-21151415", "Mariela: 15-5684657", true);
//	persona.guardarCliente(mariela);
	
//	// Metodo modificar cliente
//	ClienteData clienteData = new ClienteData();
//	Cliente juanPerez = new Cliente("Juan Rodrigo Perez", 12874122, "calle Alem 967", "15-2121415", "Mariela: 15-5684657", true, 1);
//	clienteData.modificarCliente(juanPerez);
	
//	// Metodo eliminar cliente
//	ClienteData clienteData = new ClienteData();
//	Cliente juanPerez = new Cliente("Juan Rodrigo Perez", 12874122, "calle Alem 967", "15-2121415", "Mariela: 15-5684657", true, 1);
//	clienteData.eliminarCliente(juanPerez);
	
	// Metodo listar clientes
//	ClienteData clienteData = new ClienteData();
//	List<Cliente> lista = clienteData.listarCliente();
//	for (Cliente cliente : lista) {
//	    System.out.println(cliente.toString());
//	}
	
//	// Metodo buscarCliente por id
//	ClienteData clienteData = new ClienteData();
//	Cliente recibido = clienteData.buscarCliente(1);
//	System.out.println(recibido.toString());
//	
	// Metodo buscarClientePorDNI	
	ClienteData clienteData = new ClienteData();
	Cliente recibido = clienteData.buscarClientePorDNI(124);
	System.out.println(recibido.toString());
	
    }
    
}

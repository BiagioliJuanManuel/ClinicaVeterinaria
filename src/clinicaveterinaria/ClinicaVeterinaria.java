/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import accesoData.*;
import entidades.*;
import java.time.LocalDate;
import java.time.Month;
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
//	 Metodo buscarClientePorDNI	
//	ClienteData clienteData = new ClienteData();
//	Cliente recibido = clienteData.buscarClientePorDNI(124);
//	System.out.println(recibido.toString());

       // MÉTODO GUARDAR MASCOTA
//        MascotaData mascota = new MascotaData();
//        Mascota pichichu = new Mascota("Pichichu", "macho", "perro", "salchicha", "negro", LocalDate.of(2021, 7, 25), 6.5, 7.2, true, 5);
//        mascota.guardarMascota(pichichu);
        //MÉTODO MODIFICAR MASCOTA
//        MascotaData mascota = new MascotaData();
//        Mascota pichichu = new Mascota(8, "Pichicha", "hembra", "perro", "caniche", "negro", LocalDate.of(2021, 7, 25), 6.5, 7.5, true, 5);
//        mascota.modificarMascota(pichichu);
        
        
//        MascotaData mascota = new MascotaData();
//        Mascota pichichu = new Mascota(8, "Pichicha", "hembra", "perro", "caniche", "negro", LocalDate.of(2021, 7, 25), 6.5, 7.5, true, 5);
//        mascota.eliminarMascota(pichichu);
        
//        ClienteData cliente = new ClienteData();
//        Cliente persona = new Cliente();
//        persona.setIdCliente(1);
//        List<Mascota> lista = cliente.listarMascotas(persona);        
//        for (Mascota mascota : lista) {
//	    System.out.println(mascota.toString());

//        MascotaData md = new MascotaData();
//        List<Mascota> lista = md.listarMascotas();
//        for (Mascota mascota : lista){
//            System.out.println(mascota.toString());
//        }
    
        TratamientoData td = new TratamientoData();
//        Tratamiento tratamiento = new Tratamiento(1,1,"Vacunación","Primer esquema de vacunación", 4000.0, true);
//        td.modificarTratamiento(tratamiento);
//        td.guardarTratamiento(tratamiento);
//	   td.eliminarTratamiento(1);
//	   Tratamiento t = td.mostrarTratamiento(8);
//	   System.out.println(t.toString());
          
        List<Tratamiento> lista = td.listarTratamientos();
        for (Tratamiento tratamiento : lista){
            System.out.println(tratamiento.toString());
        }
          
        
    
    }
    
    }


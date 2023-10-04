/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import accesoData.ClienteData;
import entidades.Cliente;

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
	ClienteData persona = new ClienteData();
	Cliente juanPerez = new Cliente("Juan Perez", 12874122, "calle publica", "15-2121415", "Mariela: 15-5684657", true);
	persona.guardarCliente(juanPerez);
	
	
    }
    
}

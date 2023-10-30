/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.*;
import accesoData.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Veronica
 */
public class GCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form GCliente
     */
    public GCliente() {
        initComponents();
        controladorBotones(true, false, false, false);
        controladorDeCampos(true, false, false, false, false, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfDomicilio = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfContactoAlt = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jrbEstado = new javax.swing.JRadioButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(554, 381));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(554, 381));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/busqueda16.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 50, -1));

        jbGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("DNI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 47, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Nombre y Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Domicilio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Contacto Alternativo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Estado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 237, -1, -1));
        jPanel1.add(jlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 180, 34));
        jPanel1.add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 45, 222, -1));

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
        });
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 86, 222, -1));
        jPanel1.add(jtfDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 123, 222, -1));
        jPanel1.add(jtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 161, 222, -1));
        jPanel1.add(jtfContactoAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 199, 222, -1));

        jbModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));
        jPanel1.add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jbLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/clientePerro2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 70, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
    try{   
        int documento = Integer.parseInt(jtfDni.getText());
        Cliente cliente = new Cliente();
        ClienteData cd = new ClienteData();
        cliente = cd.buscarClientePorDNI(documento);
	Integer doc = documento;
	String doc2 = doc.toString();
         Pattern pat = Pattern.compile("^[0-9]{7,8}");
         Matcher mat = pat.matcher(doc2);                                                                           
            if (mat.matches()) {
                JOptionPane.showMessageDialog(null, "éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No es un documento valido");
                jtfDni.setText("");
                limpiarCampos();
            }
//	if (doc2.length() != 8 || doc2.length() != 7) {
//	    JOptionPane.showMessageDialog(null, "No es un documento valido");
//	    limpiarCampos();
//	    controladorBotones(true, false, false, false);
//	    controladorDeCampos(true, false, false, false, false, false);
//	    break;
//	}
	
        if (cliente.getNombre() != null) {            
            jtfNombre.setText(cliente.getNombre());
//            jtfNombre.getText()
            jtfDomicilio.setText(cliente.getDireccion());
            jtfTelefono.setText(cliente.getTelefono());
            jtfContactoAlt.setText(cliente.getContactoAlternativo());
            jrbEstado.setSelected(cliente.isEstado());

            if (cliente.isEstado()) {
                jlEstado.setText("Cliente Activo");
            } else {
                jlEstado.setText("Cliente Inactivo");
            }
            controladorBotones(false, false, true, true);
            

        } else {

            controladorBotones(false, true, false, true);
        }
        controladorDeCampos(false,true , true, true, true, true);
    } catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "El DNI ingresado no es válido.");
    }//GEN-LAST:event_jbBuscarActionPerformed
    }
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
        controladorDeCampos(true, false, false, false, false, false);
        controladorBotones(true, false, false, false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
    
        try{
        int dni= Integer.parseInt(jtfDni.getText());
        String nombre = jtfNombre.getText();
//	String nombre = jtfNombre.getText();
	boolean contieneNumero = false;
//	String[] caracteres = nombre.split("");
//	for (int i = 0; i < caracteres.length; i++) {
        
	    if (checkNumericValues(nombre) || nombre.isEmpty()) {
//		JOptionPane.showMessageDialog(null, "El nombre no puede contener numeros");
		contieneNumero = true;
	    }
//	}
        String domicilio = jtfDomicilio.getText();
        String telefono = jtfTelefono.getText();
        String contAlt = jtfContactoAlt.getText();
        boolean estado = jrbEstado.isSelected();
        Cliente cliente = new Cliente(nombre, dni, domicilio, telefono, contAlt,estado);
        ClienteData cd = new ClienteData();
	if (contieneNumero) {
	    JOptionPane.showMessageDialog(null, "Ingrese un nombre valido");
	}else{
	    cd.guardarCliente(cliente);
	    jbBuscarActionPerformed(evt);
	}
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El DNI no es válido.");
            limpiarCampos();
        }
	    

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int dni = Integer.parseInt(jtfDni.getText());
        String nombre = jtfNombre.getText();
	boolean contieneNumero = false;
	if (checkNumericValues(nombre) || nombre.isEmpty()) {
//	    JOptionPane.showMessageDialog(null, "El nombre no puede contener numeros");
	    contieneNumero = true;
	}
        String domicilio = jtfDomicilio.getText();
        String telefono = jtfTelefono.getText();
        String contAlt = jtfContactoAlt.getText();
        boolean estado = jrbEstado.isSelected();
        ClienteData cd = new ClienteData();
        Cliente cliente = new Cliente(nombre, dni, domicilio, telefono, contAlt, estado);
	if (contieneNumero) {
	    JOptionPane.showMessageDialog(null, "No se guardo el cliente por que contiene numeros");
	}else{
	    cd.modificarCliente(cliente);
	    jbBuscarActionPerformed(evt);
	}
	    
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased
        String s = jtfNombre.getText();  
        checkNumericValues(s);
    }//GEN-LAST:event_jtfNombreKeyReleased
    
    private static boolean checkNumericValues(String cadena){        

      String[] caracteres =  cadena.split("");
      for(int i = 0; i < caracteres.length; i++)
        {
           try{             
                Integer.parseInt(caracteres[i]);             
                JOptionPane.showMessageDialog(null, "Ingrese solo letras.");
		return true;
           }catch (NumberFormatException e){ 
                
           }                         
        }     

        return false; //No existen caracteres numericos

   }
    
    // verificar longitud del dni
    private boolean verificarDni(int dni){
	Integer doc = dni;
	String doc2 = doc.toString();
	if (doc2.length() != 8 || doc2.length() != 7) {
	    JOptionPane.showMessageDialog(null, "No es un documento valido");
//	    limpiarCampos();
	    return false;
//	    controladorBotones(true, false, false, false);
//	    controladorDeCampos(true, false, false, false, false, false);
//	    break;
	}
	return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfContactoAlt;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
    
    public void controladorDeCampos(boolean dni,boolean nombre, boolean domicilio, boolean telefono, boolean contAlt, boolean estado){
       jtfDni.setEnabled(dni);
       jtfNombre.setEnabled(nombre);
       jtfDomicilio.setEnabled(domicilio);
       jtfTelefono.setEnabled(telefono);
       jtfContactoAlt.setEnabled(contAlt);
       jrbEstado.setEnabled(estado);
    }

   public void limpiarCampos(){
       jtfDni.setText("");
       jtfNombre.setText("");
       jtfDomicilio.setText("");
       jtfTelefono.setText("");
       jtfContactoAlt.setText("");
       jrbEstado.setSelected(false);
       jlEstado.setText("");
   }
   
   public void controladorBotones(boolean buscar, boolean guardar, boolean modificar, boolean limpiar){
        jbBuscar.setEnabled(buscar);
        jbGuardar.setEnabled(guardar);
        jbModificar.setEnabled(modificar);
        jbLimpiar.setEnabled(limpiar);
   }
}

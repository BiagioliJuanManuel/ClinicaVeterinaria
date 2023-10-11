/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.*;
import accesoData.*;

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

        setBackground(new java.awt.Color(255, 255, 153));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(554, 381));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

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
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 86, 222, -1));
        jPanel1.add(jtfDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 123, 222, -1));
        jPanel1.add(jtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 161, 222, -1));
        jPanel1.add(jtfContactoAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 199, 222, -1));

        jbModificar.setText("Modificar");
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));
        jPanel1.add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        int documento = Integer.parseInt(jtfDni.getText());
        Cliente cliente = new Cliente();
        ClienteData cd = new ClienteData();
        cliente = cd.buscarClientePorDNI(documento);
        if (cliente.getNombre() != null) {
            jtfNombre.setText(cliente.getNombre());
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

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
        controladorDeCampos(true, false, false, false, false, false);
        controladorBotones(true, false, false, false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
    
        int dni= Integer.parseInt(jtfDni.getText());
        String nombre = jtfNombre.getText();
        String domicilio = jtfDomicilio.getText();
        String telefono = jtfTelefono.getText();
        String contAlt = jtfContactoAlt.getText();
        ////////////////////////////////////////////
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
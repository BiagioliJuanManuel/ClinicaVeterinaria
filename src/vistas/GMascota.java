/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoData.*;
import entidades.*;
import java.sql.Date;
import java.util.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Manuel Biagioli
 */
public class GMascota extends javax.swing.JInternalFrame {

    /**
     * Creates new form GMascota
     */
    public GMascota() {
	initComponents();
        controladorBotones(true, false, false, false);
        controladorDeCampos(true, false, false, false, false, false, false, false, false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtClienteDni = new javax.swing.JTextField();
        jtAlias = new javax.swing.JTextField();
        jtSexo = new javax.swing.JTextField();
        jtEspecie = new javax.swing.JTextField();
        jtRaza = new javax.swing.JTextField();
        jtColor = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jtCodigoMascota = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jdNacimiento = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 153));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(500, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(516, 473));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Mascotas");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Sexo");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Especie");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Raza");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Color");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Nacimiento");

        jlEstado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlEstado.setText("estado");

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Cliente DNI");

        jtClienteDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jtAlias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jtSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jtEspecie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jtRaza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jtColor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setText("Estado");

        jbGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jtCodigoMascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jbBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(244, 244, 244)
                        .addComponent(jtCodigoMascota))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbEstado)
                                .addGap(18, 18, 18)
                                .addComponent(jlEstado))
                            .addComponent(jtRaza)
                            .addComponent(jtEspecie)
                            .addComponent(jtSexo)
                            .addComponent(jtAlias)
                            .addComponent(jtColor)
                            .addComponent(jdNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtClienteDni, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpiar)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCodigoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtClienteDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jrbEstado)
                    .addComponent(jlEstado))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbModificar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbBuscar))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
	jtAlias.setText("");
	jtClienteDni.setText("");
	jtCodigoMascota.setText("");
	jtColor.setText("");
	jtEspecie.setText("");
	jtRaza.setText("");
	jtSexo.setText("");
	jdNacimiento.setDate(java.util.Date.from(Instant.now()));
	jrbEstado.setSelected(false);
	jlEstado.setText("");
        controladorBotones(true, true, true, true);
        controladorDeCampos(true, true, true, true, true, true, true, true, true);
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
	try {
//	    int codigo = Integer.parseInt(jtCodigoMascota.getText());
	    int dni = Integer.parseInt(jtClienteDni.getText());
	    String nombre = jtAlias.getText();
	    String sexo = jtSexo.getText();
	    String especie = jtEspecie.getText();
	    String raza = jtRaza.getText();
	    String color = jtColor.getText();
	    java.util.Date date = jdNacimiento.getDate();
	    LocalDate fechaNacimiento = fromDateToLocalDate(date);
	    boolean estado = jrbEstado.isSelected();
	    MascotaData md = new MascotaData();
	    ClienteData cd = new ClienteData();
	    Cliente cliente = new Cliente();
	    cliente = cd.buscarClientePorDNI(dni);
	    int idcliente = cliente.getIdCliente();
	    Mascota mascota = new Mascota(nombre, sexo, especie, raza, color, fechaNacimiento, estado, idcliente);
	    md.guardarMascota(mascota);
            limpiarCampos();
	    // para hacer buscar una mascota por nombre sexo raza color o fecha de nacimiento
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Ingrese un Codigo y dni valido");
	} catch(NullPointerException ex){
	    JOptionPane.showMessageDialog(null, "Ingrese una fecha de nacimiento");
	}
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
	try{
	int codigo = Integer.parseInt(jtCodigoMascota.getText());
        Mascota mascota = new Mascota();
        MascotaData md = new MascotaData();
        Cliente cliente = new Cliente();
        ClienteData cd = new ClienteData();
        mascota = md.buscarMascota(codigo);
//	    System.out.println(mascota.toString());
        if (mascota.getAlias() != null){
            jtAlias.setText(mascota.getAlias());
            jtSexo.setText(mascota.getSexo());
            jtEspecie.setText(mascota.getEspecie());
            jtRaza.setText(mascota.getRaza());
            jtColor.setText(mascota.getColorPelo());
            jdNacimiento.setDate(Date.valueOf(mascota.getFechaNacimiento()));
            jrbEstado.setSelected(mascota.isEstado());
            if (mascota.isEstado()) {
                jlEstado.setText("Activa");
            } else {
                jlEstado.setText("Inactiva");
            }
            cliente = cd.buscarCliente(mascota.getIdCliente());
            jtClienteDni.setText(cliente.getDocumento()+"");
            controladorBotones(false, false, true, true);
            controladorDeCampos(false, false, true, true, true, true, true, true, true);
        } else {
            controladorBotones(false, true, false, true);
            controladorDeCampos(false, true, true, true, true, true, true, true, true);
	    jtCodigoMascota.setText("");
        }
        
	}catch(NumberFormatException ex){
	    JOptionPane.showMessageDialog(null, "Solo debe ingresar numeros en el campo codigo");
	}catch(NullPointerException ex){
	    JOptionPane.showMessageDialog(null, "nullpointer exception");
	}
	    
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
	try {
	    int codigo = Integer.parseInt(jtCodigoMascota.getText());
	    int dni = Integer.parseInt(jtClienteDni.getText());
	    String nombre = jtAlias.getText();
	    String sexo = jtSexo.getText();
	    String especie = jtEspecie.getText();
	    String raza = jtRaza.getText();
	    String color = jtColor.getText();
	    java.util.Date date = jdNacimiento.getDate();
	    LocalDate fechaNacimiento = fromDateToLocalDate(date);
	    boolean estado = jrbEstado.isSelected();
	    MascotaData md = new MascotaData();
	    ClienteData cd = new ClienteData();
	    Cliente cliente = new Cliente();
	    cliente = cd.buscarClientePorDNI(dni);
	    int idcliente = cliente.getIdCliente();
	    Mascota mascota = new Mascota(codigo, nombre, sexo, especie, raza, color, fechaNacimiento, estado, idcliente);
	    if (jtCodigoMascota.getText().isEmpty() || nombre.isEmpty() || sexo.isEmpty() || especie.isEmpty() || raza.isEmpty() || color.isEmpty()) {
		JOptionPane.showMessageDialog(null, "Complete todos los campos e ingrese un codigo valido");
	    }else{
		md.modificarMascota(mascota);
		jbBuscarActionPerformed(evt);
	    }
		
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Ingrese un Codigo y dni valido");
	}
    }//GEN-LAST:event_jbModificarActionPerformed

public LocalDate fromDateToLocalDate(java.util.Date date) {
    return date.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private com.toedter.calendar.JDateChooser jdNacimiento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAlias;
    private javax.swing.JTextField jtClienteDni;
    private javax.swing.JTextField jtCodigoMascota;
    private javax.swing.JTextField jtColor;
    private javax.swing.JTextField jtEspecie;
    private javax.swing.JTextField jtRaza;
    private javax.swing.JTextField jtSexo;
    // End of variables declaration//GEN-END:variables
    
    public void controladorDeCampos(boolean codigo, boolean dni, boolean alias, boolean sexo, boolean color, boolean especie, boolean raza, boolean nacimiento, boolean estado){
           jtCodigoMascota.setEnabled(codigo);
           jtClienteDni.setEnabled(dni);
           jtAlias.setEnabled(alias);
           jtSexo.setEnabled(sexo);
           jtColor.setEnabled(color);
           jtEspecie.setEnabled(especie);
           jtRaza.setEnabled(raza);
           jrbEstado.setEnabled(estado);
           jdNacimiento.setEnabled(nacimiento);
        }

   public void limpiarCampos(){
       jtCodigoMascota.setText("");
       jtClienteDni.setText("");
       jtAlias.setText("");
       jtSexo.setText("");
       jtColor.setText("");
       jtEspecie.setText("");
       jtRaza.setText("");
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

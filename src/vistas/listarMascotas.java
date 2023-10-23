/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoData.*;
import entidades.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Manuel Biagioli
 */
public class listarMascotas extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form GMascota
     */
    public listarMascotas() {
	initComponents();
	controladorBotones(true, false, false, false);
	controladorDeCampos(false, false, false, false, false, false, false, false, false);
	armarCabecera();
	cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jbLimpiar = new javax.swing.JButton();
        jdNacimiento = new com.toedter.calendar.JDateChooser();
        jbModificar = new javax.swing.JButton();
        jtCodigoMostrar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMascotas = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jtBusqueda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jtCodigoMascota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1124, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(516, 473));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Mascotas");

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

        jbLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jtCodigoMostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbModificar)
                                .addGap(32, 32, 32)
                                .addComponent(jbLimpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel10))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtRaza)
                                    .addComponent(jtEspecie)
                                    .addComponent(jtSexo)
                                    .addComponent(jtAlias)
                                    .addComponent(jtColor)
                                    .addComponent(jdNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbEstado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtClienteDni)
                                    .addComponent(jtCodigoMostrar)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtCodigoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtClienteDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jrbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbModificar))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 523));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jTablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "ID Cliente", "Nombre", "Sexo", "Especie", "Raza", "Color", "Nacimiento", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaMascotas);

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/busqueda16.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtBusqueda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Busqueda por nombre");

        jbNuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEditar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jtCodigoMascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Busqueda por codigo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jbEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNuevo)
                .addGap(212, 212, 212))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtCodigoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtCodigoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEditar))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 0, 720, 523));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
	// TODO add your handling code here:
	borrarFilas();
	jtAlias.setText("");
	jtClienteDni.setText("");
	jtCodigoMostrar.setText("");
	jtColor.setText("");
	jtEspecie.setText("");
	jtRaza.setText("");
	jtSexo.setText("");
	jdNacimiento.setDate(java.util.Date.from(Instant.now()));
	jrbEstado.setSelected(false);
	jlEstado.setText("");
	controladorBotones(true, false, false, false);
	controladorDeCampos(false, false, false, false, false, false, false, false, false);
	cargarTabla();
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
	    borrarFilas();
	    cargarTabla();
	    // para hacer buscar una mascota por nombre sexo raza color o fecha de nacimiento
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Ingrese un Codigo y dni valido");
	} catch (NullPointerException ex) {
	    JOptionPane.showMessageDialog(null, "Ingrese una fecha de nacimiento");
	}
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
	// TODO add your handling code here:
	try {
	    int codigo = Integer.parseInt(jtCodigoMostrar.getText());
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
	    if (jtCodigoMostrar.getText().isEmpty() || nombre.isEmpty() || sexo.isEmpty() || especie.isEmpty() || raza.isEmpty() || color.isEmpty()) {
		JOptionPane.showMessageDialog(null, "Complete todos los campos e ingrese un codigo valido");
	    } else {
		md.modificarMascota(mascota);
	    }
	    limpiarCampos();
	    borrarFilas();
	    cargarTabla();
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Ingrese un Codigo y dni valido");
	}
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
	// TODO add your handling code here:  
	try {
	    borrarFilas();
	    Mascota mascota = new Mascota();
	    MascotaData md = new MascotaData();
	    Cliente cliente = new Cliente();
	    ClienteData cd = new ClienteData();
	    List<Mascota> listaMascotas = new ArrayList<>();
	    if (jtCodigoMascota.getText().isEmpty() && !jtBusqueda.getText().isEmpty()) {
		String nombre = jtBusqueda.getText();
		listaMascotas = md.buscarMascota(nombre);
		for (Mascota ma : listaMascotas) {
		    modelo.addRow(new Object[]{ma.getIdMascota(), ma.getIdCliente(), ma.getAlias(), ma.getSexo(), ma.getEspecie(), ma.getRaza(), ma.getColorPelo(), ma.getFechaNacimiento(), ma.isEstado()});
		}
	    } else {
		int codigo = Integer.parseInt(jtCodigoMascota.getText());
		mascota = md.buscarMascota(codigo);
		modelo.addRow(new Object[]{mascota.getIdMascota(), mascota.getIdCliente(), mascota.getAlias(), mascota.getSexo(), mascota.getEspecie(), mascota.getRaza(), mascota.getColorPelo(), mascota.getFechaNacimiento(), mascota.isEstado()});

		if (mascota.getAlias() != null) {
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
		    jtClienteDni.setText(cliente.getDocumento() + "");
		    controladorBotones(false, false, true, true);
		    controladorDeCampos(false, false, true, true, true, true, true, true, true);
		} else {
		    controladorBotones(false, true, false, true);
		    controladorDeCampos(false, true, true, true, true, true, true, true, true);
		    jtCodigoMascota.setText("");
		}
	    }

//	    System.out.println(mascota.toString());
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Solo debe ingresar numeros en el campo codigo o un nombre en la busqueda por nombre");
	    cargarTabla();
	} catch (NullPointerException ex) {
	    JOptionPane.showMessageDialog(null, "nullpointer exception");
	}

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
         controladorBotones(true, true, false, true);
	 controladorDeCampos(false, true, true, true, true, true, true, true, true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
	// TODO add your handling code here:
//	jtCodigoMostrar.setText(modelo.getValueAt(0,0).toString());  
	jtCodigoMostrar.setText(modelo.getValueAt(jTablaMascotas.getSelectedRow(), 0).toString());  
	ClienteData cd = new ClienteData();
        String idClienteString = modelo.getValueAt(jTablaMascotas.getSelectedRow(), 1).toString();
        int idCliente = Integer.parseInt(idClienteString);
        Cliente cliente = cd.buscarCliente(idCliente);
        jtClienteDni.setText(String.valueOf(cliente.getDocumento()));
	jtAlias.setText(modelo.getValueAt(jTablaMascotas.getSelectedRow(), 2).toString());  
	jtSexo.setText(modelo.getValueAt(jTablaMascotas.getSelectedRow(), 3).toString());  
	jtEspecie.setText(modelo.getValueAt(jTablaMascotas.getSelectedRow(), 4).toString());  
	jtRaza.setText(modelo.getValueAt(jTablaMascotas.getSelectedRow(), 5).toString());  
	jtColor.setText(modelo.getValueAt(jTablaMascotas.getSelectedRow(), 6).toString());           
        MascotaData md = new MascotaData();
        Mascota mascota = md.buscarMascota(Integer.parseInt(jtCodigoMostrar.getText()));        
        jdNacimiento.setDate(Date.valueOf(mascota.getFechaNacimiento()));
        jrbEstado.setSelected((boolean) modelo.getValueAt(jTablaMascotas.getSelectedRow(),8));
         if (mascota.isEstado()) {
                jlEstado.setText("Activa");
            } else {
                jlEstado.setText("Inactiva");
            }
        
        
//        int index = jTablaMascotas.getSelectedRow();
//        
//        String fecha = String.valueOf()
//        System.out.println(fecha);
        

//        try {
//            java.util.Date fechaDate = (java.util.Date) new SimpleDateFormat("yyyy-MM-dd").parse((String.)modelo.getValueAt(index,7));
//            jdNacimiento.setDate(fechaDate);
////                    
////                    
////                    
////                    // PARA HACER MAÑANA
////                    
//            } catch (ParseException ex) {
//                Logger.getLogger(listarMascotas.class.getName()).log(Level.SEVERE, null, ex);
//        }
        


	// PARA HACER MAÑANA

        controladorDeCampos(false, false, true, true, true, true, true, false, true);

        controladorBotones(true, false, true, true);
	
    }//GEN-LAST:event_jbEditarActionPerformed

    public LocalDate fromDateToLocalDate(java.util.Date date) {
	return date.toInstant()
		.atZone(ZoneId.systemDefault())
		.toLocalDate();
    }

    private void armarCabecera() {
	ArrayList<Object> titulos = new ArrayList();
	titulos.add("Codigo");
	titulos.add("ID Cliente");
	titulos.add("Nombre");
	titulos.add("Sexo");
	titulos.add("Especie");
	titulos.add("Raza");
	titulos.add("Color");
	titulos.add("Fecha de Nacimiento");
	titulos.add("Estado");

	for (Object titulo : titulos) {
	    modelo.addColumn(titulo);
	}
	jTablaMascotas.setModel(modelo);
    }

    public void cargarTabla() {
	MascotaData md = new MascotaData();
//    ClienteData cd = new ClienteData();
//    Mascota mascota = new Mascota();
//	   Cliente cliente = new Cliente();
//	   int idcliente = cliente.getIdCliente();
//	   cliente = cd.buscarCliente();
//    jTablaMascotas.setModel(modelo);

	List<Mascota> lista = md.listarMascotas();
//    System.out.println(lista);
	for (Mascota ma : lista) {
	    modelo.addRow(new Object[]{ma.getIdMascota(), ma.getIdCliente(), ma.getAlias(), ma.getSexo(), ma.getEspecie(), ma.getRaza(), ma.getColorPelo(), ma.getFechaNacimiento(), ma.isEstado()});
	}

    }

    private void borrarFilas() {
	int filas = modelo.getRowCount() - 1;
	for (int i = filas; i >= 0; i--) {
	    modelo.removeRow(i);
	}

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaMascotas;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private com.toedter.calendar.JDateChooser jdNacimiento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAlias;
    private javax.swing.JTextField jtBusqueda;
    private javax.swing.JTextField jtClienteDni;
    private javax.swing.JTextField jtCodigoMascota;
    private javax.swing.JTextField jtCodigoMostrar;
    private javax.swing.JTextField jtColor;
    private javax.swing.JTextField jtEspecie;
    private javax.swing.JTextField jtRaza;
    private javax.swing.JTextField jtSexo;
    // End of variables declaration//GEN-END:variables

    public void controladorDeCampos(boolean codigo, boolean dni, boolean alias, boolean sexo, boolean color, boolean especie, boolean raza, boolean nacimiento, boolean estado) {
	jtCodigoMostrar.setEnabled(codigo);
	jtClienteDni.setEnabled(dni);
	jtAlias.setEnabled(alias);
	jtSexo.setEnabled(sexo);
	jtColor.setEnabled(color);
	jtEspecie.setEnabled(especie);
	jtRaza.setEnabled(raza);
	jrbEstado.setEnabled(estado);
	jdNacimiento.setEnabled(nacimiento);
    }

    public void limpiarCampos() {
	jtCodigoMostrar.setText("");
	jtClienteDni.setText("");
	jtAlias.setText("");
	jtSexo.setText("");
	jtColor.setText("");
	jtEspecie.setText("");
	jtRaza.setText("");
	jrbEstado.setSelected(false);
	jlEstado.setText("");
    }

    public void controladorBotones(boolean buscar, boolean guardar, boolean modificar, boolean limpiar) {
	jbBuscar.setEnabled(buscar);
	jbGuardar.setEnabled(guardar);
	jbModificar.setEnabled(modificar);
	jbLimpiar.setEnabled(limpiar);
    }

}

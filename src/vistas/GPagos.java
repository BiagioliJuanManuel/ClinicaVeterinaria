
package vistas;

import accesoData.*;
import entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GPagos extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
   
    public GPagos() {
        initComponents();
        armarCabecera();
        borrarFilas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtCodigoMascota = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlNombrePaciente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlNombrePropietario = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaPagos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jcbModoDePago = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jlSubtotal = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Código de paciente:");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/busqueda16.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("DNI del propietario/a:");

        jlNombrePaciente.setBackground(new java.awt.Color(255, 255, 255));
        jlNombrePaciente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Nombre:");

        jlNombrePropietario.setBackground(new java.awt.Color(255, 255, 255));
        jlNombrePropietario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jlDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(jtCodigoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtCodigoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombrePropietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jlDni, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("$ PAGOS $");

        jtTablaPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Servicio", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTablaPagos.getTableHeader().setReorderingAllowed(false);
        jtTablaPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaPagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaPagos);
        if (jtTablaPagos.getColumnModel().getColumnCount() > 0) {
            jtTablaPagos.getColumnModel().getColumn(0).setResizable(false);
            jtTablaPagos.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Modo de pago:");

        jcbModoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado", "Debito", "Tarjeta", "Transferencia" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Total a pagar:");

        jlSubtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/controlar.png"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cruz.png"))); // NOI18N
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gato.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perro (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(36, 36, 36)
                        .addComponent(jcbModoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(167, 167, 167)
                .addComponent(jLabel8)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jcbModoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jlSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        borrarFilas();
	VisitaData vd = new VisitaData();
        Visita visita = new Visita();
        int idMascota = Integer.parseInt(jtCodigoMascota.getText());
        Mascota mascota = new Mascota();
        MascotaData md = new MascotaData();
        mascota = md.buscarMascota(idMascota);	    
	ClienteData cd = new ClienteData();
	Cliente cliente = new Cliente();
	cliente = cd.buscarCliente(mascota.getIdCliente());	    
	jlDni.setText(String.valueOf(cliente.getDocumento()));     
        jlNombrePaciente.setText(mascota.getAlias());
        jlNombrePropietario.setText(cliente.getNombre());        
//        vd.listarVisitasPorIDActivos(idMascota);
//        Tratamiento tratamiento = visita.getTratamiento();       
        
        cargarTablaPorMascota(idMascota);
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jlNombrePaciente.setText("");
        jlNombrePropietario.setText("");
        jtCodigoMascota.setText("");
        jlDni.setText("");
	jlSubtotal.setText("");
        borrarFilas();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try{
            VisitaData vd = new VisitaData();
            Visita visita = new Visita();
	    TratamientoData td = new TratamientoData();
	    Tratamiento tratamiento = new Tratamiento();
            int idMascota = Integer.parseInt(jtCodigoMascota.getText());
            List<Visita> lista = vd.listarVisitasPorIDActivos(idMascota);
	    int fila = jtTablaPagos.getSelectedRow();
//	    System.out.println(fila);
	    String nombretratamiento = "";
	    int tra = 0;
	    if (fila < 0) {
		JOptionPane.showMessageDialog(null, "Seleccione un tratamiento a abonar");
	    }else{
		nombretratamiento = (String) modelo.getValueAt(fila, 1);
		tra = td.buscarTratamientoPorNombre(nombretratamiento);
		modelo.removeRow(fila);
	    }
//	    System.out.println(nombretratamiento);
	    JOptionPane.showMessageDialog(null, "Pagado con exito");
//            vd.pagarVisita(visita);            

                
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo mascota");
        }catch(ArrayIndexOutOfBoundsException ex){
	    JOptionPane.showMessageDialog(null, "Array"+ex);
	}
	
         catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Algo salió mal."+ex);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtTablaPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaPagosMouseClicked
        // TODO add your handling code here:
	 int fila = jtTablaPagos.getSelectedRow();
	    if (fila > -1) {
		String totalPagar = modelo.getValueAt(fila, 2).toString();
		jlSubtotal.setText(totalPagar);
	    }
    }//GEN-LAST:event_jtTablaPagosMouseClicked
    
    private void armarCabecera() {
	ArrayList<Object> titulos = new ArrayList();
	titulos.add("idVisita");
	titulos.add("Servicio");
	titulos.add("Costo");
	

	for (Object titulo : titulos) {
	    modelo.addColumn(titulo);
	}
	jtTablaPagos.setModel(modelo);
    }
    
    public void cargarTabla() {
	TratamientoData td = new TratamientoData();	
	List<Tratamiento> lista = td.listarTratamientos();
	for (Tratamiento tra : lista) {
	    if(tra.isEstado()){
            modelo.addRow(new Object[]{tra.getTipo(), tra.getImporte()});
            }
        }
    }
    public void cargarTablaPorMascota(int idMascota) {
	VisitaData vd = new VisitaData();
	TratamientoData td = new TratamientoData();
	List<Visita> lista = vd.listarVisitasPorIDActivos(idMascota);
	for (Visita visita : lista) {
	    if(visita.isEstado()){
		Tratamiento tratamiento = new Tratamiento();
		tratamiento = visita.getTratamiento();
		int idTratamiento = tratamiento.getIdTratamiento();
		tratamiento = td.buscarTratamiento(idTratamiento);
		modelo.addRow(new Object[]{visita.getIdVisita(), tratamiento.getTipo(), tratamiento.getImporte()});
            }
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcbModoDePago;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlNombrePaciente;
    private javax.swing.JLabel jlNombrePropietario;
    private javax.swing.JLabel jlSubtotal;
    private javax.swing.JTextField jtCodigoMascota;
    private javax.swing.JTable jtTablaPagos;
    // End of variables declaration//GEN-END:variables
}

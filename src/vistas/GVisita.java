/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

//import java.sql.Date;
import accesoData.ClienteData;
import accesoData.MascotaData;
import accesoData.TratamientoData;
import accesoData.VisitaData;
import entidades.Cliente;
import entidades.Mascota;
import entidades.Tratamiento;
import entidades.Visita;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Win10
 */
public class GVisita extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form GVisita
     */
    public GVisita() {
	initComponents();
	cargarComboBox();
	armarCabecera();
	controladorBotones(true, false, true);

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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtPesoActual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbTratamiento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaVisita = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtObservaciones = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdFechaVisita = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtIdMascota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jlDni = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Observaciones");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Peso actual");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tratamiento");

        jtTablaVisita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha ", "Tratamiento", "Observaciones", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTablaVisita.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTablaVisita);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Visitas anteriores");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jtObservaciones.setColumns(20);
        jtObservaciones.setRows(5);
        jScrollPane3.setViewportView(jtObservaciones);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Peso promedio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addGap(55, 55, 55)
                        .addComponent(jbLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(256, 256, 256)
                        .addComponent(jLabel9)
                        .addGap(175, 175, 175))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jcbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbLimpiar))
                .addGap(38, 38, 38))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registro de visita");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/latido-del-corazon64.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Código de paciente");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DNI del propietario/a");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/busqueda16.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jlDni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlDni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlDni.setMinimumSize(new java.awt.Dimension(12, 12));
        jlDni.setPreferredSize(new java.awt.Dimension(12, 12));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jdFechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jdFechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addComponent(jlDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
	// TODO add your handling code here:
	try {
	    borrarFilas();
	    java.util.Date fecha = jdFechaVisita.getDate();
	    LocalDate fechaVisita = fromDateToLocalDate(fecha);
	    int idMascota = Integer.parseInt(jtIdMascota.getText());
	    int dniPropietario = Integer.parseInt(jlDni.getText());
	    Mascota mascota = new Mascota();
	    MascotaData md = new MascotaData();
	    mascota = md.buscarMascota(idMascota);
	    Cliente cliente = new Cliente();
	    ClienteData cd = new ClienteData();
	    cliente = cd.buscarClientePorDNI(dniPropietario);
	    System.out.println(cliente);
	    boolean clienteValido = true;
	    if (cliente.getNombre() == null) {
		clienteValido = false;
	    }
	    String descripcion = jtObservaciones.getText();
	    Double pesoActual = 0d;
	    Double pesoPromedio = 0d;
	    if (jtPesoActual.getText().isEmpty()) {
		JOptionPane.showMessageDialog(null, "Ingrese el peso actual de la mascota");
	    }else{
		pesoActual = Double.parseDouble(jtPesoActual.getText());
	    }
	    if (jTextField1.getText().isEmpty()) {
		JOptionPane.showMessageDialog(null, "Ingrese el peso promedio de la mascota");
	    }else{
		pesoPromedio = Double.parseDouble(jTextField1.getText());
	    }
		
		
		
//            Double pesoPromedio = Double.parseDouble(jlPesoPromedio.getText());

	    Tratamiento tratamiento = new Tratamiento();
	    tratamiento.setTipo((String) jcbTratamiento.getSelectedItem());
	    String nombreTratamiento = (String) jcbTratamiento.getSelectedItem();
	    TratamientoData td = new TratamientoData();
	    int idTratamiento = td.buscarTratamientoPorNombre(nombreTratamiento);
	    tratamiento.setIdTratamiento(idTratamiento);
	    VisitaData vd = new VisitaData();
	    Visita visita = new Visita();
	    boolean camposCompletos = true;
	    if (jtPesoActual.getText().isEmpty() || jTextField1.getText().isEmpty()) {
		camposCompletos = false;
	    }
//	    Visita visita = new Visita(mascota, tratamiento, descripcion, fechaVisita, pesoActual, pesoPromedio);
		
	    
	    if (camposCompletos && clienteValido) {
		visita.setPesoActual(pesoActual);
		visita.setPesoPromedio(pesoPromedio);
		visita.setMascota(mascota);
		visita.setTratamiento(tratamiento);
		visita.setDescripcion(descripcion);
		visita.setFechaVisita(fechaVisita);
		vd.guardarVisita(visita);
	    }
		
	    cargarTabla();
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
	} catch (NullPointerException ex) {
	    JOptionPane.showMessageDialog(null, "Ingrese una fecha valida "+ex.getMessage());
	}

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
	jtIdMascota.setText("");
	jlDni.setText("");
	jtObservaciones.setText("");
	jtPesoActual.setText("");
	jTextField1.setText("");
        jdFechaVisita.setDate(null);
	borrarFilas();
	controladorBotones(true, false, true);

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
	try {
	    borrarFilas();
	    int idMascota = Integer.parseInt(jtIdMascota.getText());
	    MascotaData md = new MascotaData();
            Mascota mascota = new Mascota();
//            mascota.setIdMascota(idMascota);
	    mascota = md.buscarMascota(idMascota);
	    
	    ClienteData cd = new ClienteData();
	    Cliente cliente = new Cliente();
	    cliente = cd.buscarCliente(mascota.getIdCliente());
	    
	    jlDni.setText(String.valueOf(cliente.getDocumento()));
	    
//            Visita visita = new Visita();
	    VisitaData vd = new VisitaData();
//            visita.setMascota(mascota); 
	    vd.listarVisitasPorID(idMascota);
	    cargarTabla();
	    controladorBotones(true, true, true);
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Ingrese un codigo de mascota valido");
	}
    }//GEN-LAST:event_jbBuscarActionPerformed

    public LocalDate fromDateToLocalDate(java.util.Date date) {
	return date.toInstant()
		.atZone(ZoneId.systemDefault())
		.toLocalDate();
    }

    //PARA COMPLETAR MAÑANA!!!!          
    public void cargarComboBox() {
//	    JComboBox<Tratamiento> combito = new JComboBox<Tratamiento>();
	TratamientoData td = new TratamientoData();
	List<Tratamiento> listaTratamientos = td.listarTratamientos();
	for (Tratamiento tratamiento : listaTratamientos) {
	    jcbTratamiento.addItem(tratamiento.getTipo());  // <<<<-----------
	}

//	    ComboBox<String> combito new = ComboBox<String>();
//DefaultComboBoxModel modelito = new DefaultComboBoxModel();
//combito.setModel(modelito);
    }
    
    public void controladorBotones(boolean buscar, boolean guardar, boolean limpiar) {
	jbBuscar.setEnabled(buscar);
	jbGuardar.setEnabled(guardar);
	jbLimpiar.setEnabled(limpiar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcbTratamiento;
    private com.toedter.calendar.JDateChooser jdFechaVisita;
    private javax.swing.JLabel jlDni;
    private javax.swing.JTextField jtIdMascota;
    private javax.swing.JTextArea jtObservaciones;
    private javax.swing.JTextField jtPesoActual;
    private javax.swing.JTable jtTablaVisita;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
	ArrayList<Object> titulos = new ArrayList();
	titulos.add("Fecha");
	titulos.add("Tratamiento");
	titulos.add("Observaciones");
	titulos.add("Peso");

	for (Object titulo : titulos) {
	    modelo.addColumn(titulo);
	}
	jtTablaVisita.setModel(modelo);
    }

    public void cargarTabla() {
	VisitaData vd = new VisitaData();
	int idMascota = Integer.parseInt(jtIdMascota.getText());
	List<Visita> lista = vd.listarVisitasPorID(idMascota);
	for (Visita vi : lista) {
	    modelo.addRow(new Object[]{vi.getFechaVisita(), vi.getTratamiento().getTipo(), vi.getDescripcion(), vi.getPesoActual()});
	}
    }

    private void borrarFilas() {
	int filas = modelo.getRowCount() - 1;
	for (int i = filas; i >= 0; i--) {
	    modelo.removeRow(i);
	}

    }

}

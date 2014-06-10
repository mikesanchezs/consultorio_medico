/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguelangelo
 */
public class AgregarCita extends javax.swing.JInternalFrame {
String id;    
    Connection conecta;

    /**
     * Creates new form AgregarCita
     */
    public AgregarCita() {
        initComponents();
        IniciaBD();
        llenaTablaCitas();
        LlenaPacientes();
        LlenaDoctores();
        txtID.setVisible(false);
    }

    public void IniciaBD(){
            try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conecta = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/base_consultorio","root","");
            
            }catch (Exception ex){
            ex.printStackTrace();
            }
       }

    public void llenaTablaCitas() {
    try{
        DefaultTableModel model = new DefaultTableModel();
        TablaCitas.setModel(model);
        PreparedStatement consulta = conecta.prepareStatement(""
                + "SELECT * FROM citas");
        ResultSet rs = consulta.executeQuery();
        ResultSetMetaData rsMd = rs.getMetaData();
        int numeroColumnas = rsMd.getColumnCount();
        for (int i=1; i<= numeroColumnas; i++){
            model.addColumn(rsMd.getColumnLabel(i));
        }
    while (rs.next()){
        Object[] fila = new Object[numeroColumnas];
        for (int j =1; j<= numeroColumnas; j++){
            fila[j-1]= rs.getObject(j);
        }
        model.addRow(fila);
    }
    
    
}catch(Exception e){
        e.printStackTrace();
    }
}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtPaciente_C = new javax.swing.JTextField();
        txtFecha_C = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarios_C = new javax.swing.JTextArea();
        btnSeleccionaPaciente = new javax.swing.JButton();
        txtDoctor_C = new javax.swing.JTextField();
        txtEstado_C = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        TabTablas = new javax.swing.JTabbedPane();
        TabCitas = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCitas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtBusquedaCC = new javax.swing.JTextField();
        TabPacientes = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaPacientes = new javax.swing.JTable();
        txtBusquedaPC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TabDoctores = new javax.swing.JLayeredPane();
        txtBusquedaDC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaDoctores = new javax.swing.JTable();
        btnSeleccionaDoctor = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Paciente:");

        jLabel2.setText("Fecha de Cita:");

        jLabel3.setText("Comentarios");

        jLabel4.setText("Estado de Cita:");

        jLabel5.setText("Doctor:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtComentarios_C.setColumns(20);
        txtComentarios_C.setRows(5);
        jScrollPane1.setViewportView(txtComentarios_C);

        btnSeleccionaPaciente.setText("Seleccionar");
        btnSeleccionaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionaPacienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Control de Citas");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        TabTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabTablasMouseClicked(evt);
            }
        });

        TablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCitas);

        jScrollPane2.setBounds(10, 50, 600, 110);
        TabCitas.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Buscar:");
        jLabel7.setBounds(20, 10, 50, 20);
        TabCitas.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtBusquedaCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaCCKeyReleased(evt);
            }
        });
        txtBusquedaCC.setBounds(70, 10, 299, 30);
        TabCitas.add(txtBusquedaCC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TabTablas.addTab("Citas", TabCitas);

        TablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaPacientes);

        jScrollPane3.setBounds(10, 50, 600, 110);
        TabPacientes.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtBusquedaPC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaPCKeyReleased(evt);
            }
        });
        txtBusquedaPC.setBounds(70, 10, 299, 30);
        TabPacientes.add(txtBusquedaPC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Buscar:");
        jLabel8.setBounds(20, 10, 50, 20);
        TabPacientes.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TabTablas.addTab("Pacientes", TabPacientes);

        txtBusquedaDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaDCKeyReleased(evt);
            }
        });
        txtBusquedaDC.setBounds(70, 10, 300, 30);
        TabDoctores.add(txtBusquedaDC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Buscar:");
        jLabel9.setBounds(20, 10, 50, 20);
        TabDoctores.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TablaDoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(TablaDoctores);

        jScrollPane5.setBounds(10, 50, 600, 110);
        TabDoctores.add(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TabTablas.addTab("Doctores", TabDoctores);

        btnSeleccionaDoctor.setText("Seleccionar");
        btnSeleccionaDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionaDoctorActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(TabTablas)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(btnModificar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnEliminar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnGuardar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnLimpiar)
                                .add(4, 4, 4)
                                .add(btnCancelar))))
                    .add(layout.createSequentialGroup()
                        .add(222, 222, 222)
                        .add(jLabel6)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(txtEstado_C, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jLabel5)
                                .add(jLabel2))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1))
                        .add(14, 14, 14)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtPaciente_C)
                                    .add(txtDoctor_C))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(btnSeleccionaPaciente)
                                    .add(btnSeleccionaDoctor)))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(txtFecha_C, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jLabel3))
                                    .add(layout.createSequentialGroup()
                                        .add(19, 19, 19)
                                        .add(txtID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .add(27, 110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtPaciente_C, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(btnSeleccionaPaciente))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(txtDoctor_C, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnSeleccionaDoctor))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(txtFecha_C, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(txtEstado_C, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(txtID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(TabTablas, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnCancelar)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(btnGuardar)
                        .add(btnEliminar)
                        .add(btnModificar)
                        .add(btnLimpiar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String Paciente_C = txtPaciente_C.getText();
        String Fecha_C = txtFecha_C.getText();
        String Comentarios_C = txtComentarios_C.getText();
        String Estado_C = txtEstado_C.getText();
        String Doctor_C = txtDoctor_C.getText();
        
        if (Paciente_C.length() == 0 || Fecha_C.length() == 0 ||
           Comentarios_C.length() == 0 || Estado_C.length() == 0 ||
           Doctor_C.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Es neceario llenar todos los campos para registrar la cita.");
            return;
        }
        
       try{ 
           PreparedStatement registra_cita = conecta.prepareStatement(""
                    + "INSERT INTO citas(paciente,fecha_cita,comentarios"
                   + ",estado_cita,doctor_cita) VALUES (?,?,?,?,?)");                  
           registra_cita.setString(1, Paciente_C);
           registra_cita.setString(2, Fecha_C);
           registra_cita.setString(3, Comentarios_C);
           registra_cita.setString(4, Estado_C);
           registra_cita.setString(5, Doctor_C);
           
           registra_cita.executeUpdate();
           
           
           VaciaCampos();
           llenaTablaCitas();
           
        }catch(Exception e){
            e.printStackTrace();       
            }
        {
           JOptionPane.showMessageDialog(null, "La cita fue registrada con exito.");
           return;
           }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        VaciaCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBusquedaCCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaCCKeyReleased
                    try{            
           DefaultTableModel model = new DefaultTableModel();
           TablaCitas.setModel(model);
               
            PreparedStatement consulta = conecta.prepareStatement(""
                    + "SELECT * FROM citas WHERE paciente LIKE ?");                            
            consulta.setString( 1, "%"+txtBusquedaCC.getText()+"%");
           
            /*
            PreparedStatement consulta = conecta.prepareStatement(""
                    + "SELECT * FROM pacientes WHERE nombre "
                    + "MATCH(nombre,apellido_paterno,apellido_materno) AGAINST (?)");                              
            consulta.setString( 1, txtBusquedaCP.getText());
           */
            ResultSet rs = consulta.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int numeroColumnas = rsMd.getColumnCount();            
            for(int i = 1; i <= numeroColumnas; i++){
                model.addColumn(rsMd.getColumnLabel(i));
            }
            
            while(rs.next()){
                Object[] fila = new Object[numeroColumnas];
                for(int j=1; j <= numeroColumnas; j++){
                    fila[j-1] = rs.getObject(j);
                }                
                
                model.addRow(fila);
            }

        }catch(Exception e){
            e.printStackTrace();
                    
        }
    }//GEN-LAST:event_txtBusquedaCCKeyReleased

    private void btnSeleccionaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionaPacienteActionPerformed
        // TODO add your handling code here:
        String Nombre_C = (String) TablaPacientes.getValueAt( TablaPacientes.getSelectedRow(), 1);
        String ApellidoP_C = (String) TablaPacientes.getValueAt( TablaPacientes.getSelectedRow(), 2);
        String ApellidoM_C = (String) TablaPacientes.getValueAt( TablaPacientes.getSelectedRow(), 3);
        

        txtPaciente_C.setText(Nombre_C + " " + ApellidoP_C +  " " + ApellidoM_C);
        
    }//GEN-LAST:event_btnSeleccionaPacienteActionPerformed

    private void TabTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabTablasMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TabTablasMouseClicked

    private void TablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCitasMouseClicked
        // TODO add your handling code here:
        
        String Paciente_C = (String) TablaCitas.getValueAt( TablaCitas.getSelectedRow(), 1);
        String Fecha_C = (String) TablaCitas.getValueAt( TablaCitas.getSelectedRow(), 2);
        String Comentarios_C = (String) TablaCitas.getValueAt( TablaCitas.getSelectedRow(), 3);
        String Estado_C = (String) TablaCitas.getValueAt( TablaCitas.getSelectedRow(), 4);
        String Doctor_C = (String) TablaCitas.getValueAt( TablaCitas.getSelectedRow(), 5);
        int ID_C=(Integer) TablaCitas.getValueAt( TablaCitas.getSelectedRow(), 0);

        txtID.setText(Integer.toString(ID_C));
        txtPaciente_C.setText(Paciente_C);
        txtFecha_C.setText(Fecha_C);
        txtComentarios_C.setText(Comentarios_C);
        txtEstado_C.setText(Estado_C);
        txtDoctor_C.setText(Doctor_C);
        
    }//GEN-LAST:event_TablaCitasMouseClicked

    private void btnSeleccionaDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionaDoctorActionPerformed
        // TODO add your handling code here:
        String Nombre_C = (String) TablaDoctores.getValueAt( TablaDoctores.getSelectedRow(), 1);
        String ApellidoP_C = (String) TablaDoctores.getValueAt( TablaDoctores.getSelectedRow(), 2);
        String ApellidoM_C = (String) TablaDoctores.getValueAt( TablaDoctores.getSelectedRow(), 3);
        

        txtDoctor_C.setText(Nombre_C + " " + ApellidoP_C +  " " + ApellidoM_C);
    }//GEN-LAST:event_btnSeleccionaDoctorActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        String ID_C = txtID.getText();
        String Paciente_C = txtPaciente_C.getText();
        String Fecha_C = txtFecha_C.getText();
        String Comentarios_C = txtComentarios_C.getText();
        String Estado_C = txtEstado_C.getText();
        String Doctor_C = txtDoctor_C.getText();
        
        if (Paciente_C.length() == 0 || Fecha_C.length() == 0 ||
           Comentarios_C.length() == 0 || Estado_C.length() == 0 ||
           Doctor_C.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Es neceario llenar todos los campos para registrar la cita.");
            return;
        }
        
       try{ 
           PreparedStatement modifica_cita = conecta.prepareStatement(""
                    + "UPDATE citas SET paciente=?, fecha_cita=?, comentarios=?"
                   + ",estado_cita=?, doctor_cita=? WHERE ID_cita=?");                  
           modifica_cita.setString(1, Paciente_C);
           modifica_cita.setString(2, Fecha_C);
           modifica_cita.setString(3, Comentarios_C);
           modifica_cita.setString(4, Estado_C);
           modifica_cita.setString(5, Doctor_C);
           modifica_cita.setString(6, ID_C);
           
           modifica_cita.executeUpdate();
           
           
           VaciaCampos();
           llenaTablaCitas();
           
        }catch(Exception e){ 
            e.printStackTrace(); 
            }
        {
           JOptionPane.showMessageDialog(null, "La cita fue modificada con exito.");
           return;
           }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtBusquedaPCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaPCKeyReleased
        // TODO add your handling code here:
                    try{            
            DefaultTableModel model = new DefaultTableModel();
           TablaPacientes.setModel(model);
               
            PreparedStatement consulta = conecta.prepareStatement(""
                    + "SELECT * FROM pacientes WHERE nombre LIKE ?");                            
            consulta.setString( 1, "%"+txtBusquedaPC.getText()+"%");
           
            /*
            PreparedStatement consulta = conecta.prepareStatement(""
                    + "SELECT * FROM pacientes WHERE nombre "
                    + "MATCH(nombre,apellido_paterno,apellido_materno) AGAINST (?)");                              
            consulta.setString( 1, txtBusquedaCP.getText());
           */
            ResultSet rs = consulta.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int numeroColumnas = rsMd.getColumnCount();            
            for(int i = 1; i <= numeroColumnas; i++){
                model.addColumn(rsMd.getColumnLabel(i));
            }
            
            while(rs.next()){
                Object[] fila = new Object[numeroColumnas];
                for(int j=1; j <= numeroColumnas; j++){
                    fila[j-1] = rs.getObject(j);
                }                
                
                model.addRow(fila);
            }

        }catch(Exception e){
            e.printStackTrace();
                    
        }
    }//GEN-LAST:event_txtBusquedaPCKeyReleased

    private void txtBusquedaDCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaDCKeyReleased
        // TODO add your handling code here:
                    try{            
           DefaultTableModel model = new DefaultTableModel();
           TablaDoctores.setModel(model);
               
            PreparedStatement consulta = conecta.prepareStatement(""
                    + "SELECT nombre, apellido_paterno, apellido_materno, especialidad"
                    + " FROM usuarios WHERE nombre LIKE ?");
            
            consulta.setString( 1, "%"+txtBusquedaDC.getText()+"%");
           
            /*
            PreparedStatement consulta = conecta.prepareStatement(""
                    + "SELECT * FROM pacientes WHERE nombre "
                    + "MATCH(nombre,apellido_paterno,apellido_materno) AGAINST (?)");                              
            consulta.setString( 1, txtBusquedaCP.getText());
           */
            ResultSet rs = consulta.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int numeroColumnas = rsMd.getColumnCount();            
            for(int i = 1; i <= numeroColumnas; i++){
                model.addColumn(rsMd.getColumnLabel(i));
            }
            
            while(rs.next()){
                Object[] fila = new Object[numeroColumnas];
                for(int j=1; j <= numeroColumnas; j++){
                    fila[j-1] = rs.getObject(j);
                }                
                
                model.addRow(fila);
            }

        }catch(Exception e){
            e.printStackTrace();
                    
        }
    }//GEN-LAST:event_txtBusquedaDCKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
       String ID_C = txtID.getText();
       
       try{ 
           PreparedStatement elimina_cita = conecta.prepareStatement(""
                    + "DELETE FROM citas WHERE ID_cita=?");                  
           
           elimina_cita.setString(1, ID_C);
           
           elimina_cita.executeUpdate();
           
           
           VaciaCampos();
           llenaTablaCitas();
           
        }catch(Exception e){ 
            e.printStackTrace(); 
            }
        {
           JOptionPane.showMessageDialog(null, "La cita fue eliminada con exito.");
           return;
           }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    public void VaciaCampos(){
        txtPaciente_C.setText("");
        txtDoctor_C.setText("");
        txtFecha_C.setText("");
        txtEstado_C.setText("");
        txtComentarios_C.setText("");
    }
    
        public void LlenaPacientes() {
    try{
        DefaultTableModel model = new DefaultTableModel();
        TablaPacientes.setModel(model);
        PreparedStatement consulta = conecta.prepareStatement(""
                + "SELECT ID_paciente, nombre, apellido_paterno, apellido_materno"
                + ",fecha_nacimiento, lugar_nacimiento FROM pacientes");
        ResultSet rs = consulta.executeQuery();
        ResultSetMetaData rsMd = rs.getMetaData();
        int numeroColumnas = rsMd.getColumnCount();
        for (int i=1; i<= numeroColumnas; i++){
            model.addColumn(rsMd.getColumnLabel(i));
        }
    while (rs.next()){
        Object[] fila = new Object[numeroColumnas];
        for (int j =1; j<= numeroColumnas; j++){
            fila[j-1]= rs.getObject(j);
        }
        model.addRow(fila);
    }
    
    
}catch(Exception e){
        e.printStackTrace();
    }
}
        public void LlenaDoctores() {
    try{
        DefaultTableModel model = new DefaultTableModel();
        TablaDoctores.setModel(model);
        PreparedStatement consulta = conecta.prepareStatement(""
                + "SELECT ID_usuario, nombre, apellido_paterno, apellido_materno"
                + ", especialidad FROM usuarios");
        ResultSet rs = consulta.executeQuery();
        ResultSetMetaData rsMd = rs.getMetaData();
        int numeroColumnas = rsMd.getColumnCount();
        for (int i=1; i<= numeroColumnas; i++){
            model.addColumn(rsMd.getColumnLabel(i));
        }
    while (rs.next()){
        Object[] fila = new Object[numeroColumnas];
        for (int j =1; j<= numeroColumnas; j++){
            fila[j-1]= rs.getObject(j);
        }
        model.addRow(fila);
    }
    
    
}catch(Exception e){
        e.printStackTrace();
    }
}
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCita().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane TabCitas;
    private javax.swing.JLayeredPane TabDoctores;
    private javax.swing.JLayeredPane TabPacientes;
    private javax.swing.JTabbedPane TabTablas;
    private javax.swing.JTable TablaCitas;
    private javax.swing.JTable TablaDoctores;
    private javax.swing.JTable TablaPacientes;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSeleccionaDoctor;
    private javax.swing.JButton btnSeleccionaPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtBusquedaCC;
    private javax.swing.JTextField txtBusquedaDC;
    private javax.swing.JTextField txtBusquedaPC;
    public static javax.swing.JTextArea txtComentarios_C;
    public static javax.swing.JTextField txtDoctor_C;
    public static javax.swing.JTextField txtEstado_C;
    public static javax.swing.JTextField txtFecha_C;
    public static javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtPaciente_C;
    // End of variables declaration//GEN-END:variables
}
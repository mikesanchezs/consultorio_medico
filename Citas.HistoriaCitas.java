/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguelangelo
 */
public class HistoriaCitas extends javax.swing.JInternalFrame {

    Connection conecta;
    JTextField txtIdPaciente_C;
    
    /**
     * Creates new form HistoriaCitas
     */
    public HistoriaCitas() {
        initComponents();
         IniciaBD();
        llenaTablaCitas();
    }
    
    public HistoriaCitas(JTextField txtIdPaciente_C) {
        initComponents();
         IniciaBD();
        llenaTablaCitas();
        this.txtIdPaciente_C=txtIdPaciente_C;
    }

    
    
    public void IniciaBD(){
            try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conecta = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/base_consultorio","root","");
            
            }catch (Exception ex){
            ex.printStackTrace();
            }
       }

      public void llenaTablaCitas() {
    try{
        DefaultTableModel model = new DefaultTableModel();
        TablaHistoria.setModel(model);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHistoria = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtBusquedaPC = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        txtBusquedaEC = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        txtBusquedaDC = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        txtBusquedaCC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TablaHistoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaHistoria);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Historial De Citas");

        txtBusquedaPC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaPCKeyReleased(evt);
            }
        });
        txtBusquedaPC.setBounds(0, 0, 329, 30);
        jLayeredPane1.add(txtBusquedaPC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Paciente", jLayeredPane1);

        txtBusquedaEC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaECKeyReleased(evt);
            }
        });
        txtBusquedaEC.setBounds(0, 0, 329, 30);
        jLayeredPane2.add(txtBusquedaEC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Estado", jLayeredPane2);

        txtBusquedaDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaDCKeyReleased(evt);
            }
        });
        txtBusquedaDC.setBounds(0, 0, 329, 30);
        jLayeredPane3.add(txtBusquedaDC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Doctor", jLayeredPane3);

        txtBusquedaCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaCCKeyReleased(evt);
            }
        });
        txtBusquedaCC.setBounds(0, 0, 329, 30);
        jLayeredPane4.add(txtBusquedaCC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Comentario", jLayeredPane4);

        jLabel3.setText("Buscar Por:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(btnSalir))
                    .add(jScrollPane1)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 332, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3))
                        .add(559, 559, 559)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(346, 346, 346)
                .add(jLabel2)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBusquedaPCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaPCKeyReleased
        // TODO add your handling code here:
        try{
            DefaultTableModel model = new DefaultTableModel();
            TablaHistoria.setModel(model);

            PreparedStatement consulta = conecta.prepareStatement(""
                + "SELECT * FROM citas WHERE paciente LIKE ?");
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

    private void txtBusquedaECKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaECKeyReleased
        // TODO add your handling code here:
        try{
            DefaultTableModel model = new DefaultTableModel();
            TablaHistoria.setModel(model);

            PreparedStatement consulta = conecta.prepareStatement(""
                + "SELECT * FROM citas WHERE estado_cita LIKE ?");
            consulta.setString( 1, "%"+txtBusquedaEC.getText()+"%");

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
    }//GEN-LAST:event_txtBusquedaECKeyReleased

    private void txtBusquedaDCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaDCKeyReleased
        // TODO add your handling code here:
        try{
            DefaultTableModel model = new DefaultTableModel();
            TablaHistoria.setModel(model);

            PreparedStatement consulta = conecta.prepareStatement(""
                + "SELECT * FROM citas WHERE doctor_cita LIKE ?");
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

    private void txtBusquedaCCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaCCKeyReleased
        // TODO add your handling code here:
        try{
            DefaultTableModel model = new DefaultTableModel();
            TablaHistoria.setModel(model);

            PreparedStatement consulta = conecta.prepareStatement(""
                + "SELECT * FROM citas WHERE comentarios LIKE ?");
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
            java.util.logging.Logger.getLogger(HistoriaCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoriaCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoriaCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoriaCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoriaCitas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaHistoria;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBusquedaCC;
    private javax.swing.JTextField txtBusquedaDC;
    private javax.swing.JTextField txtBusquedaEC;
    private javax.swing.JTextField txtBusquedaPC;
    // End of variables declaration//GEN-END:variables
}

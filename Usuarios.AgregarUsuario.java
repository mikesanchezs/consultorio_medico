/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguelangelo
 */
public class AgregarUsuario extends javax.swing.JInternalFrame {

    Connection conecta;
    
    /**
     * Creates new form AgregarUsuario
     */
    public AgregarUsuario() {
        initComponents();
        IniciaBD();
    }

    public void IniciaBD(){
            try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conecta = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/base_consultorio","root","");
            
            }catch (Exception ex){
            ex.printStackTrace();
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
        jLabel6 = new javax.swing.JLabel();
        txtNombre_U = new javax.swing.JTextField();
        txtApellidoP_U = new javax.swing.JTextField();
        txtApellidoM_U = new javax.swing.JTextField();
        txtEspecialidad_U = new javax.swing.JTextField();
        txtNombreU_U = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtContrasena_U = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre(s):");

        jLabel2.setText("Apellido Paterno:");

        jLabel3.setText("Apellido Materno:");

        jLabel4.setText("Especialidad:");

        jLabel5.setText("Nombre de Usuario:");

        jLabel6.setText("ContraseÃ±a:");

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Agregar Usuario");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(layout.createSequentialGroup()
                            .addContainerGap(188, Short.MAX_VALUE)
                            .add(btnGuardar)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(btnCancelar))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                            .add(19, 19, 19)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jLabel3)
                                .add(jLabel1)
                                .add(jLabel2)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel5)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel4)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel6)))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(txtNombre_U, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .add(txtApellidoP_U)
                                .add(txtApellidoM_U)
                                .add(txtEspecialidad_U)
                                .add(txtNombreU_U)
                                .add(txtContrasena_U))))
                    .add(layout.createSequentialGroup()
                        .add(107, 107, 107)
                        .add(jLabel7)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel7)
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel1)
                    .add(txtNombre_U, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtApellidoP_U, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtApellidoM_U, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtEspecialidad_U, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtNombreU_U, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtContrasena_U, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnCancelar)
                    .add(btnGuardar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String Nombre_U = txtNombre_U.getText();
        String ApellidoP_U = txtApellidoP_U.getText();
        String ApellidoM_U = txtApellidoM_U.getText();
        String Especialidad_U = txtEspecialidad_U.getText();
        String NombreU_U = txtNombreU_U.getText();
        String Contrasena_U = txtContrasena_U.getText();
        
        
        if (Nombre_U.length() == 0 || ApellidoP_U.length() == 0 ||
           ApellidoM_U.length() == 0 || Especialidad_U.length() == 0 ||
           NombreU_U.length() == 0 || Contrasena_U.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Es neceario llenar todos los campos para registrar al nuevo usuario.");
            return;
        }
        
       try{ 
           PreparedStatement registra_usuario = conecta.prepareStatement(""
                    + "INSERT INTO usuarios(nombre,apellido_paterno,apellido_materno"
                   + ",especialidad,usuario,contrasena) VALUES (?,?,?,?,?,?)");                  
           registra_usuario.setString(1, Nombre_U);
           registra_usuario.setString(2, ApellidoP_U);
           registra_usuario.setString(3, ApellidoM_U);
           registra_usuario.setString(4, Especialidad_U);
           registra_usuario.setString(5, NombreU_U);
           registra_usuario.setString(6, Contrasena_U);  
           
           registra_usuario.executeUpdate();
           
           
           VaciaCampos();
           
        }catch(Exception e){
            e.printStackTrace();       
            }
        {
           JOptionPane.showMessageDialog(null, "El usuario se registro con exito.");
           return;
           }
    }//GEN-LAST:event_btnGuardarActionPerformed

      public void VaciaCampos(){
        txtNombre_U.setText("");
        txtApellidoM_U.setText("");
        txtApellidoP_U.setText("");
        txtEspecialidad_U.setText("");
        txtNombreU_U.setText("");
        txtContrasena_U.setText("");
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
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellidoM_U;
    private javax.swing.JTextField txtApellidoP_U;
    private javax.swing.JPasswordField txtContrasena_U;
    private javax.swing.JTextField txtEspecialidad_U;
    private javax.swing.JTextField txtNombreU_U;
    private javax.swing.JTextField txtNombre_U;
    // End of variables declaration//GEN-END:variables
}

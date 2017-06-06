/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Instructor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 */
public class FrmIngresoInstructor extends javax.swing.JFrame {
    
    private boolean editar = false;
    private Connection con;

    /**
     * Creates new form FrmIngresoInstructor
     */
    public FrmIngresoInstructor() {
        initComponents();
        this.setLocationRelativeTo(null);
        editar = false;
    }
    
     public FrmIngresoInstructor(Instructor i) {
        initComponents();
        this.setLocationRelativeTo(null);
        editar = true;
        tfDocIdentidad.setEnabled(!editar);
        tfDocIdentidad.setText(String.valueOf(i.getDoc_identidad()));
        tfNombre.setText(String.valueOf(i.getNombre()));
        tfApellido.setText(String.valueOf(i.getApellido()));
        tfCorreo.setText(String.valueOf(i.getCorreo()));
        tfEdad.setText(String.valueOf(i.getEdad()));
        cbSexo.setSelectedItem(i.getSexo());
        tfDireccion.setText(String.valueOf(i.getDireccion()));
        tfDescripcion.setText(String.valueOf(i.getDescripcion()));
        tfTelefonoFijo.setText(String.valueOf(i.getTelefono_Fijo()));
        tfTelefonoMovil.setText(String.valueOf(i.getTelefono_Movil()));
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfDocIdentidad = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        cbSexo = new javax.swing.JComboBox<>();
        tfEdad = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfTelefonoFijo = new javax.swing.JTextField();
        tfTelefonoMovil = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        bGuardar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Sexo");

        jLabel5.setText("Edad");

        jLabel6.setText("Direccion");

        jLabel7.setText("Telefono Fijo");

        jLabel8.setText("Telefono Movil");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel9.setText("Correo Elec.");

        jLabel10.setText("Descripcion");

        tfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescripcionActionPerformed(evt);
            }
        });

        bGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496293572_save.png"))); // NOI18N
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496298750_ic_layers_clear_48px.png"))); // NOI18N
        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496288659_exit-to-app.png"))); // NOI18N
        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel11.setText("Instructores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(89, 89, 89)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfDocIdentidad, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(94, 94, 94)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(107, 107, 107)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                            .addComponent(tfEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfCorreo, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(bLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(bGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfTelefonoFijo)
                                .addComponent(tfTelefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSalir)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(324, 324, 324)
                                .addComponent(jLabel11)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(tfDocIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(tfTelefonoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(tfTelefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bGuardar)
                            .addComponent(bLimpiar)
                            .addComponent(bSalir))
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescripcionActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        // TODO add your handling code here:
          if(validarForm()){
            PreparedStatement st= null ;
            try{
                LocalDate todayLocalDate; 
                todayLocalDate = LocalDate.now( ZoneId.of( "America/Montreal" ) );

                Instructor i = new Instructor(
                        tfDocIdentidad.getText(),
                        tfNombre.getText(),
                        tfApellido.getText(),
                        tfEdad.getText(),
                        cbSexo.getSelectedItem().toString(),
                        tfCorreo.getText(),
                        tfDescripcion.getText(),
                        tfTelefonoMovil.getText(),
                        tfTelefonoFijo.getText(),
                        tfDireccion.getText()
                    );
                
                con = conexion.Conexion.conectar();
                
                if (editar){
                    st = con.prepareStatement("UPDATE instructor set nombres = ?, apellidos = ?, edad = ?, sexo = ?, correo_elec = ?, descripcion = ?, telefono_movil = ?, telefono_fijo = ?, direccion = ? WHERE id = ?");
                    st.setString(1, i.getNombre());
                    st.setString(2, i.getApellido());
                    st.setString(3, i.getEdad());
                    st.setString(4, i.getSexo());
                    st.setString(5, i.getCorreo());
                    st.setString(6, i.getDescripcion());   
                    st.setString(7, i.getTelefono_Movil());
                    st.setString(8, i.getTelefono_Fijo());
                    st.setString(9, i.getDireccion());   
                    
                    st.executeUpdate();
                    System.out.println("Actualizacion exitosa!");
                }else {
                    st = con.prepareStatement("INSERT INTO instructor (id, doc_identidad, nombres, apellidos, edad, sexo, correo_elec, descripcion, telefono_movil, telefono_fijo, direccion) VALUES (null,?,?,?,?,?,?,?,?,?,?)");
                    st.setString(1, i.getDoc_identidad());
                    st.setString(2, i.getNombre());
                    st.setString(3, i.getApellido());
                    st.setString(4, i.getEdad());
                    st.setString(5, i.getSexo());
                    st.setString(6, i.getCorreo());
                    st.setString(7, i.getDescripcion());  
                    st.setString(8, i.getTelefono_Movil());
                    st.setString(9, i.getTelefono_Fijo());
                    st.setString(10, i.getDireccion());
                    
                    st.executeUpdate();
                    System.out.println("Instructor guardado exitosamente!");
                }
                limpiarForm();
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(FrmIngresoInstructor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrmIngresoInstructor.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                if (con!=null) {
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(FrmIngresoInstructor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (st!=null) {
                    try{
                        st.close();
                    }catch (SQLException ex) {
                        Logger.getLogger(FrmIngresoInstructor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } 
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarForm();
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    public void limpiarForm(){ 
        tfDocIdentidad.setText(null);
        tfNombre.setText(null);
        tfApellido.setText(null);
        tfCorreo.setText(null);
        tfEdad.setText(null);
        cbSexo.setSelectedItem(0);
        tfDireccion.setText(null);
        tfDescripcion.setText(null);
        tfTelefonoFijo.setText(null);
        tfTelefonoMovil.setText(null);
    }
    
    public boolean validarForm(){ 
         try {
            Integer.parseInt(tfDocIdentidad.getText());            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "El Doc. de Identidad debe tener valores válidos!",
                "Administracion Instructor",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if( tfNombre.getText().isEmpty() ||
            tfApellido.getText().isEmpty() ||
            tfEdad.getText().isEmpty() ||
            cbSexo.getSelectedItem().toString().equalsIgnoreCase("") ||
            tfCorreo.getText().isEmpty() ||
            tfTelefonoFijo.getText().isEmpty() ||
            tfTelefonoMovil.getText().isEmpty() ||
            tfDireccion.getText().isEmpty() ||
            tfDescripcion.getText().isEmpty()
            ){
            JOptionPane.showMessageDialog(null,
                    "Formulario imcompleto!", 
                    "Administracion Instructor",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return    validarInstructor(tfDocIdentidad.getText());
    }
    
    public boolean validarInstructor(String docIdentidad){
        if(!editar){
            ResultSet rs= null;
            PreparedStatement st= null;
            
            try{
                con = conexion.Conexion.conectar();
                st = con.prepareStatement("SELECT * FROM instructor WHERE doc_identidad");
                st.setString(1, docIdentidad);
                rs = st.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,
                            "El instructor ya existe!",
                            "Administracion Instructor",
                            JOptionPane.ERROR_MESSAGE
                            );
                    return false;
                }
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                        "Validacion imposible!\n" + e,
                        "Administracion Instructor",
                        JOptionPane.ERROR_MESSAGE);          
                return false;
            } finally{
                if ( con!=null) {
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(FrmIngresoInstructor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (st!=null) {
                    try{
                        st.close();
                    }catch (SQLException ex) {
                        Logger.getLogger(FrmIngresoInstructor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                if (rs!= null) {
                    try{
                        rs.close();
                    }catch (SQLException ex) {
                        Logger.getLogger(FrmIngresoInstructor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return true;
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
            java.util.logging.Logger.getLogger(FrmIngresoInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIngresoInstructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDocIdentidad;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefonoFijo;
    private javax.swing.JTextField tfTelefonoMovil;
    // End of variables declaration//GEN-END:variables
}

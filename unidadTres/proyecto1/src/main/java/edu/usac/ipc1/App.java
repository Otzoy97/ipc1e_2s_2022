package edu.usac.ipc1;

import javax.swing.JOptionPane;

/**
 * Esta clase es el punto de inicio de ejecución de la
 * apliación de ventanas.
 * 
 * Ejemplifica el uso de un campo de texto, etiquetas,
 * botones, listas desplegables y mensajes/notificaciones
 * @author otzoy
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel lblNombre = new javax.swing.JLabel();
        javax.swing.JButton btnNombre = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        cmbNombre = new javax.swing.JComboBox<>();
        javax.swing.JLabel lblElemento = new javax.swing.JLabel();
        lblElementoSeleccionado = new javax.swing.JLabel();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu1 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu2 = new javax.swing.JMenu();
        javax.swing.JMenu jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblNombre.setText("Coloque su nombre aquí:");

        btnNombre.setText("Presione aquí");
        btnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cmbNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNombreItemStateChanged(evt);
            }
        });

        lblElemento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblElemento.setText("El elemento seleccionado es");

        lblElementoSeleccionado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblElementoSeleccionado.setToolTipText("");

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar...");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbNombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNombre))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblElemento)
                        .addGap(18, 18, 18)
                        .addComponent(lblElementoSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElemento)
                    .addComponent(lblElementoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreActionPerformed
        // Se asegura de no añadir información "en blanco"
        //  al lista desplegable
        if(!txtNombre.getText().isBlank()) {
            cmbNombre.addItem(txtNombre.getText());
            txtNombre.setText("");
            // Notifica al usuario que el nombres se agregó correctamente      
            JOptionPane.showMessageDialog(this, "Añadido", "Información", JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(this, "Añadido", "Información", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(this, "Añadido", "Información", JOptionPane.QUESTION_MESSAGE);
            //JOptionPane.showMessageDialog(this, "Añadido", "Información", JOptionPane.ERROR_MESSAGE);
        } else {
            // Notifica al usuario que el campo está vacío
            JOptionPane.showMessageDialog(this, "El campo está vacío", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnNombreActionPerformed

    private void cmbNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNombreItemStateChanged
        // Al cambiar de item seleccionado, la etiqueta 'elementoSeleccionado'
        // mostrará el nombre de ese nuevo elemento seleccionado.
        lblElementoSeleccionado.setText(cmbNombre.getSelectedItem().toString());
    }//GEN-LAST:event_cmbNombreItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Crea un nuevo objeto de 'OtraVentana' y lo hace "visible"
        OtraVentana ventana = new OtraVentana();
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbNombre;
    private javax.swing.JLabel lblElementoSeleccionado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

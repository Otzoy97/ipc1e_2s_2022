package edu.usac.ipc1.carrera;

import edu.usac.ipc1.carrera.track.Handicap;
import edu.usac.ipc1.carrera.track.TrackController;
import edu.usac.ipc1.carrera.track.TrackModel;
import edu.usac.ipc1.carrera.track.TrackRender;

public class Tablero extends javax.swing.JFrame {

    TrackModel trackModel;
    TrackController trackController;
    TrackRender trackRender;

    public Tablero() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton btnRigth = new javax.swing.JButton();
        javax.swing.JButton btnLeft = new javax.swing.JButton();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JButton btnStart = new javax.swing.JButton();
        cmbHandicap = new javax.swing.JComboBox<Handicap>(Handicap.values());
        pnlTrack = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(190, 340));
        setMinimumSize(new java.awt.Dimension(190, 340));
        setPreferredSize(new java.awt.Dimension(190, 340));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnRigth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/right.png"))); // NOI18N
        btnRigth.setOpaque(false);
        btnRigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRigthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(btnRigth, gridBagConstraints);

        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left.png"))); // NOI18N
        btnLeft.setOpaque(false);
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(btnLeft, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnStart.setText("Iniciar");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(btnStart, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(cmbHandicap, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        pnlTrack.setLayout(new java.awt.GridLayout(8, 3, 2, 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pnlTrack, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        trackController.moveVehicleLeft();
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnRigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRigthActionPerformed
        trackController.moveVehicleRigth();
    }//GEN-LAST:event_btnRigthActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        int selectedIndex = cmbHandicap.getSelectedIndex();
        if (selectedIndex < 0) {
            return;
        }
        // Establece la dificultad
        Handicap handicap = cmbHandicap.getItemAt(selectedIndex);
        // Inicializa los controladores del tablero
        trackModel = new TrackModel();
        trackController = new TrackController(trackModel);
        trackRender = new TrackRender(trackModel);
        // Establece los parámetros iniciales
        trackRender.addLabels(pnlTrack);
        trackModel.setAlive(true);
        trackController.setHandicap(handicap);
        // Comienza el juego
        new Thread(() -> {
            trackRender.run();
        }).start();
        new Thread(() -> {
            trackController.run();
        }).start();
        //new Thread(trackRender).start();
        //new Thread(trackController).start();
    }//GEN-LAST:event_btnStartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Handicap> cmbHandicap;
    private javax.swing.JPanel pnlTrack;
    // End of variables declaration//GEN-END:variables
}

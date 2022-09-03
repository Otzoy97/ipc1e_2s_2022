package edu.usac.ipc1.inventario;

import edu.usac.ipc1.inventario.Operacion.Operacion;
import edu.usac.ipc1.inventario.Operacion.OperacionTableModel;
import edu.usac.ipc1.inventario.Producto.Producto;
import edu.usac.ipc1.inventario.Producto.ProductoListModel;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {

    Producto[] productos = new Producto[10];
    ProductoListModel listModel = new ProductoListModel(productos);
    OperacionTableModel tableModel = new OperacionTableModel();

    public App() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreProducto = new javax.swing.JTextField();
        javax.swing.JButton btnCrearProducto = new javax.swing.JButton();
        cmbProducto = new javax.swing.JComboBox<>();
        cmbOperacion = new javax.swing.JComboBox<>();
        javax.swing.JButton btnRegistrar = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableHistorial = new javax.swing.JTable();
        txtBuscarProducto = new javax.swing.JTextField();
        javax.swing.JButton btnVerHistorial = new javax.swing.JButton();
        spnMonto = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario");

        btnCrearProducto.setText("Crear producto");
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        cmbProducto.setModel(listModel);

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Salida" }));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        tableHistorial.setModel(tableModel);
        jScrollPane1.setViewportView(tableHistorial);

        btnVerHistorial.setText("Buscar");
        btnVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistorialActionPerformed(evt);
            }
        });

        spnMonto.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearProducto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarProducto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnMonto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearProducto))
                .addGap(18, 18, 18)
                .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar)
                    .addComponent(spnMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerHistorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        String nombreProducto = this.txtNombreProducto.getText().trim();
        if (!nombreProducto.isEmpty()) {
            for (int i = 0; i < productos.length; i++) {
                if (productos[i] == null) {
                    productos[i] = new Producto(nombreProducto);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Escriba el nombre del producto", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Producto producto = listModel.getElementAt(cmbProducto.getSelectedIndex());
        double monto = (double) spnMonto.getValue();
        String entradaSalida = cmbOperacion.getSelectedItem().toString();
        Operacion operacion = new Operacion();
        switch (entradaSalida) {
            case "Entrada" -> {
                operacion.setEntrada(monto);
                producto.registrarOperacion(operacion);
                break;
            }
            case "Salida" -> {
                if (!verificarExistencias(producto, monto)) {
                    operacion.setSalida(monto);
                    producto.registrarOperacion(operacion);
                    verificarExistencias(producto);
                }
                break;
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialActionPerformed
        String nombreProducto = txtBuscarProducto.getText().trim().toLowerCase();
        if (!nombreProducto.isEmpty()) {
            for (Producto producto : productos) {
                if (producto.getNombre().toLowerCase().equals(nombreProducto)) {
                    tableModel.setOperaciones(producto.getHistorial());
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Escriba el nombre del producto", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnVerHistorialActionPerformed

    private boolean verificarExistencias(Producto producto, double monto) {
        if (producto.getExistencias() < monto) {
            JOptionPane.showMessageDialog(this, "No hay suficientes existencias del producto seleccionado", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
        }
        return producto.getExistencias() < monto;
    }

    private void verificarExistencias(Producto producto) {
        if (producto.getExistencias() < 10) {
            JOptionPane.showMessageDialog(this, "Hay pocas existencias de: " + producto.getNombre(), this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JComboBox<Producto> cmbProducto;
    private javax.swing.JSpinner spnMonto;
    private javax.swing.JTable tableHistorial;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtNombreProducto;
    // End of variables declaration//GEN-END:variables
}

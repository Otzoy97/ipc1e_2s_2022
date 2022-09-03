package edu.usac.ipc1.inventario.Producto;

import javax.swing.DefaultComboBoxModel;

public class ProductoListModel extends DefaultComboBoxModel<Producto> {

    private Producto[] productos;
    
    public ProductoListModel(Producto[] productos) {
        this.productos = productos;
    }
    
    @Override
    public Producto getElementAt(int index) {
        return productos[index];
    }

    @Override
    public int getSize() {
        int largo = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                largo++;
            }
        }
        return largo;
    }
    
}

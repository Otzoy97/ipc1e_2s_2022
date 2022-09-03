package edu.usac.ipc1.inventario.Producto;

import edu.usac.ipc1.inventario.Operacion.Operacion;

public class Producto {
    private String nombre;
    private Operacion[] historial;
    private double existencias;

    public Producto(String nombre) {
        this.nombre = nombre;
        this.historial = new Operacion[10];
    }

    public String getNombre() {
        return nombre;
    }
    
    public void registrarOperacion(Operacion operacion) {
        for (int i = 0; i < historial.length; i++) {
            if (historial[i] == null) {
                historial[i] = operacion;
                existencias = existencias + operacion.getEntrada() - operacion.getSalida();
                break;
            }
        }
    }

    public Operacion[] getHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public double getExistencias() {
        return existencias;
    }
    
}

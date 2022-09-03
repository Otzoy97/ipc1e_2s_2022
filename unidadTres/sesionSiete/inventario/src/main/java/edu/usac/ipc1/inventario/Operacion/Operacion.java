package edu.usac.ipc1.inventario.Operacion;

import java.util.Date;

public class Operacion {

    private Date fechaHora;
    private String detalle;
    private double cantidadEntrada;
    private double cantidadSalida;

    public Operacion() {
        this.fechaHora = new Date();
    }

    public void setSalida(double salida) {
        this.detalle = "Salida";
        this.cantidadSalida = salida;
        this.cantidadEntrada = 0;
    }

    public void setEntrada(double entrada) {
        this.detalle = "Entrada";
        this.cantidadSalida = 0;
        this.cantidadEntrada = entrada;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public double getEntrada() {
        return cantidadEntrada;
    }

    public double getSalida() {
        return cantidadSalida;
    }
    
    public String getDetalle() {
        return this.detalle;
    }
}

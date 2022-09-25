package edu.usac.ipc1.carrera.track;

import edu.usac.ipc1.carrera.vehicle.Segmento;
import javax.swing.JOptionPane;

public class TableroModelo {

    public static final int TABLERO_ALTO = 10;
    public static final int TABLERO_ANCHO = 10;
    private final Segmento[] serpiente;
    private int largoSerpiente;
    private Segmento fruta;
    private volatile boolean vivo;
    private volatile boolean activo;

    public TableroModelo() {
        // Inicializo todo el arreglo
        this.serpiente = new Segmento[25];
        // Se crea la cabeza de la serpiente
        this.serpiente[0] = new Segmento(4, 4);
        generarFruta();
        largoSerpiente = 1;
    }

    private void generarFruta() {
        int posX = (int) Math.round(Math.random() * (TABLERO_ANCHO - 1));
        int posY = (int) Math.round(Math.random() * (TABLERO_ALTO - 1));
        this.fruta = new Segmento(posX, posY);
    }

    public void agregarSegmento() {
        Segmento segmentoAnterior = serpiente[largoSerpiente - 1];
        serpiente[largoSerpiente] = new Segmento(segmentoAnterior.getPosX(), segmentoAnterior.getPosY());
        largoSerpiente++;
        if (largoSerpiente == 25) {
            activo = false;
            JOptionPane.showMessageDialog(null, "Ganó :)", "Serpiente", JOptionPane.INFORMATION_MESSAGE);
        }
        generarFruta();
    }

    public void moverSegmentos() {
        if (largoSerpiente <= 1) {
            return;
        }
        for (int i = largoSerpiente - 1; i > 0; i--) {
            if (serpiente[i] == null) {
                serpiente[i] = new Segmento();
            }
            serpiente[i].setPosX(serpiente[i - 1].getPosX());
            serpiente[i].setPosY(serpiente[i - 1].getPosY());
        }
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getLargoSerpiente() {
        return largoSerpiente;
    }

    public void setLargoSerpiente(int largoSerpiente) {
        this.largoSerpiente = largoSerpiente;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Segmento[] getSerpiente() {
        return serpiente;
    }

    public Segmento getFruta() {
        return fruta;
    }

}

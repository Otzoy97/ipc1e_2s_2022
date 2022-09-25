package edu.usac.ipc1.carrera.track;

import edu.usac.ipc1.carrera.Tablero;
import edu.usac.ipc1.carrera.vehicle.Segmento;
import javax.swing.JOptionPane;

public class TableroController {

    private final TableroModelo modelo;
    private int velocidad = 1000;
    private Dificultad dificultad;
    private Direccion direccion;

    public TableroController(TableroModelo model) {
        this.modelo = model;
    }

    public synchronized void run() {
        while (true && modelo.isVivo() && modelo.isActivo()) {
            moverSerpiente();
            try {
                wait(velocidad);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    private void moverSerpiente() {
        modelo.moverSegmentos();
        Segmento cabeza = modelo.getSerpiente()[0];
        int posX = cabeza.getPosX();
        int posY = cabeza.getPosY();
        if (direccion == null) {
            return;
        }
        switch(direccion) {
            case Arriba -> cabeza.setPosY(posY - 1);
            case Abajo -> cabeza.setPosY(posY + 1);
            case Izquierda -> cabeza.setPosX(posX - 1);
            case Derecha -> cabeza.setPosX(posX + 1);
        }
        verificarColision(cabeza);
    }

    private void verificarColision(Segmento cabeza) {
        // Verifica si se choca con una fruta
        if (cabeza.getPosX() == modelo.getFruta().getPosX()
                && cabeza.getPosY() == modelo.getFruta().getPosY()) {
            modelo.agregarSegmento();
            aumentarVelocidad();
            Tablero.lblTamanio.setText(String.valueOf(modelo.getLargoSerpiente()));
            Tablero.lblIntervalo.setText(String.valueOf(velocidad));
        }
        // Verifica si se choca con los bordes
        if (cabeza.getPosX() > 9 || cabeza.getPosX() < 0 || cabeza.getPosY() > 9 || cabeza.getPosY() < 0) {
            modelo.setVivo(false);
            JOptionPane.showMessageDialog(null, "Perdió :(", "Serpiente", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void aumentarVelocidad() {
        switch(dificultad) {
            case Fácil -> velocidad *= 0.97;
            case Intermedio -> velocidad *= 0.94;
            case Difícil -> velocidad *= 0.91;
        }
    } 
    
    public void moverIzquierda() {
        direccion = Direccion.Izquierda;
    }

    public void moverDerecha() {
        direccion = Direccion.Derecha;
    }

    public void moverArriba() {
        direccion = Direccion.Arriba;
    }

    public void moverAbajo() {
        direccion = Direccion.Abajo;
    }

    public void setHandicap(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

}

package edu.usac.ipc1.carrera.vehicle;

public class Segmento {
    private volatile int posX;
    private volatile int posY;

    public Segmento(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    public Segmento() { }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }    
}

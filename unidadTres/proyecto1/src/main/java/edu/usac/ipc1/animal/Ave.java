package edu.usac.ipc1.animal;

public class Ave extends Oviparo {
    private boolean puedeVolar;

    public Ave(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    public boolean vuela() {
        return puedeVolar;
    }
}

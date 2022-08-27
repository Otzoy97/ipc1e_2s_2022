package edu.usac.ipc1e.animal;

/**
 * La clase Ave funciona como una clase padre de Pinguino y Loro
 * Al mismo tiempo esta clase es una clase hija de Oviparo
 */
public class Ave extends Oviparo {
    private boolean puedeVolar;

    public Ave(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    /**
     * Determina si el ave puede volar o no
     */
    public boolean vuela() {
        return puedeVolar;
    }
}

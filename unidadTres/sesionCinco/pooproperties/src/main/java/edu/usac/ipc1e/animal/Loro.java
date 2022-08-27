package edu.usac.ipc1e.animal;

/**
 * La clase Loro es una clase hija de Ave
 */
public class Loro extends Ave {
    public Loro(boolean puedeVolar) {
        super(puedeVolar);
    }
    
    /**
     * Este método sobreescribe el método vuela de Ave.
     * 
     * Al invocar el método vuela desde una instancia de Loro, en lugar de  
     * usar el método "vuela" de la clase padre "Ave", se usará esta función
     */
    @Override
    public boolean vuela() {
        return true;
    }

}

package edu.usac.ipc1.animal;

public class Loro extends Ave {

    public Loro(boolean puedeVolar) {
        super(puedeVolar);
    }
    
    @Override
    public boolean vuela() {
        return true;
    }

}

package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {

    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos masikHos) {
        if (masikHos instanceof Bosszuallo) {
            Bosszuallo bosszualloHos = (Bosszuallo) masikHos;
            if (bosszualloHos.vanEGyengesege && bosszualloHos.mekkoraAzEreje() < this.szuperero) {
                return true;
            }
        } else if (masikHos instanceof Batman) {
            return this.szuperero >= 2 * masikHos.mekkoraAzEreje();
        }
        return false;
    }


    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        String gyengesegeStatus = vanEGyengesege ? "van gyengesége" : "nincs gyengesége";
        return MessageFormat.format("Szupererő: {0,number,#.##}; {1}", szuperero, gyengesegeStatus);
    }

}

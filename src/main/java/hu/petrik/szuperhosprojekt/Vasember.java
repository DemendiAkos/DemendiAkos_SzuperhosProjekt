package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {


    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000;
    }

    @Override
    public void kutyutKeszit() {
        Random random = new Random();

        double extraPower = random.nextDouble() * 10;
        setSzuperero(getSzuperero() + extraPower);
    }

    @Override
    public String toString() {
        String gyengesegeStatus = isVanEGyengesege() ? "van gyengesége" : "nincs gyengesége";
        return MessageFormat.format("Vasember - Szupererő: {0,number,#.##}; {1}", getSzuperero(), gyengesegeStatus);
    }
}

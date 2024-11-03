package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public class Batman implements SzuperHos, Milliardos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }

    @Override
    public boolean legyoziE(SzuperHos masikHos) {
        return masikHos.mekkoraAzEreje() < this.lelemenyesseg;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }


    public double getLelemenyesseg() {
        return lelemenyesseg;
    }

    public void setLelemenyesseg(double lelemenyesseg) {
        this.lelemenyesseg = lelemenyesseg;
    }



    @Override
    public String toString() {
        return MessageFormat.format("Batman: leleményesség: {0,number,#.##}", lelemenyesseg);
    }
}

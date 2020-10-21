package com.bzsomi;

public abstract class Jarmu {
    private String rendszam;
    protected int sebesseg;

    public Jarmu(String rendszam, int sebesseg) {
        this.rendszam = rendszam;
        this.sebesseg = sebesseg;
    }

    private boolean gyorshajtottE(int sebessegkorlat){ return this.sebesseg>sebessegkorlat; }

    @Override
    public String toString() {
        return String.format("%s - %d Km/h", this.rendszam, this.sebesseg);
    }
}
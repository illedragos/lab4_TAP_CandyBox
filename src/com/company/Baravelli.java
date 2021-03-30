package com.company;

public class Baravelli extends CandyBox {
    float radius, height;
    private int volume;

    public Baravelli(float radius, float height, int volume) {
        this.radius = radius;
        this.height = height;
        this.volume = volume;
    }

    public Baravelli(String flavor, String origin, float radius, float height, int volume) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
        this.volume = volume;
    }

    public Baravelli(){

    }

    @Override
    public int getVolume() {
        return 20;
    }

    @Override
    public String toString() {
        return "Baravelli{" +
                "radius=" + radius +
                ", height=" + height +
                ", volume=" + volume +
                "} " + super.toString();
    }
}

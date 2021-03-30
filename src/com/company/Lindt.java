package com.company;

public class Lindt extends CandyBox{
    float length, width, height;
    private int volume;
    public Lindt(){

    }

    public Lindt(float length, float width, float height, int volume) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = volume;
    }

    public Lindt(String flavor, String origin, float length, float width, float height, int volume) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return 10;
    }

    @Override
    public String toString() {
        return "Lindt{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", volume=" + volume +
                "} " + super.toString();
    }
}

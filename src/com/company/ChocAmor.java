package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChocAmor extends CandyBox {
    float length;
    private int volume;

    public ChocAmor(float length) {
        this.length = length;
    }

    public ChocAmor(float length, int volume) {
        this.length = length;
        this.volume = volume;
    }

    public ChocAmor(String flavor, String origin, float length, int volume) {
        super(flavor, origin);
        this.length = length;
        this.volume = volume;
    }

    public ChocAmor(){

    }

    @Override
    public int getVolume() {
        return 30;
    }

    @Override
    public String toString() {
        return "ChocAmor{" +
                "length=" + length +
                "} " + super.toString();
    }



}

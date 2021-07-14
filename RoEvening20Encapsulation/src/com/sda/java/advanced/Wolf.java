package com.sda.java.advanced;

public class Wolf extends Canine {
    @Override
    public double getAverageWeight() {
        double parentWeight = super.getAverageWeight();
        return parentWeight + 20;
        //return super.getAverageWeight() + 20;
        //return 20;
    }
}

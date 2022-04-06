package com.ylesb.design.impl;

import com.ylesb.design.ICalculationArea;


public class CalculationArea implements ICalculationArea {

    private final static double π = 3.14D;

    public double rectangle(double x, double y) {
        return x * y;
    }

    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public double circular(double r) {
        return π * r * r;
    }

}

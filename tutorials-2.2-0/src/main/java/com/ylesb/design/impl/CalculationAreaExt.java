package com.ylesb.design.impl;

public class CalculationAreaExt extends CalculationArea {

    private final static double π = 3.141592653D;
    //拓展自己的方法
    @Override
    public double circular(double r) {
        return π * r * r;
    }

}

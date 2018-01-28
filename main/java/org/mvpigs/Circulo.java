package org.mvpigs;

public class Circulo {
    private double radio;
    private final double PI = Math.PI;

    public Circulo() {
        this.radio = 0.0d;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double area() {
        return PI * Math.pow( getRadio(), 2); 
    }


}
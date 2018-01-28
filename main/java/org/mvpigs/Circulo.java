package org.mvpigs;

public class Circulo extends FigurasGeometricas {
    private double radio;
    private final double PI = Math.PI;

    public Circulo() {
        super();
        this.radio = 0.0d;
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return PI * Math.pow( getRadio(), 2); 
    }


}
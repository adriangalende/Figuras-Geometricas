package org.mvpigs;

public class Cuadrado extends FigurasGeometricas{
    private double lado;

    public Cuadrado(){
        super();
        lado = 0.0d;
    }

    public Cuadrado(double lado){
        super();
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado){
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado * 2;
    }
}
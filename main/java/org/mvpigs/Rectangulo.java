package org.mvpigs;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(){
        base = 0.0d;
        altura = 0.0d;
    }

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double area(){
        return getBase() * getAltura();
    }
}
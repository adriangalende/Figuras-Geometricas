package org.mvpigs;

public class Rectangulo extends FigurasGeometricas {
    private double base;
    private double altura;

    public Rectangulo(){
        super();
        base = 0.0d;
        altura = 0.0d;
    }

    public Rectangulo(double base, double altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    @Override
    public double area(){
        return getBase() * getAltura();
    }
}
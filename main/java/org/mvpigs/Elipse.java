package org.mvpigs;

public class Elipse extends FigurasGeometricas{
    private double semiejeMayor;
    private double semiejeMenor;
    private final double PI = Math.PI;

    public Elipse(){
        super();
        semiejeMayor = 0.0d;
        semiejeMenor = 0.0d;
    }

    public Elipse(double semiejeMayor, double semiejeMenor){
        super();
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    public Elipse(String nombre, double semiejeMayor, double semiejeMenor){
        super(nombre);
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;   
    }

    public double getSemiejeMayor(){
        return semiejeMayor;
    }

    public double getSemiejeMenor(){
        return semiejeMenor;
    }


    public double area(){
        return PI * getSemiejeMayor() * getSemiejeMenor();
    }

}
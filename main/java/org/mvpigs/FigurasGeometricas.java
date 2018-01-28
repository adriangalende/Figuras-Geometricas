package org.mvpigs;

public abstract class FigurasGeometricas{
    private String nombre;

    public FigurasGeometricas(){
        nombre = "desconocido";
    }

    public FigurasGeometricas(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract double area();

}
package org.mvpigs;

import java.awt.Rectangle;

import org.junit.Test;
import org.mvpigs.*;

import static org.junit.Assert.assertEquals;

public class FigurasGeometricasTest{
    @Test
    public void objetosInstanciados(){
        Circulo circulo = new Circulo("Circulo", 2.3);
        Rectangulo rectangulo = new Rectangulo(4.0,3.0);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 4.0);
        Elipse elipse = new Elipse("Elipse", 2.0, 3.0);

        FigurasGeometricas[] listaFiguras = new FigurasGeometricas[]{circulo, rectangulo, cuadrado, elipse};
        
        for (FigurasGeometricas figura : listaFiguras){
            System.out.println(" El area de: " + figura.getNombre() + " = " + figura.area());
        }

    }

    @Test
    public void listaFigurasTest(){
        FigurasGeometricas[] listaFiguras = new FigurasGeometricas[6];

        Circulo primerCirculo = new Circulo(4.5);
        listaFiguras[0] = primerCirculo;

        Cuadrado primerCuadrado = new Cuadrado("Cuadrado", 4.5);
        listaFiguras[1] = primerCuadrado;

        Rectangulo primerRectangulo = new Rectangulo("Rectangulo", 4.0, 2.0);
        listaFiguras[2] = primerRectangulo;

        Rectangulo segundoRectangulo = new Rectangulo(5.0, 7.0);
        listaFiguras[3] = segundoRectangulo;

        Cuadrado segundoCuadrado = new Cuadrado(8.0);
        listaFiguras[4] = segundoCuadrado;

        Circulo segundoCirculo = new Circulo("Circulo", 3.0);
        listaFiguras[5] = segundoCirculo;

        for (FigurasGeometricas figura : listaFiguras){
            System.out.println(" El area de: " + figura.getNombre() + " = " + figura.area());   
        }

    }


}
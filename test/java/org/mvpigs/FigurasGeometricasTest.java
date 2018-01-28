package org.mvpigs;

import org.junit.Test;
import org.mvpigs.*;

import static org.junit.Assert.assertEquals;

public class FigurasGeometricasTest{
    @Test
    public void objetosInstanciados(){
        Circulo circulo = new Circulo("Circulo", 2.3);
        Rectangulo rectangulo = new Rectangulo(4.0,3.0);

        FigurasGeometricas[] listaFiguras = new FigurasGeometricas[]{circulo, rectangulo};
        
        for (FigurasGeometricas figura : listaFiguras){
            System.out.println(" El area de: " + figura.getNombre() + " = " + figura.area());
        }

    }


}
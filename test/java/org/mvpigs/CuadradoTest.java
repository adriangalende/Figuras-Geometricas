package org.mvpigs;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CuadradoTest{
    @Test
    public void crearCuadrado(){
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 5.0);
        assertEquals(10, cuadrado.area(), 0.01);
    }
}
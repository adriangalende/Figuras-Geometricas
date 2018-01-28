package org.mvpigs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectanguloTest {
    @Test
    public void calcularAreaRectanguloSinParametrosTest(){
        Rectangulo rectangulo = new Rectangulo();
        assertEquals(0.0, rectangulo.area(), 0.01);
    }
    @Test
    public void calcularAreaRectanguloTest() {
        Rectangulo rectangulo = new Rectangulo(3.0, 4.0);
        assertEquals(12.0, rectangulo.area(),0.01);
    }
}
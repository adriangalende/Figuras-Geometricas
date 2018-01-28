package org.mvpigs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CirculoTest {
    @Test
    public void calcularAreaTest() {
        Circulo circulo = new Circulo(3.0);
        assertEquals(28.27, circulo.area(), 0.01);
    }
}
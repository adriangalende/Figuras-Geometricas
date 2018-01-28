package org.mvpigs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class ElipseTest{
    @Test
    public void instanciarElipseTest(){
        Elipse elipse = new Elipse(3.0, 2.0);
        assertEquals(3.0, elipse.getSemiejeMayor());
        assertEquals(2.0, elipse.getSemiejeMenor());
    }

    
    @Test
    public void areaElipseTest(){
        Elipse elipse = new Elipse(3.0, 2.0);
        System.out.println("Area del elipse: " + elipse.area());
        assertEquals(18.85, elipse.area(), 0.01);
    }
}
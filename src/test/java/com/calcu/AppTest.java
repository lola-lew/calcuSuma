package com.calcu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * probando
     */

    @Test
    public void shouldAnswerWithTrue()
    {
        Calculadora calcu = new Calculadora();
        assertEquals(null, 2, calcu.calcu(1, 1));
    }
}

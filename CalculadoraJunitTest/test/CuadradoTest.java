/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.Cuadrado;
import Servicios.Calculos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alfredo Delnardo
 */
public class CuadradoTest {

    Calculos cuadrado_cal;

    public CuadradoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cuadrado_cal = new Calculos();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deberiaInicializarColor() {

        assertNotNull(new Cuadrado(5, 6).getColor());

    }

    @Test
    public void deberiaSerAmarillo() {
        Cuadrado c = new Cuadrado(1, 1);
        assertSame("amarillo", c.getColor());
    }

    @Test
    public void deberiaCalcularArea() {
        assertEquals(30, cuadrado_cal.calcularArea(new Cuadrado(5, 6)), 0);
        assertEquals(100, cuadrado_cal.calcularArea(new Cuadrado(10, 10)), 0);
    }

    @Test
    public void deberiaCalcularPerimetro() {
        assertEquals(22, cuadrado_cal.calcularPerimetro(new Cuadrado(5, 6)), 0);
        assertEquals(40, cuadrado_cal.calcularPerimetro(new Cuadrado(10, 10)), 0);
    }

}

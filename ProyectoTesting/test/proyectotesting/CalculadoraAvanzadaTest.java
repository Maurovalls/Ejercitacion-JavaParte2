/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pitu
 */
public class CalculadoraAvanzadaTest {
    
    public CalculadoraAvanzadaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testRaizCuadrada() {
        System.out.println("raizCuadrada");
        int a = 10;
        CalculadoraAvanzada instance = new CalculadoraAvanzada();
        double expResult = 3.16;
        double result = instance.raizCuadrada(a);
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testRaizCubica() {
        System.out.println("raizCubica");
        int a = 30;
        CalculadoraAvanzada instance = new CalculadoraAvanzada();
        double expResult = 3.10;
        double result = instance.raizCubica(a);
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCuadrado() {
        System.out.println("cuadrado");
        int a = 4;
        CalculadoraAvanzada instance = new CalculadoraAvanzada();
        double expResult = 16.0;
        double result = instance.cuadrado(a);
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testInversoMultiplicativo() {
        System.out.println("inversoMultiplicativo");
        int a = 5;
        CalculadoraAvanzada instance = new CalculadoraAvanzada();
        double expResult = 0.2;
        double result = instance.inversoMultiplicativo(a);
        assertEquals(expResult, result, 0.01);;
    }
    
}

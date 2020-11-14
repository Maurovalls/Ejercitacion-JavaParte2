
package proyectotesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
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
    public void testSumar() {
        System.out.println("sumar");
        int a = 2;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = 4;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);

    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 3;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);

    }

    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 2;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = 4;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);

    }

    @Test
    public void testDividir() throws Exception {
        System.out.println("dividir");
        float a = 8.0F;
        float b = 2.0F;
        Calculadora instance = new Calculadora();
        float expResult = 4.0F;
        float result = instance.dividir(a, b);
        assertEquals(expResult, result, 0.0);

    }
    
    
    @Test(expected=Exception.class)
    public void testDividir2() throws Exception {
        System.out.println("dividir");
        float a = 8.0F;
        float b = 0.0F;
        Calculadora instance = new Calculadora();
        float expResult = 4.0F;
        float result = instance.dividir(a, b);
        assertEquals(expResult, result, 0.0);
}
}
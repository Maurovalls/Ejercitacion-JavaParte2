
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
public class BurbujaTest {
    
    public BurbujaTest() {
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
    public void testOrdena() {

        System.out.println("ordena");

        Burbuja instance = new Burbuja();

        double[] result = instance.ordena();

        for(int i=0; i<result.length-1; i++) 
          assertTrue(  result[i] < result[i+1]  );
    }
    }
    


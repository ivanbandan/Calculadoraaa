/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IVAN
 */
public class calculadora2Test {
    
    public calculadora2Test() {
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

    /**
     * Test of calculadora method, of class calculadora2.
     */
    @Test
    public void testCalculadora() {
        System.out.println("calculadora");
        String memoria1 = "5";
        String memoria2 = "9";
        String signo = "*";
        String expResult = "45.0";
        String result = calculadora2.calculadora(memoria1, memoria2, signo);
        assertEquals(expResult, result);
    }

    /**
     * Test of existe_punto method, of class calculadora2.
     */
    @Test
    public void testExiste_punto() {
        System.out.println("existe_punto");
        String cadena = "23.4";
        boolean expResult = true;
        boolean result = calculadora2.existe_punto(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class calculadora2.
     */
    /*@Test
    /*public void testMain() {
        System.out.println("main");
        String[] args = null;
        calculadora2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
   
}

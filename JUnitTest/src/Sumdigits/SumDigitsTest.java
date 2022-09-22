package Sumdigits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class SumDigitsTest {

    public SumDigitsTest() {
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
         // Toma un valor entero como caso de prueba de entrada
      @Test
    public void testsumdigits1() {
                 System.out.println ("Prueba de un entero");
        SumDigits sum = new SumDigits();
        int expResult = 5;
        int result = sum.sum(5);
        assertEquals(expResult, result);
    }
    
         // Toma dos valores enteros como casos de prueba de entrada
          @Test
    public void testsumdigits2() {
                 System.out.println ("Prueba de entero de dos dígitos");
        SumDigits sum = new SumDigits();
        int expResult = 7;
        int result = sum.sum(25);
        assertEquals(expResult, result);
    }
    
         // Toma un valor entero de tres dígitos como caso de prueba de entrada
          @Test
    public void testsumdigits3() {
                 System.out.println ("Prueba de entero de tres dígitos");
        SumDigits sum = new SumDigits();
        int expResult = 6;
        int result = sum.sum(150);
        assertEquals(expResult, result);
    }
    
         // Casos de prueba que hacen que la prueba falle cuando el usuario ingresa un valor negativo
          @Test
    public void testsumdigits4() {
                 System.out.println ("La prueba de números negativos no pasa la prueba");
        SumDigits sum = new SumDigits();
        //  String expresult = null; 
        int expResult = -2;
        int result =sum.sum(-20);
        assertFalse(expResult==result);
    }
    
         // Manejar casos de prueba anormales cuando el usuario ingresa un valor decimal
    @Test
	public void testsumdigits5(){
         SumDigits sum = new SumDigits();
         int expResult = 6;
                   int result = sum.sum ((int) 150.00); // Forzar la conversión del tipo de datos
         assertEquals(expResult,result);        
        }

}

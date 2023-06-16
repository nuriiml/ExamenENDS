package Ejercicio2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class OrdinariaENDETest {

	
	@Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
            //Pruebas
        	{"¡arriba la birra!"},
        	{"reconocer"},
        	{"Isaac no ronca así"},
        	
        	
        });
    }
    
    public static void main(String[] args) {
    //me falta crear algo para llamar a las cosas
    }
    

	@SuppressWarnings("static-access")
	@Test
    public void procesarfrase1Test(String palabra) {
       OrdinariaENDE frase = new OrdinariaENDE();
        boolean resultado = frase.esPalindromo(palabra);
        assertEquals("¡arriba la birra!", resultado);
    }
    
    @SuppressWarnings("static-access")
	@Test
    public void procesarfrase2Test(String palabra) {
       OrdinariaENDE frase = new OrdinariaENDE();
        boolean resultado = frase.esPalindromo(palabra);
        assertEquals("reocnocer", resultado);
    }
    @SuppressWarnings("static-access")
	@Test
    public void procesarfrase3Test(String palabra) {
       OrdinariaENDE frase = new OrdinariaENDE();
        boolean resultado = frase.esPalindromo(palabra);
        assertEquals("Isaac no ronca así", resultado);
    }

	
    @SuppressWarnings("static-access")
  	@Test
      public void procesaracentos1Test(String palabra) {
         OrdinariaENDE frase = new OrdinariaENDE();
         String resultado = frase.quitarAcentos(palabra);
          assertEquals("¡arriba la birra!", resultado);
      }
      
      @SuppressWarnings("static-access")
  	@Test
      public void procesaracentosTest(String palabra) {
         OrdinariaENDE frase = new OrdinariaENDE();
         String resultado = frase.quitarAcentos(palabra);
          assertEquals("reocnocer", resultado);
      }
      @SuppressWarnings("static-access")
  	@Test
      public void procesaracentos3Test(String palabra) {
         OrdinariaENDE frase = new OrdinariaENDE();
          String resultado = frase.quitarAcentos(palabra);
          assertEquals("Isaac no ronca así", resultado);
      }

	
    

}

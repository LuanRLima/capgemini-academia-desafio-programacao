package com.capgemini.desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

   @Test
   public void testeConstruirDegraus() {
      String esperado = "    *\n" + "   **\n" + "  ***\n" + " ****\n" + "*****";
      assertEquals(esperado, App.construirDegraus(5));
   }
   @Test
   public void testeFalharConstruirDegraus(){
        String esperado = "    *\n" + "   **\n" + "  ***\n" + " ****\n" + "*****";
        assertNotEquals(esperado, App.construirDegraus(4));
   }

}

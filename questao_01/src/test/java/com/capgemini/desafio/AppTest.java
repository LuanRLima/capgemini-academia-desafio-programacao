package com.capgemini.desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

/**
 * Classe onde vai ser executado os testes.
 * @author Luan Rodrigues Lima
 */
public class AppTest {
   /**
    * Método que testa  o metodo construirDegraus se ele é igual ao esperado, é passado um valor e se retorna false o metodo esta com alguma erro. .
    */
   @Test
   public void testeConstruirDegraus() {
      String esperado = "    *\n" + "   **\n" + "  ***\n" + " ****\n" + "*****";
      assertEquals(esperado, App.construirDegraus(5));
   }
   /**
    * Método que testa  o metodo construirDegraus se ele é diferente ao esperado, é passado um valor e se retorna true o metodo esta com alguma erro.
    */
   @Test
   public void testeFalharConstruirDegraus() {
      String esperado = "    *\n" + "   **\n" + "  ***\n" + " ****\n" + "*****";
      assertNotEquals(esperado, App.construirDegraus(4));
   }

}

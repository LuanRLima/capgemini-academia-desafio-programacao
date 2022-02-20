package com.capgemini.dasafio;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ValidarCaractereMinimoTest {
     
    /**
     * Método de teste criamos uma senha para validar o  método validacaoCaractaresMinimo estamos esperando true se não retorna true o metodo esta com alguma erro.
     */
    @Test
    public void testeValidarCaractereMinimo() {
        String senha = "123456";
        assertTrue(App.validacaoCaractaresMinimo(senha));
    }
    
    /**
     * Método de teste criamos uma senha para validar o  método validacaoCaractaresMinimo estamos esperando false se não retorna false o metodo esta com alguma erro.
     */
    @Test
    public void falharTesteValidarCaractereMinimo() {
        String senha = "12345";
       
        assertTrue(!App.validacaoCaractaresMinimo(senha));
    }
    
}

  





    





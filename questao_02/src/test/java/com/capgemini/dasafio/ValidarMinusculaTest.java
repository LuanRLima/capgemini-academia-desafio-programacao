package com.capgemini.dasafio;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ValidarMinusculaTest {
    /**
     * Método de teste informamos um char 'a' para efetuar validação e false para informar que a senha não possui nenhuma letra maiuscula validada, para validar o  método validacaoMaiuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarMinuscula() {
        assertTrue(App.validacaoMinuscula('a', false));
    }
    /**
     * Método de teste informamos um char 'a' para efetuar validação e true para informar que a senha possui uma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarMinusculaAchouMinusculaVerdadeiro() {
        assertTrue(App.validacaoMinuscula('a', true));
    }
    /**
     * Método de teste informamos um char 'A' para efetuar validação e true para informar que a senha possui uma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarMinusculaAchouMinusculaVerdadeiroPassandoCharNaoMinuscula() {
        assertTrue(App.validacaoMinuscula('A', true));
    }
    /**
     * Método de teste informamos um char 'A' para efetuar validação e false para informar que a senha não possui nenhuma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando false se não retorna false o método esta com alguma erro.
     */
    @Test
    public void falharTesteValidarMinusculaCharErrado() {
        assertTrue(!App.validacaoMinuscula('A', false));
    }
        
}

  





    





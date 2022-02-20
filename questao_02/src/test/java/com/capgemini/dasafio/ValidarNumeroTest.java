package com.capgemini.dasafio;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Classe onde vai ser executado os testes validar numeros.
 */
public class ValidarNumeroTest {
   
    /**
     * Método de teste informamos um char '1' para efetuar validação e false para informar que a senha não possui nenhum numero validado, para validar o  método validacaoNumero estamos esperando true se não retorna true o metodo esta com alguma erro.
     * @author Luan Rodrigues Lima
     */
    @Test
    public void testeValidarNumero() {
        assertTrue(App.validacaoNumero('1', false));
    }
    /**
     * Método de teste  informamos um char '4' para efetuar validação e true para informar que a senha possui um numero validado, para validar o  método validacaoNumero estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarNumeroAchouNumeroVerdadeiro() {
        assertTrue(App.validacaoNumero('4', true));
    }
    /**
     * Método de teste informamos um char 'a' para efetuar validação e true para informar que a senha  possui um numero validado, para validar o  método validacaoNumero estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarNumeroAchouNumeroVerdadeiroPassandoCharNaoNumero() {
        assertTrue(App.validacaoNumero('a', true));
    }
    /**
     * Método de teste informamos um char 'a' para efetuar validação e false para informar que a senha não possui nenhum numero validado, para validar o  método validacaoNumero estamos esperando false se não retorna false o método esta com alguma erro.
     */
    @Test
    public void falharTesteValidarNumeroCharErrado() {
        assertTrue(!App.validacaoNumero('a', false));
    }
        
}

  





    





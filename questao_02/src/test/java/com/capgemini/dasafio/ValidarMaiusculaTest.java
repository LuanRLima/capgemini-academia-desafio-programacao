package com.capgemini.dasafio;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
/**
 * Classe onde vai ser executado os testes validar letras Maiusculas.
 */
public class ValidarMaiusculaTest {
    /**
     * Método de teste informamos um char 'A' para efetuar validação e false para informar que a senha não possui nenhum numero validado, para validar o  método validacaoNumero estamos esperando true se não retorna true o método esta com alguma erro.
     * @author Luan Rodrigues Lima
     */
    @Test
    public void testeValidarMaiuscula() {
        assertTrue(App.validacaoMaiuscula('A', false));
    }
    /**
     * Método de teste informamos um char 'A' para efetuar validação e true para informar que a senha possui uma letra maiuscula validada, para validar o  método validacaoMaiuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarMaiusculaAchouMaiusculaVerdadeiro() {
        assertTrue(App.validacaoMaiuscula('A', true));
    }
    /**
     * Método de teste informamos um char 'a' para efetuar validação e true para informar que a senha possui uma letra maiuscula validada, para validar o  método validacaoMaiuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarMaiusculaAchouMaiusculaVerdadeiroPassandoCharNaoMaiuscula() {
        assertTrue(App.validacaoMaiuscula('a', true));
    }
    /**
     * Método de teste informamos um char 'a' para efetuar validação e false para informar que a senha não possui nenhuma letra maiuscula validada, para validar o  método validacaoMaiuscula estamos esperando false se não retorna false o método esta com alguma erro.
     */
    @Test
    public void falharTesteValidarMaiusculaCharErrado() {
        assertTrue(!App.validacaoMaiuscula('a', false));
    }
        
}

  





    





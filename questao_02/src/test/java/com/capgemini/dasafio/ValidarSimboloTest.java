package com.capgemini.dasafio;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
/**
 * Classe de teste para validar o método validacaoCaracteresEspeciais.
 */
public class ValidarSimboloTest {
    
    /**
     * Método de testeValidarSimbolo informamos uma senha "201@3' para efetuar validação e false para informar que a senha não possui nenhuma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando true se não retorna true o método esta com alguma erro.
     * @author Luan Rodrigues Lima
     */
    @Test
    public void testeValidarSimbolo() {
        assertTrue(App.validacaoSimbolo("201@3"));
    }
    /**
     * Método de testeValidarSimbolo informamos uma senha "-' para efetuar validação e false para informar que a senha não possui uma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarSimbolo2() {
        assertTrue(App.validacaoSimbolo("-"));
    }
    /**
     * Método de testeValidarSimbolo informamos uma senha "@" para efetuar validação e true para informar que a senha possui uma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarSimboloAchouSimboloVerdadeiro() {
        assertTrue(App.validacaoSimbolo("@"));
    }
    /**
     * Método de testeValidarSimbolo informamos uma senha "ae" para efetuar validação e false para informar que a senha não possui uma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando false se não retorna false o método esta com alguma erro.
     */
    @Test
    public void falharTesteValidarSimboloCharErrado() {
        assert(!App.validacaoSimbolo("ae"));
    }
        
}

  





    





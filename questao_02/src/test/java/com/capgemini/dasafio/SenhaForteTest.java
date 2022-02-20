package com.capgemini.dasafio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SenhaForteTest {
    /**
     * Método que testa a o senhaForte, passamos uma senha que atende a todas as condições e esperamos que retorne true, para validar o método estamos esperando resultado igual  true se não retorna  igual true o método esta com alguma erro.
     */
    @Test
    public void testSenhaForte(){
        String senha = "Lu-310";
        assertEquals(true,App.senhaForte(senha));
    }
    /**
     * Método que testa a o senhaForte, passamos uma senha que não atende a todas as condições e esperamos que retorne false, para validar o método estamos esperando resultado igual  false se não retorna  igual false o método esta com alguma erro.
     */
    @Test
    public void testSenhaFraca(){
        String senha = "Lu-3";
        assertEquals(false,App.senhaForte(senha));
    }
    /**
     * Método que testa a o senhaFore, passamos uma senha que não atende a todas as condições e esperamos que retorne false, para validar o método estamos esperando resultado igual  false se não retorna  igual false o método esta com alguma erro.
     */
    @Test
    public void testSenhaFraca2(){
        String senha = " Lu-3  ";
        assertEquals(false,App.senhaForte(senha));
    }
}

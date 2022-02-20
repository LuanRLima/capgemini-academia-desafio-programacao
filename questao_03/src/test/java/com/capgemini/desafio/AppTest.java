package com.capgemini.desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Classe onde é executado os testes.
 */
public class AppTest {
    /**
     * Método que testa  a quantidadeAnagramas, passamos a palavra "ovo" e esperamos que retorne a quantidade de anagramas pares de si mesma, para validar o método estamos esperando resultado igual  3 se não retorna  igual 3 o método esta com alguma erro.
     */
    @Test
    public  void  testandoQuantidadeAnagramasPossiveis (){
        assertEquals( 2 , App.quantidadeAnagramas("ovo")); 
    }
    /**
     * Método que testa  a quantidadeAnagramas, passamos a palavra "ovo" e esperamos que retorne a quantidade de anagramas pares de si mesma, para validar o método estamos esperando resultado  não seja 3 se o resultado for 3 o método está com alguma erro.
     */
    @Test
    public  void  testandoFalhaQuantidadeAnagramasPossiveis (){
        assertNotEquals( 3 , App.quantidadeAnagramas("ovo")); 
    }
    /**
     * Método que testa  a quantidadeAnagramas, passamos a palavra "ifailuhkqq" e esperamos que retorne a quantidade de anagramas pares de si mesma, para validar o método estamos esperando resultado igual  3 se não retorna  igual 3 o método esta com alguma erro.
     */
    @Test
    public  void  testandoQuantidadeAnagramasPossiveis2 (){
        assertEquals( 3, App.quantidadeAnagramas("ifailuhkqq")); 
    }
    /**
     * Método que testa  a quantidadeAnagramas, passamos a palavra "ifailuhkqq" e esperamos que retorne a quantidade de anagramas pares de si mesma, para validar o método estamos esperando resultado não pode ser  2 se for igual a 2 o método esta com alguma erro.
     */
    @Test
    public  void  testandoFalhaQuantidadeAnagramasPossiveis2 (){
        assertNotEquals( 2 , App.quantidadeAnagramas("ifailuhkqq")); 
    }
    /**
     * Método que testa  criandoPossibilidadeAnagramas passamos uma lista de string possiveis anagramas de si mesma e esperamos que retorne uma lista de possibilidades de anagramas, para validar o método estamos esperando resultado igual  ["o", "ov", "ovo", "v", "vo", "o"] se não retorna  igual o método esta com alguma erro.
     */
    @Test
    public  void  testandoCriaçãoPossibilidadesAnagramasPossiveis (){
        List<String> listaEsperada = Arrays.asList("o", "ov", "ovo", "v", "vo", "o");
        assertTrue(App.criandoPossibilidadeAnagramas("ovo").containsAll(listaEsperada));  
    }
    /**
     * Método que testa  criandoPossibilidadeAnagramas passamos uma lista de string possiveis anagramas de si mesma e esperamos que retorne uma lista de possibilidades de anagramas, para validar o método estamos esperando resultado não pode ser  ["o", "ov", "ovo", "v", "vo", "o"] se for igual a ["o", "ov", "ovo", "v", "vo", "o"] o método esta com alguma erro.
     */
    @Test
    public  void  testandoFalhaCriacaoPossibilidadesAnagramasPossiveis (){
        List<String> listaEsperada = Arrays.asList("o", "ov", "ovo", "v", "vo", "o");
        assertFalse(App.criandoPossibilidadeAnagramas("ovi").containsAll(listaEsperada));  
    }
    /**
     * Método que testandoValidandacaoAnagrama passamos 2 palavras que são anagramas de si, com o mesmo tamanho e esperamos que retorne true se não retorna true o método esta com alguma erro.
     */
    @Test
    public  void  testandoValidandacaoAnagrama (){
        assertEquals( true , App.validacoesAnagramas("vo", "ov")); 
    }
    /**
     * Método que testandoValidandacaoAnagrama passamos 2 palavras que não são anagramas de si, com o mesmo tamanho e esperamos que retorne false se não retorna false o método esta com alguma erro.
     */
    @Test
    public  void  testandoFalhaValidandacaoAnagrama (){
        assertNotEquals( true , App.validacoesAnagramas("vi", "ov")); 
    }
    

   
    



}

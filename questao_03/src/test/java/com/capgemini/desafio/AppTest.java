package com.capgemini.desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public  void  testandoQuantidadeAnagramasPossiveis (){
        assertEquals( 2 , App.quantidadeAnagramas("ovo")); 
    }
    @Test
    public  void  testandoFalhaQuantidadeAnagramasPossiveis (){
        assertNotEquals( 3 , App.quantidadeAnagramas("ovo")); 
    }
    @Test
    public  void  testandoCriaçãoPossibilidadesAnagramasPossiveis (){
        List<String> listaEsperada = Arrays.asList("o", "ov", "ovo", "v", "vo", "o");
        assertTrue(App.criandoPossibilidadeAnagramas("ovo").containsAll(listaEsperada));  
    }
    @Test
    public  void  testandoFalhaCriacaoPossibilidadesAnagramasPossiveis (){
        List<String> listaEsperada = Arrays.asList("o", "ov", "ovo", "v", "vo", "o", "vi","iv");
        assertFalse(App.criandoPossibilidadeAnagramas("ovo").containsAll(listaEsperada));  
    }
    @Test
    public  void  testandoValidandacaoAnagrama (){
        assertEquals( true , App.validacoesAnagramas("vo", "ov")); 
    }
    @Test
    public  void  testandoFalhaValidandacaoAnagrama (){
        assertNotEquals( true , App.validacoesAnagramas("vi", "ov")); 
    }
    

   
    



}

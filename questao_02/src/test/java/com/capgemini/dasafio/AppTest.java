package com.capgemini.dasafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testeValidarCaractereMinimo() {
        String senha = "123456";
        assertTrue(App.validacaoCaractaresMinimo(senha));
    }
    @Test
    public void falharTesteValidarCaractereMinimo() {
        String senha = "12345";
       
        assertTrue(!App.validacaoCaractaresMinimo(senha));
    }

    @Test
    public void testeValidarNumero() {
        assertTrue(App.validacaoNumero('1', false));
    }
    @Test
    public void testeValidarNumeroAchouNumeroVerdadeiro() {
        assertTrue(App.validacaoNumero('4', true));
    }
    @Test
    public void testeValidarNumeroAchouNumeroVerdadeiroPassandoCharNaoNumero() {
        assertTrue(App.validacaoNumero('a', true));
    }

    @Test
    public void falharTesteValidarNumeroCharErrado() {
        assertTrue(!App.validacaoNumero('a', false));
    }

    @Test
    public void testeValidarMaiuscula() {
        assertTrue(App.validacaoMaiuscula('A', false));
    }
    @Test
    public void testeValidarMaiusculaAchouMaiusculaVerdadeiro() {
        assertTrue(App.validacaoMaiuscula('A', true));
    }
    @Test
    public void testeValidarMaiusculaAchouMaiusculaVerdadeiroPassandoCharNaoMaiuscula() {
        assertTrue(App.validacaoMaiuscula('a', true));
    }
    @Test
    public void falharTesteValidarMaiusculaCharErrado() {
        assertTrue(!App.validacaoMaiuscula('a', false));
    }

    @Test
    public void testeValidarMinuscula() {
        assertTrue(App.validacaoMinuscula('a', false));
    }

    @Test
    public void testeValidarMinusculaAchouMinusculaVerdadeiro() {
        assertTrue(App.validacaoMinuscula('a', true));
    }

    @Test
    public void testeValidarMinusculaAchouMinusculaVerdadeiroPassandoCharNaoMinuscula() {
        assertTrue(App.validacaoMinuscula('A', true));
    }

    @Test
    public void falharTesteValidarMinusculaCharErrado() {
        assertTrue(!App.validacaoMinuscula('A', false));
    }

    @Test
    public void testeValidarSimbolo() {
        assertTrue(App.validacaoSimbolo("201@3", false));
    }@Test
    public void testeValidarSimbolo2() {
        assertTrue(App.validacaoSimbolo("-", false));
    }
    @Test
    public void testeValidarSimboloAchouSimboloVerdadeiro() {
        assertTrue(App.validacaoSimbolo("@", true));
    }
    @Test
    public void testeValidarSimboloAchouSimboloVerdadeiroPassandoCharNaoSimbolo() {
        assertTrue(!App.validacaoSimbolo("a", true));
    }
    @Test
    public void falharTesteValidarSimboloCharErrado() {
        assert(!App.validacaoSimbolo("a", false));
    }

    @Test
    public void testeMensagemRetornoSenhaForteOk(){
        String retorno = App.mensagemRetorno(true,
        true,
        true,
        true,
        true,
        "Lu-310",
        0);
        String retornoEsperado = "Senha forte";
        assertEquals(retornoEsperado,retorno);
    }
    @Test
    public void testeFalhandoMensagemRetornoSenhaForteOk(){
        String retorno = App.mensagemRetorno(true,
        true,
        true,
        true,
        true,
        "Lu-310",
        0);
        String retornoEsperado = "Senha fraca acresente mais 6 caracteres\n"+
                                 "Senha deve conter pelo menos um número\n"+ 
                                 "Senha deve conter pelo menos uma letra maiúscula\n"+
                                 "Senha deve conter pelo menos uma letra minúscula\n"+
                                 "Senha deve conter pelo menos um símbolo\n";
        assertNotEquals(retornoEsperado,retorno);
        
    }

    @Test
    public void testeMensagemRetornoMinimoCaracteres(){
        String retorno = App.mensagemRetorno(false,
        true,
        true,
        true,
        true,
        "Lu-3",
        2);
        String retornoEsperado = "Senha fraca acresente mais 2 caracteres\n";
        assertEquals(retornoEsperado,retorno);
    }
    @Test
    public void testeFalhandoMensagemRetornoMinimoCaracteres(){
        String retorno = App.mensagemRetorno(false,
        true,
        true,
        true,
        true,
        "Lu-3",
        2);
        String retornoEsperado = "Senha forte";
        assertNotEquals(retornoEsperado,retorno);
        
    }
    @Test
    public void testeMensagemRetornoAchouNumero(){
        String retorno = App.mensagemRetorno(true,
        false,
        true,
        true,
        true,
        "Lu33",
        2);
        String retornoEsperado = "Senha deve conter pelo menos um número\n";
        assertEquals(retornoEsperado,retorno);
    }
    @Test
    public void testeFalhandoMensagemRetornoAchouNumero(){
        String retorno = App.mensagemRetorno(true,
        false,
        true,
        true,
        true,
        "Lu33",
        2);
        String retornoEsperado = "Senha forte";
        assertNotEquals(retornoEsperado,retorno);
        
    }
    @Test
    public void testeMensagemRetornoAchouMaiuscula(){
        String retorno = App.mensagemRetorno(true,
        true,
        false,
        true,
        true,
        "lu-33",
        1);
        String retornoEsperado = "Senha deve conter pelo menos uma letra maiúscula\n";
        assertEquals(retornoEsperado,retorno);
    }
    @Test
    public void testeFalhandoMensagemRetornoAchouMaiuscula(){
        String retorno = App.mensagemRetorno(true,
        true,
        false,
        true,
        true,
        "lu-33",
        1);
        String retornoEsperado = "Senha forte";
        assertNotEquals(retornoEsperado,retorno);
        
    }
    @Test
    public void testeMensagemRetornoAchouMinuscula(){
        String retorno = App.mensagemRetorno(true,
        true,
        true,
        false,
        true,
        "LU-333",
        0);
        String retornoEsperado = "Senha deve conter pelo menos uma letra minúscula\n";
        assertEquals(retornoEsperado,retorno);
    }
    @Test
    public void testeFalhandoMensagemRetornoAchouMinuscula(){
        String retorno = App.mensagemRetorno(true,
        true,
        true,
        false,
        true,
        "LU-333",
        3);
        String retornoEsperado = "Senha forte";
        assertNotEquals(retornoEsperado,retorno);
        
    }
    @Test
    public void testeMensagemRetornoAchouSimbolo(){
        String retorno = App.mensagemRetorno(true,
        true,
        true,
        true,
        false,
        "LU-",
        3);
        String retornoEsperado = "Senha deve conter pelo menos um símbolo\n";
        assertEquals(retornoEsperado,retorno);
    }
    @Test
    public void testeFalhandoMensagemRetornoAchouSimbolo(){
        String retorno = App.mensagemRetorno(true,
        true,
        true,
        true,
        false,
        "LU-",
        3);
        String retornoEsperado = "Senha forte";
        assertNotEquals(retornoEsperado,retorno);
        
    }

    @Test
    public void testeMensagemRetornoSenhaMaisFracaPossivel(){
        String retorno = App.mensagemRetorno(false,
        false,
        false,
        false,
        false,
        "",
        6);
        String retornoEsperado = "Senha fraca acresente mais 6 caracteres\n"+
                                 "Senha deve conter pelo menos um número\n"+ 
                                 "Senha deve conter pelo menos uma letra maiúscula\n"+
                                 "Senha deve conter pelo menos uma letra minúscula\n"+
                                 "Senha deve conter pelo menos um símbolo\n";
        assertEquals(retornoEsperado,retorno);
    }
    @Test
    public void testSenhaForte(){
        String senha = "Lu-310";
        assertEquals(true,App.senhaForte(senha));
    }
    @Test
    public void testSenhaFraca(){
        String senha = "Lu-3";
        assertEquals(false,App.senhaForte(senha));
    }
    @Test
    public void testSenhaFraca2(){
        String senha = " Lu-3  ";
        assertEquals(false,App.senhaForte(senha));
    }
}

  





    





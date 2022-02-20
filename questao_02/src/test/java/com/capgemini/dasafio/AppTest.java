package com.capgemini.dasafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    /**
     * Método de teste criamos uma senha para validar o  método validacaoCaractaresMinimo estamos esperando true se não retorna true o metodo esta com alguma erro.
     * 
     * @param args
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
    /**
     * Método de teste informamos um char '1' para efetuar validação e false para informar que a senha não possui nenhum numero validado, para validar o  método validacaoNumero estamos esperando true se não retorna true o metodo esta com alguma erro.
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
    /**
     * Método de teste informamos um char 'A' para efetuar validação e false para informar que a senha não possui nenhum numero validado, para validar o  método validacaoNumero estamos esperando true se não retorna true o método esta com alguma erro.
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
    /**
     * Método de testeValidarSimbolo informamos uma senha "201@3' para efetuar validação e false para informar que a senha não possui nenhuma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarSimbolo() {
        assertTrue(App.validacaoSimbolo("201@3", false));
    }
    /**
     * Método de testeValidarSimbolo informamos uma senha "-' para efetuar validação e false para informar que a senha não possui uma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarSimbolo2() {
        assertTrue(App.validacaoSimbolo("-", false));
    }
    /**
     * Método de testeValidarSimbolo informamos uma senha "@" para efetuar validação e true para informar que a senha possui uma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarSimboloAchouSimboloVerdadeiro() {
        assertTrue(App.validacaoSimbolo("@", true));
    }
    /**
     * Método de testeValidarSimbolo informamos uma senha "ae" para efetuar validação e true para informar que a senha possui uma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando true se não retorna true o método esta com alguma erro.
     */
    @Test
    public void testeValidarSimboloAchouSimboloVerdadeiroPassandoCharNaoSimbolo() {
        assertTrue(App.validacaoSimbolo("ae", true));
    }
    /**
     * Método de testeValidarSimbolo informamos uma senha "ae" para efetuar validação e false para informar que a senha não possui uma letra minuscula validada, para validar o  método validacaoMinuscula estamos esperando false se não retorna false o método esta com alguma erro.
     */
    @Test
    public void falharTesteValidarSimboloCharErrado() {
        assert(!App.validacaoSimbolo("ae", false));
    }
    /**
     * Método de testeMensagemRetornoSenhaForteOk informamos uma senha "Lu-310' e alguns dados para efetuar validação e retorna a mensagem "Senha Forte" para validar o  método mensagemRetornoSenhaForte estamos esperando "Senha Forte" se não retorna "Senha Fraca" o método esta com alguma erro.
     */
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
    /**
     * Método de testeFalhandoMensagemRetornoSenhaForteOk informamos uma senha "Lu-310' e alguns dados para efetuar validação e retorna a mensagem "Senha fraca etc." para validar o  método mensagemRetornoSenhaForte estamos esperando "Senha Fraca etc." se não retorna "Senha fraca etc." o método esta com alguma erro.
     */
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
    /**
     * Método de testeMensagemRetornoMinimoCaracteres informamos uma senha "Lu-3' e alguns dados para efetuar validação e retorna a mensagem "Senha fraca acresente mais 2 caracteres" para validar o  método mensagemRetornoSenhaForte estamos esperando "Senha Fraca etc." se não retorna "Senha fraca etc." o método esta com alguma erro.
     */
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
    /**
     * Método de esteFalhandoMensagemRetornoMinimoCaracteres informamos uma senha "Lu-3' e alguns dados para efetuar validação e retorna a mensagem "Senha forte acresente mais 2 caracteres" para validar o  método mensagemRetornoSenhaForte estamos esperando resultado diferente de "Senha forte" se não retorna  diferente "Senha forte"." o método esta com alguma erro.
     */
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

  





    





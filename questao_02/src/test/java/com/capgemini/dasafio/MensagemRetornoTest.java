package com.capgemini.dasafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class MensagemRetornoTest  {
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
     * Método de testeFalhandoMensagemRetornoMinimoCaracteres informamos uma senha "Lu-3' e alguns dados para efetuar validação e retorna a mensagem diferente da "Senha forte", para validar o  método estamos esperando resultado diferente de "Senha forte" se não retorna  diferente "Senha forte" o método esta com alguma erro.
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
    /**
     * Método de testeMensagemRetornoAchouNumero informamos uma senha "Lu33' e alguns dados para efetuar validação e retorna a mensagem "Senha deve conter pelo menos um número\n", para validar o método estamos esperando resultado igual de "Senha deve conter pelo menos um número\n" se não retorna  diferente "Senha deve conter pelo menos um número\n" o método esta com alguma erro.
     */
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
    /**
     * Método de testeFalhandoMensagemRetornoAchouNumero informamos uma senha "Lu33' e alguns dados para efetuar validação e retorna a mensagem diferente da "Senha forte", para validar o método estamos esperando resultado diferente de "Senha forte" se não retorna  diferente "Senha forte" o método esta com alguma erro.
     */
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
    /**
     * Método de testeMensagemRetornoAchouMaiuscula informamos uma senha "lu-33' e alguns dados para efetuar validação e retorna a mensagem "Senha deve conter pelo menos uma letra maiúscula\n", para validar o método estamos esperando resultado igual de "Senha deve conter pelo menos uma letra maiúscula\n" se não retorna  igual "Senha deve conter pelo menos uma letra maiúscula\n" o método esta com alguma erro.
     */
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
    /**
     * Método de testeFalhandoMensagemRetornoAchouMaiuscula informamos uma senha "lu-33' e alguns dados para efetuar validação e retorna a mensagem diferente da "Senha forte", para validar o método estamos esperando resultado diferente de "Senha forte" se não retorna  diferente "Senha forte" o método esta com alguma erro.
     */
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
    /**
     * Método de testeMensagemRetornoAchouLetraMinuscula informamos uma senha "LU-33' e alguns dados para efetuar validação e retorna a mensagem "Senha deve conter pelo menos uma letra minúscula\n", para validar o método estamos esperando resultado igual de "Senha deve conter pelo menos uma letra minúscula\n" se não retorna  igual "Senha deve conter pelo menos uma letra minúscula\n" o método esta com alguma erro.
     */
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
    /**
     * Método de testeFalhandoMensagemRetornoAchouMinuscula informamos uma senha "LU-333' e alguns dados para efetuar validação e retorna a mensagem diferente da "Senha forte", para validar o método estamos esperando resultado diferente de "Senha forte" se não retorna  diferente "Senha forte" o método esta com alguma erro.
     */
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
    /**
     * Método de testeMensagemRetotnoAchouSimbolo informamos uma senha "LU-' e alguns dados para efetuar validação e retorna a mensagem "Senha deve conter pelo menos um símbolo\n", para validar o método estamos esperando resultado igual de "Senha deve conter pelo menos um símbolo\n" se não retorna  igual "Senha deve conter pelo menos um símbolo\n" o método esta com alguma erro.
     */
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
    /**
     * Método de testeFalhandoMensagemRetotnoAchouSimbolo informamos uma senha "LU-' e alguns dados para efetuar validação e retorna a mensagem diferente da "Senha forte", para validar o método estamos esperando resultado diferente de "Senha forte" se não retorna  diferente "Senha forte" o método esta com alguma erro.
     */
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
    /**
     * Método testeMensagemRetornoSenhaMaisFracaPossivel informamos a possibilidade da senha mais fraca possivel e assim, esperamos que retorne a mensagem "Senha muito fraca, tente outra senha\n", para validar o método estamos esperando resultado igual de "Senha muito fraca, tente outra senha\n" se não retorna  igual o método esta com algum erro.
     */
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
    
}

  





    





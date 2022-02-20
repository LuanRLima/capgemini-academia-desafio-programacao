package com.capgemini.dasafio;

import java.util.Scanner;

/**
 * Classe onde serão realizadas as validações de senha.
 */
public class App {

    /**
     * Método principal onde o programa é executado.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        do {
            System.out.println("Digite a senha:");
            senha = sc.next();
            System.out.println();
        } while (!senhaForte(senha));

        sc.close();
    }

    /**
     * Método que verifica se a senha é forte e retorna true ou false,
     * imprime a mensagem de acordo com o resultado informando, o que é necessário
     * para que a senha seja forte:
     * 
     * possui no mínimo 6 caracteres,
     * contém no mínimo 1 digito,
     * contém no mínimo 1 letra em minúsculo,
     * contém no mínimo 1 letra em maiúsculo,
     * contém no mínimo 1 caractere especial os caracteres especiais são:* !@#$%^&*()-+
     * 
     * @param senha - String que representa a senha
     * @return boolean - Retorna true se a senha atender todas recomedaçõe e false
     *         se não atender
     * 
     */
    public static boolean senhaForte(String senha) {
        senha = senha.replace(" ", "");

        int quantidadeCharFaltaSenhaForte = (6 - senha.length());
        boolean minimoCaracteres = validacaoCaractaresMinimo(senha);
        boolean achouNumero = false;
        boolean achouMaiuscula = false;
        boolean achouMinuscula = false;
        boolean achouSimbolo = false;

        for (char c : senha.toCharArray()) {

            achouNumero = validacaoNumero(c, achouNumero);
            achouMaiuscula = validacaoMaiuscula(c, achouMaiuscula);
            achouMinuscula = validacaoMinuscula(c, achouMinuscula);
        }
        achouSimbolo = validacaoSimbolo(senha, achouSimbolo);

        System.out.println(mensagemRetorno(minimoCaracteres,
                achouNumero,
                achouMaiuscula,
                achouMinuscula,
                achouSimbolo,
                senha,
                quantidadeCharFaltaSenhaForte));

        return minimoCaracteres && achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
    }

    /**
     * Método que verifica se a senha possui o mínimo de caracteres necessários para
     * que seja forte.
     * 
     * @param senha - String que representa a senha
     * @return boolean - Retorna true se a senha possui o mínimo de caracteres
     *         necessários para que seja forte e false se não possuir.
     */
    public static boolean validacaoCaractaresMinimo(String senha) {
        if (senha.length() < 6) 
            return false;
       
        return true;
        
    }

    /**
     * Método que verifica se a senha possui o mínimo de numeros necessários para
     * que seja forte.
     * 
     * @param ch          - Representa o caractere da senha
     * @param achouNumero - boolean que representa se a senha já possui o mínimo de
     *                    numeros necessários para que seja forte, se já tiver passa
     *                    para true
     * @return boolean - Retorna true se a senha possuir o mínimo de numeros
     *         necessários para que seja forte e false se não possuir.
     */
    public static boolean validacaoNumero(char ch, Boolean achouNumero) {

        if (ch >= '0' && ch <= '9')
            return true;

        return achouNumero;

    }

    /**
     * Método que verifica se a senha possui o mínimo de letras maiusculas
     * necessários para que seja forte.
     * 
     * @param ch             - Representa o caractere da senha
     * @param achouMaiuscula - boolean que representa se a senha já possui o mínimo
     *                       de letras maiusculas necessários para que seja forte,
     *                       se já tiver passa para true
     * @return boolean - Retorna true se a senha possuir o mínimo de letras
     *         maiusculas necessários para que seja forte e false se não possuir.
     */
    public static boolean validacaoMaiuscula(char ch, Boolean achouMaiuscula) {
        if (ch >= 'A' && ch <= 'Z') 
            return true;

        return achouMaiuscula;
    }

    /**
     * Método que verifica se a senha possui o mínimo de letras minusculas
     * necessários para que seja forte.
     * 
     * @param ch             - Representa o caractere da senha.
     * @param achouMinuscula - boolean que representa se a senha já possui o mínimo
     *                       de letras minusculas necessários para que seja forte,
     *                       se já tiver passa para true.
     * @return boolean - Retorna true se a senha possuir o mínimo de letras
     *         minusculas necessários para que seja forte e false se não possuir.
     */
    public static boolean validacaoMinuscula(char ch, Boolean achouMinuscula) {
        if (ch >= 'a' && ch <= 'z') 
            return true;
            
        return achouMinuscula;
    }

    /**
     * Método que verifica se a senha possui o mínimo de caracteres especiais
     * necessários para que seja forte.
     * 
     * @param senha        - String que representa a senha.
     * @param achouSimbolo - boolean que representa se a senha já possui o mínimo de
     *                     caracteres especiais necessários para que seja forte, se
     *                     já tiver passa para true.
     * @return boolean - Retorna true se a senha possuir o mínimo de caracteres
     *         especiais necessários para que seja forte e false se não possuir.
     */
    public static boolean validacaoSimbolo(String senha, Boolean achouSimbolo) {
        boolean outroTipo = false;
        
        boolean validarSimbolo = achouSimbolo;

        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                outroTipo = true;
            } else if (c >= 'A' && c <= 'Z') {
                outroTipo = true;
            } else if (c >= 'a' && c <= 'z') {
                outroTipo = true;
            } else {
                validarSimbolo = true;
            }

        }
        return validarSimbolo;
    }

    /**
     * Método que retorna uma mensagem personalizada de acordo os paramentos
     * recebidos.
     * 
     * @param minimoCaracteres              - boolean que representa se a senha já
     *                                      possui o mínimo de caracteres
     *                                      necessários para que seja forte
     * @param achouNumero                   - boolean que representa se a senha já
     *                                      possui o mínimo de numeros necessários
     *                                      para que seja forte
     * @param achouMaiuscula                - boolean que representa se a senha já
     *                                      possui o mínimo de letras maiusculas
     *                                      necessários para que seja forte
     * @param achouMinuscula                - boolean que representa se a senha já
     *                                      possui o mínimo de letras minusculas
     *                                      necessários para que seja forte
     * @param achouSimbolo                  - boolean que representa se a senha já
     *                                      possui o mínimo de caracteres especiais
     *                                      necessários para que seja forte
     * @param senha                         - String que representa a senha.
     * @param quantidadeCharFaltaSenhaForte - inteiro que representa quantos
     *                                      caracteres faltam para que a senha seja
     *                                      forte.
     * @return String - Retorna uma mensagem personalizada com base nos paramentos
     *         recebidos.
     */
    public static String mensagemRetorno(boolean minimoCaracteres, boolean achouNumero, boolean achouMaiuscula,
            boolean achouMinuscula, boolean achouSimbolo, String senha, int quantidadeCharFaltaSenhaForte) {
        String mensagem = "";
        if (achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo && minimoCaracteres) {
            return mensagem = "Senha forte";
        } else {
            if (minimoCaracteres == false) {
                mensagem = "Senha fraca acresente mais " + (quantidadeCharFaltaSenhaForte) + " caracteres\n";
            }
            if (achouNumero == false) {
                mensagem += "Senha deve conter pelo menos um número\n";
            }
            if (achouMaiuscula == false) {
                mensagem += "Senha deve conter pelo menos uma letra maiúscula\n";
            }
            if (achouMinuscula == false) {
                mensagem += "Senha deve conter pelo menos uma letra minúscula\n";
            }
            if (achouSimbolo == false) {
                mensagem += "Senha deve conter pelo menos um símbolo\n";
            }
            return mensagem;
        }

    }

}

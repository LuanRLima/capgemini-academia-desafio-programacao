package com.capgemini.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe para verificar a quantidade de anagramas possiveis.
 * 
 * @author LuanRLima
 */
public class App {

    /**
     * Método principal onde o programa é executado.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String palavra = sc.nextLine();

        int anagrama = quantidadeAnagramas(palavra);
        System.out.println(anagrama);
        sc.close();
    }

    /**
     * Médoto que valida se duas palavras são anagramas
     * 
     * @param s1 String - Palavra ser comparada com s2
     * @param s2 String - Palavra ser comparada com s1
     * @return - boolean - Retorna true se são anagramas, false caso contrário.
     */
    public static boolean validacoesAnagramas(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int count = 0;
        boolean[] vistoria = new boolean[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j) && !vistoria[j]) {
                    count++;
                    vistoria[j] = true;
                    break;
                }
            }
        }
        return count == s2.length() ? true : false;
    }

    /**
     * Método que indetifica a quantidade de anagramas de uma palavra de si mesma,
     * dada uma string qualquer, encontrar o número de pares de substrings que são
     * anagramas.
     * 
     * @param s String - Palavra a ser analisada.
     * @return - int - Retorna a quantidade de anagramas possíveis.
     */
    public static int quantidadeAnagramas(String s) {

        List<String> lista = criandoPossibilidadeAnagramas(s);
        int resultado = 0;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (validacoesAnagramas(lista.get(i), lista.get(j)))
                    resultado++;
            }
        }
        return resultado;
    }

    /**
     * Método que cria possibilidades de anagramas.
     * 
     * @param s String a ser analisada.
     * @return List-String - Retorna uma lista com possibilidades de anagramas.
     */
    public static List<String> criandoPossibilidadeAnagramas(String s) {
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++)
                lista.add(s.substring(i, j));
        }
        return lista;
    }
}

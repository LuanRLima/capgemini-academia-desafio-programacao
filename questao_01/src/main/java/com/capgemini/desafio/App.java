package com.capgemini.desafio;

import java.util.Scanner;

/**
 * A Classe onde vai ser ser executado as construções dos degraus.
 */
public class App {
    
    
    /**
     *  Método principal onde o programa é executado.
     *
     * @param args the arguments
     */ 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus: ");
        int numeroDegraus = sc.nextInt();
        System.out.println(construirDegraus(numeroDegraus));
        sc.close(); 
    }

    /**
     * Método que constrói a quantidade de degraus, de acordo com o valor informado por paramento pelo usuário
     * @param numeroDegraus - Quantidade de degraus a serem criados;
     * @return - Retorna uma string em formato de degraus de uma escada, a base é o paramento numeroDegraus;
     */
    public static String construirDegraus(int numeroDegraus) {
        String[] degraus = new String[numeroDegraus];
        for (int i = 1; i <= numeroDegraus; i++) {
            String degrau = "";
            for (int j = numeroDegraus; 1 <= j; j--) {
                if (i >= j){
                    degrau += "*";
                    
                }else{
                    degrau += " ";
                }
            }
            
            //System.out.println(degrau);
            degraus[i-1] = degrau;
            
            
        }
        
        return String.join("\n", degraus);
        
    }
    
}


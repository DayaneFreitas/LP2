/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicebtrie;

import java.util.Scanner;

/**
 *
 * @author Dayane
 */
public class NICEBTRIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        for (int i=0;i<qtd;i++){
            String palavra = entrada.next();
            char[] letras = palavra.toCharArray();
            ContN(letras);
        }
    }
    
    public static void ContN(char ar[]){
        int cont = 0;
        for(int i=0;i<ar.length;i++){
            if (ar[i] == 'n'){
               cont++; 
            }
        }
        System.out.println(cont);
    }
}

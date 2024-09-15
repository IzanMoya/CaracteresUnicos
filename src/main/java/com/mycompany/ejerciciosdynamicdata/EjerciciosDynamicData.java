/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosdynamicdata;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.util.HashSet;

public class EjerciciosDynamicData {
   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        
        frase = frase.replaceAll("\\s.,!?", "");
        
        
        HashSet<Character> charUnico =new HashSet<>();
        
        for(char ch : frase.toCharArray()){
            charUnico.add(ch);
        }
        
        System.out.println("Los caracteres unicos de la oracion son: ");
        for (char ch : charUnico){
            System.out.println(ch + " ");
        }
    }
}

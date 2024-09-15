/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosdynamicdata;

/**
 *
 * @author user
 */
import java.util.HashMap;
import java.util.Scanner;

public class EjerciciosDynamicData2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        String texto = sc.nextLine();
        
        texto = texto.toLowerCase().replaceAll("[\\s.,!?]", " ");
        
        String[] palabras = texto.split("\\s+");
        
        HashMap<String, Integer> contadorPalabras = new HashMap<>();
        
        for(String palabra : palabras){
            if(!palabra.isEmpty()){
                contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
            }
        }
        
        System.out.println("Ocurrencias de cada palabra");
        for (HashMap.Entry<String, Integer> entrada : contadorPalabras.entrySet()){
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        
    }
    
}

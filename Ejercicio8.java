/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios_6al17;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio8 {
    public static void main (String [] args){
    
    String palabra;
    Scanner leer = new Scanner(System.in);
    do{
        System.out.println("Ingresa una palabra de maximo 8 letras: ");
     palabra = leer.nextLine();
     
     if (palabra.length() > 8){
         System.out.println("Ingresa una palabra con menos letras!");
     }
     
    }while(palabra.length() > 8);
    
    String comp = p(palabra);
    
        System.out.println(comp);
    
    }
    
    public static String p(String palabra){
    
    String p = "";
    
    if (palabra.length() <= 8){
    
        p += "PERFECTO ES DE 8 LETRAS O MENOS!!";
    }
    return p;
    }
}

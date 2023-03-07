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
public class Ejercicio12 {
    public static void main(String[] args){
    int cont = 0;
    Scanner leer = new Scanner(System.in);
    
    do{
    System.out.println("Escribe una palabra");
    String palabra = leer.nextLine();
    
    
    
    
       if ((palabra.substring(palabra.length()-1,palabra.length()).equals("O")) && (palabra.substring(0,1).equals("X")) && palabra.length() < 5) {
       
           System.out.println("FORMATO CORRECTO");
           cont = 1;
       } 
       else{
           System.out.println("formato incorrecto");
       }
    
    }while(cont != 1);
    
    }
    
}

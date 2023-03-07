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
public class Ejercicio13 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        
    int num = leer.nextInt();
    
    for (int i = 0; i <= num; i++){
        for(int j = 0; j <= num; j++){
        
        if (j == 0 || j == num || i == 0 || i == num ){
        
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        
        }
        System.out.println("");
    }
    
    
    
    }

  
  }  


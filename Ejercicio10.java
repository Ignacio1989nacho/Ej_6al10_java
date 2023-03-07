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
public class Ejercicio10 {
    
    public static void main (String [] args){
    
    Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingresa un valor limite");
        
    int limite = leer.nextInt();
    
    
    int comp = tot(limite,leer);
    
        System.out.println(comp);
    }
    public static int tot(int limite,Scanner leer){
    
    int p;
    int tot = 0;
        System.out.println("AHORA NUMEROS A SUMAR!");
    
        do{
        
        p = leer.nextInt();
        
        tot = tot+p;
        
        }while(tot <= limite);
       return tot;
    }
    
}

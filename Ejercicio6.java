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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     boolean comp = e();   
        
        System.out.println("El numero es par??:" + comp);  
        
    }
    public static boolean e(){
    
    boolean e = false;
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingresa un numero para ver si es par-:");
    
        double num = leer.nextDouble();
        
        if (num % 2 == 0){
        
         e = true;   
            
        }
    return e;
    }
}

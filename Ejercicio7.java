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
public class Ejercicio7 {
    public static void main(String[] args){
    
    String p_clave = "EUREKA" ;   
        
   
    
    String comp = p(p_clave);
    
    
        System.out.println(comp);
    }
    
    public static String p(String p_clave){
    int cont = 0;
    String p = "";
    Scanner leer = new Scanner(System.in);
    
    do{
    
        System.out.println("Ingresa tu palabra:");
    String palabra = leer.nextLine();
    
    if (palabra.equals(p_clave)){
        p += "EUREKA ES LA PALABRA CORRECTA!";
       cont++;
    }else{
        System.out.println("PALABRA INCORRECTA!");
    }
    }while (cont != 1);
    return p;
}

}
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
public class Ejercicio9 {
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
    String palabra = leer.nextLine();
    
    
    String comp = p(palabra);
    
        System.out.println(comp);
    
    }
  public static String p(String palabra){
  
      String p = "";
      
      if (palabra.substring(0, 1).equals("A")){
      p += "Correcto!";
      
      }else{
      p += "Incorrecto!";
      }
      return p;
      
  }  
}

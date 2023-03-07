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
public class Ejercicio14 {
    public static void main(String [] args){
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Escoge la moneda a calcular:");
    
         System.out.println("MENU\n"
                + "1. Peso\n"
                + "2. Dolar\n"
                + "3. Yen\n"
                + "4. Libra");
         
         int num = leer.nextInt();
         System.out.println("Ingresa la cantidad:");
         double cant = leer.nextDouble();
   
         String t = p(num,cant);

         System.out.println(p(num,cant)+"E");
         
    }
  public static String p(int num,double cant){
  String p = null;
  
  switch (num){
  
      case 1:
          double tot = cant / 209;
          p= String. valueOf(tot);
          break;
      case 2:
          
          tot = 1.28611 / cant;
          p= String. valueOf(tot);
          break;
      case 3:
          tot = cant / 144.87;
          p= String. valueOf(tot);
          break;
      case 4: 
          tot = cant / 0.86;
          p= String. valueOf(tot);
          break;
  
  }
  
  return p;
  
  }  
    
}

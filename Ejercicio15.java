/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios_6al17;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        int[] vec = new int[10];

        for (int i = 0; i <= 9; i++) {

            vec[i] = (int) (Math.random() * 100);
            
            System.out.print(vec[i]+", ");
            }
        System.out.println("");    
     
     for (int i = 0; i <10; i++){

      for (int j = 0; j<9; j++){
      
      if (vec[j]< vec[j+1]){
      
      int aux;
      
      aux = vec[j];
      vec[j]=vec[j+1];
      vec[j+1]=aux;
      
      }
      
      }
      
      }
      for (int i = 0; i < 10; i++){
      
          System.out.print(vec[i]+", ");
      
      }
      }
     
    
     }

        

    



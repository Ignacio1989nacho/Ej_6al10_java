/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios_6al17;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        
        
       int [] relleno = vec(); 
       
       for (int i = 0; i <= vec().length-1;i++){
       
           System.out.print(relleno[i]+", ");
       }
     
       int [] p = total(relleno);
       
        System.out.println("");
        
       System.out.println(Arrays.toString(p));
       
       
       
       
    }
    public static int [] vec(){
    int [] vec = new int [15];
    
    
    for (int i = 0;i < vec.length-1;i++){
    
    vec[i]=(int) (Math.random() * 10000);
    
    
    }
    
    return vec;
    
    }

    /**
     * @param relleno
     *@return
     */
    public static int [] total(int [] relleno){
    
    int [] total = new int[5];
    String iterar = "";
    int uno = 0;
    int dos = 0;
    int tres = 0;
    int cuatro = 0;
    int cinco = 0;
    
         for (int i = 0; i <= relleno.length-1;i++){
       
          iterar = (Integer.toString(relleno[i]));
       
         switch(iterar.length()){
             case 1:
                 uno=uno+1;
                 total[0]=uno;
                 break;
             case 2:
                 dos =dos+1;
                 total[1]=dos;
                 break;
             case 3:
                 tres =tres+1;
                 total[2]=tres;
                 break;
             case 4:
                 cuatro =cuatro+1;
                 total[3]=cuatro;
                 break;
                 
             default:
                 cinco =cinco+1;
                 total[4]=cinco;
                 break;
         }
         
     
         }
    return total;
    
    
    
    

}
}

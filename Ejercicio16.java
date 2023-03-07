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
public class Ejercicio16 {

    public static void main(String[] args) {

        int[] vec = new int[10];
        for (int i = 0; i <= 9; i++) {

            vec[i] = (int) (Math.random() * 100);

            System.out.print(vec[i] + ", ");
        }
        System.out.println("");
        Scanner leer = new Scanner(System.in);

        System.out.println("Escribre el numero que deseas buscar");
        int num = leer.nextInt();
        
        String resultado = r(vec,num);
        System.out.println(resultado);
    }
public static String r(int [] vec, int num){

String r = null;

for (int i = 0; i <=vec.length-1; i++){
if(num == vec[i]){

r = "Encontramos el numero correcto en la posicion "+(i+1);
}else{
        
       r="No se encontro el numero en ninguna posicion!"; 
        }
    
    
}
return r;
}
}

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
public class Ejercicio11 {

    public static void main(String[] args) {

    

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros:");
        double num;
        double num2;
        boolean log = false;
        num = leer.nextInt();
        num2 = leer.nextInt();
        do {
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:");

            int op = leer.nextInt();

            switch (op) {

                case 1:
                    double suma = num + num2;
                    System.out.println(suma);
                    log = true;
                    break;
                case 2:
                    double rest = num - num2;
                    System.out.println(rest);
                    log = true;
                    break;
                case 3:
                    double mult = num * num2;
                    System.out.println(mult);
                    log = true;
                    break;
                case 4:
                    double div = num / num2;
                    System.out.println(div);
                    log = true;
                    break;
               }
            
                if(op == 5){
                    Scanner leer2 = new Scanner(System.in);
                    System.out.println("Desea salir? S/N:");
                        
                    String op2 = leer2.nextLine(); // char op2 = leer.next...();

                    if (op2.equals("S")) {
                        log = true;
                    }
                }  
        }while(log == false);

        
    
   }
}


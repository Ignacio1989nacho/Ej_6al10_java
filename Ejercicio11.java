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

        

        System.out.println("Ingresa 2 numeros positivos:");

        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        
        System.out.println("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija opción:");

        int op = leer.nextInt();

        while (op == 5) {
            Scanner leer2 = new Scanner(System.in);
            System.out.println("Esta seguro que desea salir?: S/N");
            
            String op2;
            op2 = leer2.nextLine();

            if (op2.equals("S")) {
                System.out.println("adios");
                break;
            } 
            else {

                System.out.println("MENU\n"
                        + "1. Sumar\n"
                        + "2. Restar\n"
                        + "3. Multiplicar\n"
                        + "4. Dividir\n"
                        + "5. Salir\n"
                        + "Elija opción:");

                op = leer.nextInt();
                        
            }

        }

        if (op != 5) {
            double tot = t(num1, num2, op);

            System.out.println("el total es " + tot);
        }

    }

    public static double t(double num1, double num2, int op) {

        double t = 0;

        if (op == 1) {

            t = num1 + num2;

        } else if ((op == 2)) {
            t = num1 - num2;
        } else if ((op == 3)) {
            t = num1 * num2;
        } else if ((op == 4)) {
            t = num1 / num2;
        }
        return t;

    }

}

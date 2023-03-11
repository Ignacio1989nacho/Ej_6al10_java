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
        int num;
        int num2;
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
                    int suma = num + num2;
                    break;
                case 2:
                    int rest = num - num2;
                    break;
                case 3:
                    int mult = num * num2;
                    break;
                case 4:
                    double div = num / num2;
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    char confirmacion = leer.next().charAt(0);

                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("Saliendo del programa...");
                        return; // Sale del programa
                    } else {
                        break; // Vuelve al menú
                    }
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println(); // Salto de línea para separar las opciones del menú
        } while (true);
                    
                
                    }
                    
            }




package java_ejercicios_6al17;

import java.util.Scanner;

public class Ejercicio12 {

    public static Scanner leer = new Scanner(System.in);
    public static final String FIN = "&&&&&";

    public static void main(String[] args) {
        int cont = 0;
        int cont2 = 0;
        System.out.println("Escribe una palabra");
        String palabra = leer.nextLine();

        while (!palabra.equals(FIN)) {

            if ((palabra.substring(palabra.length() - 1, palabra.length()).equals("O")) && (palabra.substring(0, 1).equals("X")) && palabra.length() < 5) {

                cont++;

            } else {

                cont2++;
            }
            System.out.println("Escribe una palabra");
            palabra = leer.nextLine();
        }
        System.out.println("correctas:" + cont);
        System.out.println("incorrectas:" + cont2);

    }

}

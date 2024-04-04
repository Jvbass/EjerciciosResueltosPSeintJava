package cl.jpino.clase11_ejercicio1y2_ContrasenaIncorrecta_MayorMenorEdad;

import java.util.Scanner;

public class Condicionales2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario desde la consola
        System.out.println("Ingrese su edad: "); // Solicita al usuario que ingrese su edad
        int edad = sc.nextInt(); // Lee y almacena la edad ingresada por el usuario

        // Comprueba si la edad ingresada es mayor o igual a 18
        if (edad >= 18) {
            System.out.println("Eres mayor de edad"); // Imprime un mensaje indicando que el usuario es mayor de edad
        } else {
            System.out.println("Eres menor de edad"); // Imprime un mensaje indicando que el usuario es menor de edad
        }
    }
}

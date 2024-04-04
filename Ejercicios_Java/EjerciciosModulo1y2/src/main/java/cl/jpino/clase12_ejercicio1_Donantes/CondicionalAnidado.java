package cl.jpino.clase12_ejercicio1_Donantes;

import java.util.Scanner;

/*
* En este ejercicio se requiere crear un algoritmo que diga si una persona puede
donar sangre o no, basándose en las siguientes condiciones:
● Si tiene entre 18 y 65 años y pesa 50 kg o
más, puede donar.
● Si tiene menos de 18 o más de 65, no
puede donar.
● Si está en el rango de edad pero pesa
menos de 50 kg, no puede donar.
* */
public class CondicionalAnidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: "); // Solicita al usuario que ingrese su edad
        int edad = sc.nextInt(); // Lee y almacena la edad ingresada por el usuario
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();

        // Comprueba si la edad está en el rango adecuado para donar sangre y si el peso es suficiente
        if (edad >= 18 || edad <= 65) {
            if (peso >= 50) {
                System.out.println("Puede donar sangre"); //si cumple condicion peso mayor a 50 y condicion anterior de edad
            } else {
                System.out.println("No puede donar sangre, peso insuficiente");// si no pesa mas de 50
            }
        } else {
            System.out.println("No puede donar sangre, edad fuera de rango");
        }
    }
}

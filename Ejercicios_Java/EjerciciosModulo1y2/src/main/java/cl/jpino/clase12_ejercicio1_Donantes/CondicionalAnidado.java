package cl.jpino.clase12_ejercicio1_Donantes;

import java.util.Scanner;

public class CondicionalAnidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();

        if (edad >= 18 || edad <= 65) {
            if (peso >= 50) {
                System.out.println("Puede donar sangre");
            } else {
                System.out.println("No puede donar sangre, peso insuficiente");
            }
        } else {
            System.out.println("No puede donar sangre, edad fuera de rango");
        }
    }
}

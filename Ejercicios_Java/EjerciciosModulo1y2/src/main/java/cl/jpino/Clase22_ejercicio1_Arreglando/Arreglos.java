package cl.jpino.Clase22_ejercicio1_Arreglando;

import java.util.Scanner;

/*
Crear un arreglo para almacenar 3 números
reales ingresados por el usuario y mostrar el
mayor elemento.
 */
public class Arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número: ");
            numeros[i] = sc.nextInt();
        }

        //Calcula el numero mayor
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }// end of main
}// end of class

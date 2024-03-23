package cl.jpino.Clase18_ejercicio1_Operando;

import java.util.Scanner;

public class OperacionesIntString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*Suma de enteros*/
        System.out.println("Ingrese un número entero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número entero: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;

        System.out.println("La suma de los números es: " + suma);

/*Exponente 3 (clase Math)*/
        System.out.println("Ingrese un número entero: ");
        int num3 = sc.nextInt();
        double resultado = Math.pow(num3, 2); // ó resultado = num3 * num3
        System.out.println("El número " + num3 + " elevado al cuadrado es: " + resultado);

/*Concatenacion String*/
        System.out.println("Ingrese un texto: ");
        String texto1 = sc.next();
        System.out.println("Ingrese otro texto: ");
        String texto2 = sc.next();
        String concatenacion = texto1 + texto2;

        System.out.println("La concatenación de los textos es: " + concatenacion);


/*Comparacion de 2 numeros*/
       System.out.println("Ingrese un número entero: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese otro número entero: ");
        int numero2 = sc.nextInt();
        if (numero1 == numero2) {
            System.out.println("El número " + numero1 + " es igual al número " + numero2);
        }

    } // end of main
}// end of class

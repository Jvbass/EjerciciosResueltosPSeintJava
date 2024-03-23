package cl.jpino.clase13_ejercicio1_CalculadoraBucle;

import java.util.Scanner;

public class UsandoSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        while (opcion != 5) {
            // Menu de opciones (switch case
            System.out.println("Ingrese la operación a realizar: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los números es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los números es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("La división de los números es: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            } // end of switch
        } // end of while
    } // end of main
}// end of class

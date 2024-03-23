package cl.jpino.Clase23_ejercicio1_SinCadenas;

import java.util.Scanner;

public class MetodosString {
    public static void main(String[] args) {

//Extraer 4to y 5to caracter de una cadena usando substring
        String cadena1 = "Hamburguesa";

        String resultado = cadena1.substring( 3, 5);
        System.out.println("El cuarto y 5 caracter es: " + resultado);

//Cantidad de vocales de una cadena

        String palabra = "Moe, sírveme algo fuerte como para olvidar a Patty y Selma, pero no tanto como para creer que las quiero";
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales en la cadena es: " + contador);

    }// end of main
}// end of class

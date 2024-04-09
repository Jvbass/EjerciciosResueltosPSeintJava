package cl.jpino.Clase24_probandoMath;

/*
*
* Clase 24 - Probando la clase Math
*  La clase Math es una clase propia de java(incorporada) proporciona métodos estáticos para realizar operaciones matemáticas.
* Es del paquete java.lang, por lo que no es necesario importarla.
* */
public class JugandoConMath {
    public static void main(String[] args) {
        // Declaración de variables
        double x = 10.5;
        double y = 5.4;


        // Operaciones con Math
        System.out.println("Valor absoluto de x: " + Math.abs(x));
        System.out.println("Valor absoluto de y: " + Math.abs(y));

        System.out.println("\nEl número mayor Math.max es: " + Math.max(x, y));
        System.out.println("El número menor Math.min es: " + Math.min(x, y));

        System.out.println("\nRedondeo Math.round de x: " + Math.round(x));
        System.out.println("Redondeo Math.round de y: " + Math.round(y));

        System.out.println("\nRaíz cuadrada Math.sqrt de x: " + Math.sqrt(x));
        System.out.println("Raíz cuadrada Math.sqrt de y: " + Math.sqrt(y));

        System.out.println("\nPotencia de x elevado a y Math.pow : " + Math.pow(x, y));
        System.out.println("Potencia de y elevado a x Math.pow : " + Math.pow(y, x));

        System.out.println("\nNúmero aleatorio Math.random entre 0 y 1: " + Math.random());
        double aleatorio = Math.random() * 100;
        System.out.println("Número aleatorio Math.random entre 0 y 100: " + aleatorio);
        int randomEntero = (int) (Math.random() * 1000);
        System.out.println("Número aleatorio entero Math.random entre 0 y 1000 entero: " + randomEntero);
    }
}

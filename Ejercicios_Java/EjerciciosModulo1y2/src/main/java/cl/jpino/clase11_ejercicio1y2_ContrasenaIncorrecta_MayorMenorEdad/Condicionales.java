package cl.jpino.clase11_ejercicio1y2_ContrasenaIncorrecta_MayorMenorEdad;

import java.util.Scanner;
/*Escribir un algoritmo que almacene la cadena
de caracteres “contraseña” en una variable,
luego pregunte al usuario por la contraseña e
imprima por pantalla si la contraseña
introducida por el usuario coincide con la
guardada en la variable (sin tener en cuenta
mayúsculas y minúsculas).*/
public class Condicionales {
    public static void main(String[] args) {
        String contrasena = "MoeSzysLaK1985";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la contraseña: ");
        String contrasenaIngresada = sc.next();

        if (contrasena.toLowerCase().equals(contrasenaIngresada.toLowerCase())) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }
}

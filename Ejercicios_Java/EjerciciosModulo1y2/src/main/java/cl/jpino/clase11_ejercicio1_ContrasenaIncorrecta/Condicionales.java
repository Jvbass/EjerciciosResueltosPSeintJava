package cl.jpino.clase11_ejercicio1_ContrasenaIncorrecta;

import java.util.Scanner;

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

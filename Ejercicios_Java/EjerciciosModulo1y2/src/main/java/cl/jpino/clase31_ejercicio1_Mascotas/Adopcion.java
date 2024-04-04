package cl.jpino.clase31_ejercicio1_Mascotas;
/*
En este ejercicio vamos a realizar un programa para que una Persona pueda adoptar un
Perro. El programa debe contar de dos clases:
● Perro, que tendrá como atributos: nombre, raza, edad y tamaño.
● Persona con atributos: nombre, apellido, edad, RUT y Perro.
Además, se debe crear en el main dos Personas y dos Perros.
Es necesario asignarle a cada Persona un Perro y por último, mostrar desde la clase
Persona, la información de los objetos Perro y Persona.
 */
public class Adopcion {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Rex", "Pastor Aleman", 5, "Grande");

        Persona persona1 = new Persona("Maria", "Lopez", 25, "98765432-1", perro1);
        Persona persona2 = new Persona("Pedro", "Gonzalez", 40, "45678912-3", perro2);

        System.out.println("Mostrando desde la clase persona");
        System.out.println("-----------------------------");
        persona1.mostrarInfo();
        persona2.mostrarInfo();

    }
}

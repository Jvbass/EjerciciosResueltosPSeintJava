package cl.jpino.clase31_ejercicio1_Mascotas;

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

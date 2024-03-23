package cl.jpino.clase31_ejercicio1_Mascotas;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String rut;
    private Perro perro;

    public Persona(String nombre, String apellido, int edad, String rut, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Rut: " + rut);
        System.out.println("Perro: " + perro.getNombre());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Tamaño: " + perro.getTamanio());
        System.out.println("*******************************");
    }

}

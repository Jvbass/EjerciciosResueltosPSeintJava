package cl.jpino.clase30_ejercicio1_Cafetera;

public class Cafetera {
    //atributos
    private int capacidadMaxima;
    private int cantidadActual;

    //constructores
    public Cafetera() {
    }
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //getter y setter


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //metodos
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("Se lleno la cafetera");
    }

    public void servirTaza(int cantidad) {
        if (cantidadActual >= cantidad) {
            this.cantidadActual -= cantidad;
            System.out.println("Se lleno la taza con " + cantidad + " de café");
        } else {
            int faltante = cantidad - this.cantidadActual;
            System.out.println("No se lleno la taza, faltan " + faltante + " de café");
            this.cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
        System.out.println("Se vacio la cafetera");
    }

    public void agregarCafe(int cantidad) {
        if (this.cantidadActual + cantidad <= this.capacidadMaxima) {
            this.cantidadActual += cantidad;
            System.out.println("Se agrego " + cantidad + " de café");
        } else {
            this.cantidadActual = this.capacidadMaxima;
            int sobrante = (this.cantidadActual + cantidad) - this.capacidadMaxima;
            System.out.println("Se lleno la cafetera, sobraron " + sobrante + " de café");
        }
    }

}

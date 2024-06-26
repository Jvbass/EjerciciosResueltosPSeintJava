package cl.jpino.clase30_ejercicio1_Cafetera;
/*
Desarrolle una clase Cafetera con los atributos capacidadMaxima (la cantidad
máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera).
 */
public class UsandoCafetera {
    public static void main(String[] args) {
        //instancia de cafetera usando constructor con parametros
        Cafetera cafetera = new Cafetera(1000, 500);

        //sirviendo una taza
        cafetera.servirTaza(500);

        //sirviendo otra taza
        cafetera.servirTaza(400);

        //sirviendo otra taza
        cafetera.servirTaza(300);

        //llenando la cafetera
        cafetera.llenarCafetera();

        //vaciar la cafetera (quedo muy suave)
        cafetera.vaciarCafetera();

        //agregar cafe
        cafetera.agregarCafe(1500);

        //sirviendo otra taza
        cafetera.servirTaza(200);

        //vemos cantidad actual en la cafetera
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());

    }
}

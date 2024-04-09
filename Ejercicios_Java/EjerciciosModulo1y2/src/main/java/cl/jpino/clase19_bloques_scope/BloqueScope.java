package cl.jpino.clase19_bloques_scope;

public class BloqueScope {
    public static void main(String[] args) {
        // Declaración de variables
        int x = 10;
        int y = 20;

        // Bloque de código
        {
            int z = 30;
            System.out.println("Dentro del bloque: x = " + x + ", y = " + y + ", z = " + z);
        }

        // Error: z no está definida fuera del bloque
        // System.out.println("Fuera del bloque: x = " + x + ", y = " + y + ", z = " + z);

    }
}

package cl.jpino.Clase20_condicionalF_Switch;

public class OperadorTernario {
    public static void main(String[] args) {
        // Declaración de variables
        int x = 10;
        int y = 23;
        int mayor;

        // Operador ternario
        mayor = (x > y) ? x : y; // Con el simbolo ? evalua la condicion. Con el simbolo : determina el valor contrario a la condicion
        System.out.println("El número mayor es: " + mayor);

        int a = 10, b = 20, c = 30;
        int valorMaximo = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Valor mas alto es " + valorMaximo);
    }
}

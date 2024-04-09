package cl.jpino.clase17_ejercicio1_DatosNumericos;

public class VariablesJavaNumericos {
    public static void main(String[] args) {
        // Declaración de variables numéricas
        byte byteVar = 127; // -128 a 127
        short shortVar = 32767; // -32768 a 32767
        int intVar = 2147483647; // -2147483648 a 2147483647
        long longVar = 9223372036854775807L; // -9223372036854775808 a 9223372036854775807
        float floatVar = 3.4028235E38f; // 1.4e-45 a 3.4028235E38
        double doubleVar = 1.7976931348623157E308; // 4.9e-324 a 1.7976931348623157E308

        // Imprimir los valores de las variables
        System.out.println("Valor de byteVar: " + byteVar);
        System.out.println("Valor de shortVar: " + shortVar);
        System.out.println("Valor de intVar: " + intVar);
        System.out.println("Valor de longVar: " + longVar);
        System.out.println("Valor de floatVar: " + floatVar);
        System.out.println("Valor de doubleVar: " + doubleVar);

        // Operaciones aritméticas
        int a = 10;
        int b = 20;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = b / a;
        int modulo = b % a; // Resto de la división

        // Imprimir los resultados de las operaciones
        System.out.println("\nSuma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // Incremento y decremento
        int c = 5;
        c++; // Incremento en 1
        System.out.println("Incremento: " + c);

        c--; // Decremento en 1
        System.out.println("Decremento: " + c);

        // Operadores de asignación
        int x = 10;
        System.out.println("\nValor de x: " + x);
        x += 5; // x = x + 5
        System.out.println("x += 5: " + x);

        x -= 3; // x = x - 3
        System.out.println("x -= 3: " + x);

        x *= 2; // x = x * 2
        System.out.println("x *= 2: " + x);

        x /= 4; // x = x / 4
        System.out.println("x /= 4: " + x);
    }
}

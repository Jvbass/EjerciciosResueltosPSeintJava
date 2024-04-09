package cl.jpino.clase17_ejercicio1_DatosNumericos;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
* Tipos de datos numéricos en Java
* Primitivos:
* byte: 8 bits, -128 a 127
* short: 16 bits, -32768 a 32767
* int: 32 bits, -2147483648 a 2147483647
* long: 64 bits, -9223372036854775808 a 9223372036854775807
* float: 32 bits, 1.4e-45 a 3.4028235E38
* double: 64 bits, 4.9e-324 a 1.7976931348623157E308
*
* Tipos de Objeto Numéricos (No Primitivos): Estos son los tipos de datos numéricos que se utilizan como objetos en Java.
* Se caracterizan por tener métodos y propiedades que se pueden utilizar para realizar operaciones matemáticas. Pueden ser nulos.
*
* Byte
* Short
* Integer
* Long
* Float
* Double
* BigInteger: Números enteros de precisión arbitraria
* BigDecimal: Números decimales de precis
* *
* */
public class VariablesJavaNumericos {
    public static void main(String[] args) {
        // Declaración de variables numéricos primitivos
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


        // Declaración de variables numéricos no primitivos
        Integer intVar2 = 2147483647; /* Autoboxing 2147483647 se está convirtiendo automáticamente en un objeto Integer utoboxing es básicamente la conversión
        automática que realiza el compilador de Java entre los tipos primitivos y sus correspondientes objetos envolventes.*/
        int intVar3 = intVar2; // Unboxing Unboxing. En Java, el Unboxing es la conversión automática que realiza el compilador de Java del objeto envolvente al tipo primitivo correspondiente.
        BigInteger bigInteger = new BigInteger("92233720368547758079223372036854775807");
        BigDecimal bigDecimal = new BigDecimal("3.14159265358979323846264338327950288419716939937510");
        Byte byteVar2 = 127; // -128 a 127
        Short shortVar2 = 32767; // -32768 a 32767
        Long longVar2 = 9223372036854775807L; // -9223372036854775808 a 9223372036854775807
        Float floatVar2 = 3.4028235E38f; // 1.4e-45 a 3.4028235E38
        Double doubleVar2 = 1.7976931348623157E308; // 4.9e-324 a 1.7976931348623157E308


        System.out.println("\nValor de bigInteger: " + bigInteger);
        System.out.println("Valor de bigDecimal: " + bigDecimal);
        System.out.println("intVar2: " + intVar2);
        System.out.println("intVar3: " + intVar3);
        System.out.println("byteVar2: " + byteVar2);
        System.out.println("shortVar2: " + shortVar2);
        System.out.println("longVar2: " + longVar2);
        System.out.println("floatVar2: " + floatVar2);
        System.out.println("doubleVar2: " + doubleVar2);

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


        //Operaciones con no primitivos
        System.out.println("\nOperaciones con no primitivos");
        System.out.println("Suma de bigInteger: " + bigInteger.add(new BigInteger("92233720368547758079223372036854775807")));
        System.out.println("Resta de bigInteger: " + bigInteger.subtract(new BigInteger("92233720368547758079223372036854775807")));
        System.out.println("Multiplicación de bigInteger: " + bigInteger.multiply(new BigInteger("92233720368547758079223372036854775807")));
        System.out.println("División de bigInteger: " + bigInteger.divide(new BigInteger("92233720368547758079223372036854775807")));
        System.out.println("Módulo de bigInteger: " + bigInteger.remainder(new BigInteger("92233720368547758079223372036854775807")));
        System.out.println("Potencia de bigInteger: " + bigInteger.pow(2));

        System.out.println("Suma de bigDecimal: " + bigDecimal.add(new BigDecimal("3.14159265358979323846264338327950288419716939937510")));

    }
}

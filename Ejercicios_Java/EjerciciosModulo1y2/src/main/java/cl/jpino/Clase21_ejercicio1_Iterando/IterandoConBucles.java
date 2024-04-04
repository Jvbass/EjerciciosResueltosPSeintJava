package cl.jpino.Clase21_ejercicio1_Iterando;

/*
Escribir un programa que sume los números
del 1 al 10 utilizando.
1- bucle while.
2- bucle do-while
3- bucle for
 */
public class IterandoConBucles {

    public static void main(String[] args) {

/*Suma 10 numeros usando while*/
        int sumaW = 0;
        int i = 1;

        while (i <= 10) {
            sumaW += i;
            i++;
        }
        System.out.println("Suma de 10 numeros usando While: " + sumaW);


/*Suma 10 numeros usando doWhile*/
        int sumaDw = 0;
        int iDw = 1;

           do {
                sumaDw += iDw;
                iDw++;
            } while (iDw <= 10);

        System.out.println("Suma de 10 numeros usando do-While: " + sumaDw);

/*Suma 10 numeros usando for*/
        int sumaF = 0;

        for (int iF = 1; iF <= 10; iF++) {
            sumaF += iF;
        }
        System.out.println("Suma de 10 numeros usando ciclo For: " + sumaF);
    } // end of main
}//

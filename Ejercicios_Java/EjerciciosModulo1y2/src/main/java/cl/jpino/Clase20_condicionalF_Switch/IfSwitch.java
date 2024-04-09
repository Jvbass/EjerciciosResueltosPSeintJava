package cl.jpino.Clase20_condicionalF_Switch;

public class IfSwitch {
    public static void main(String[] args) {
        // Declaración de variables
        int x = 10;
        int y = 23;

        // Numero mayor o menor
        if (x < y) {
            System.out.println("x es menor que y");
        } else {
            System.out.println("x es mayor o igual que y");
        }

        //Par o impar
        if (x % 2 == 0) {
            System.out.println("x es par");
        }
        if (y % 2 != 0) {
            System.out.println("y es impar");
        }

        // Condicional switch
        int dia = 3;
        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
                break;
        }

        System.out.println("El día " + dia + " es " + nombreDia);
    }
}

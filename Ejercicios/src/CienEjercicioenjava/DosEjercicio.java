package CienEjercicioenjava;

import java.util.Scanner;

public class DosEjercicio {
    // Ejercicio 2 Java.- Saber cuál es el mayor de un arreglo.
    public static void main(String[] args) {

        int numero[] = new int[2];
        int mayor = numero[0];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numero.length; i++) {
            System.out.println("ingrese el numero " + (i + 1));
            numero[i] = entrada.nextInt();
            if (numero[i] > mayor) {
                mayor = numero[i];
            }
        }
        System.out.println("el numero mayor es " + mayor);
        entrada.close();

    }

}

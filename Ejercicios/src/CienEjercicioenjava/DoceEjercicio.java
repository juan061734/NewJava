package CienEjercicioenjava;

import java.util.Scanner;

public class DoceEjercicio {
    // Ejercicio 12 Java.- Guardar 5 números en un array, y mostrarlos en orden
    // inverso.
    // El programa nos pide introducir 5 números enteros, y al final, los mostrará
    // al revés.

    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese un numero ");
            arr[i] = entrada.nextInt();

        }
        System.out.println("los numeros inversos son ");
        int j = 4;
        while (j >= 0) {

            System.out.println("|" + arr[j] + "|\n");

            j--;

        }
        entrada.close();

    }
}

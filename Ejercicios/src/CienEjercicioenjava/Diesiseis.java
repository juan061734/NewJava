package CienEjercicioenjava;
// Ejercicio 16 Java.- Desplazar una posición a los elementos de un array.

import java.util.Scanner;

// Crearemos un arreglo de 10 posiciones, donde almacenaremos 10 números enteros, y posteriormente,
//  desplazaremos cada número una posición adelante.

public class Diesiseis {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int ultimo;
        Scanner entrada = new Scanner(System.in);

        // rellenar arreglo
        for (int i = 0; i < 10; i++) {
            System.out.println("introduce un numero entero");
            arr[i] = entrada.nextInt();
        }
        ultimo = arr[9];// dato ultimo
        for (int i = 8; i >= 0; i--) {// i= comienza en 8
            arr[i + 1] = arr[i];
            arr[0] = ultimo;// el ultimo numero se posiciona en la posicion 0
        }
        System.out.println("Mostrar numeros del arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);

        }
        entrada.close();
    }

}

package CienEjercicioenjava;

import java.util.Scanner;

public class CartocerEjercicio {
    // Ejercicio 14 Java.- Rellenar dos arreglos, y pasar esos números a un tercer
    // arreglo.
    // Crearemos dos arrays, "a" y "b", y almacenaremos 10 números en cada uno.
    // Posteriormente, en un tercer arreglo
    // "c", guardaremos los números del arreglo "a" y el arreglo "b", en este orden:
    // El primero de a, el primero de b, el segundo de a, el segundo de b, el
    // tercero de a, el tercero de b, etc.

    public static void main(String[] args) {

        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[20];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Posicion de A");
        for (int i = 0; i < A.length; i++) {

            System.out.println("Posicion " + (i + 1));
            A[i] = entrada.nextInt();
        }
        System.out.println("Posicion de B");
        for (int i = 0; i < B.length; i++) {
            System.out.println("Posicion de B" + (i + 1));
            B[i] = entrada.nextInt();
        }
        int j = 0;
        for (int i = 0; i < 10; i++) {
            // posicionamiento en escalera
            C[j] = A[i];
            System.out.println(C[j]);
            j++;
            C[j] = B[i];
            System.out.println(C[j]);
            j++;
        }

        entrada.close();
    }

}

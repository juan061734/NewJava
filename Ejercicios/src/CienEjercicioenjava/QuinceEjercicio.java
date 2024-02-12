package CienEjercicioenjava;

import java.util.Scanner;

public class QuinceEjercicio {
    // 15.- Ejercicio 15 Java.- Mezclar dos arreglos en un tercer arreglo.
    // Otro ejercicio usando arreglos. Rellenaremos dos arreglos, A y B, con 12
    // números enteros cada uno. Y pondremos en un
    // tercer arreglo C esos números, pero de manera especial: 3 números de A, luego
    // 3 números de B. Luego, otros 3 números de A,
    // luego otros 3 números de B... etc.

    public static void main(String[] args) {

        int A[] = new int[12];
        int B[] = new int[12];
        int C[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la posicion de A");
        // rellenas arreglo A
        for (int i = 0; i < A.length; i++) {
            System.out.println("Posicion A " + (i + 1));
            A[i] = entrada.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("Posicion B " + (i + 1));
            B[i] = entrada.nextInt();

        }
        int i = 0;
        int j = 0;
        while (i < 12) {// i =0
            for (int k = 0; k < 3; k++) {
                C[j] = A[i + k];
                j++;

            }
            for (int k = 0; k < 3; k++) {// k=0

                C[j] = A[i + k];// Almacena 3 primeros numeros de B en las siguientes posiciones de J(3)
                j++;

            }
            i += 3;
        }
        System.out.println("Areglo de C");
        for (j = 0; j < 24; j++) {
            System.out.println(C[j]);
        }
        entrada.close();
    }
}

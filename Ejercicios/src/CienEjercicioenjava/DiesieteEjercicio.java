package CienEjercicioenjava;

import java.util.Scanner;

// Ejercicio 17 Java.- Ingresar número en arreglo ordenado, en la posición adecuada.
// Ingresaremos 5 números enteros en un arreglo de tamaño de 10, ordenados y de manera creciente. Posteriormente, ingresaremos un número, 
// y éste se insertará en el lugar adecuado, para que el arreglo continúe ordenado, números de menor a mayor.
public class DiesieteEjercicio {

    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        int num, pos_num, j;

        System.out.println("ingresa los 5 numeros ordenados de menor a mayor");
        for (int i = 0; i < 5; i++) {// i=0

            arr[i] = entrada.nextInt();
        }
        System.out.println("ingrese un numero entero ");
        num = entrada.nextInt();
        pos_num = 0;
        j = 0;

        while (arr[j] < num && j <= 4) {
            pos_num++;// pos_num=1
            j++;// j=1
        }
        for (int i = 4; i >= pos_num; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos_num] = num;
        System.out.println("Arreglo nuevo ordenado");

        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);

        }
    }

}

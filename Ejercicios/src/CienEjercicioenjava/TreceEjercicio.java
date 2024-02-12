package CienEjercicioenjava;

import java.util.Scanner;

public class TreceEjercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arr[] = new int[10];
        // rellenar el arreglo
        for (int j = 0; j < arr.length; j++) {

            System.out.println("introduce el numero " + (j + 1));
            arr[j] = entrada.nextInt();
        }
        System.out.println("Mostrar los numeros");
        // imprimir arreglo
        for (int j = 0; j < 10; j++) {
            // posicion del arreglo
            System.out.println(arr[j]);
            // imprimir el arreglo en pos 9
            System.out.println(arr[9 - j]);
        }
        entrada.close();
    }

}

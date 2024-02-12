package CienEjercicioenjava;

import java.util.Scanner;

public class CuatroEjercicio {
    // Ejercicio 4 Java.- Programa que pida números, y al poner cero, deje de pedir,
    // y que los sume.

    public static void main(String[] args) {
        int num = 0, suma = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("ingrese un numero ");
            num = entrada.nextInt();
            suma = suma + num;
        } while (num != 0);
        System.out.println("la suma es " + suma);
        entrada.close();

    }

}

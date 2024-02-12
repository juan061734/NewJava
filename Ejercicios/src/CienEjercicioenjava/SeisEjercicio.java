package CienEjercicioenjava;

import java.util.Scanner;

public class SeisEjercicio {
    // Ejercicio Java 6.- Programa que multiplique los 10 primeros números impares.

    public static void main(String[] args) {
        int numero[] = new int[10];
        int resultadoMultiplicacion = 1;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numero.length; i += 2) {
            System.out.println("Ingrese el numero ");
            numero[i] = entrada.nextInt();
            resultadoMultiplicacion *= numero[i];
        }
        System.out.println("el reusltado de multiplicar los 10 primero numeros impares es " + resultadoMultiplicacion);
        entrada.close();

    }
}

package CienEjercicioenjava;

import java.util.Scanner;

public class CincoEjercicio {
    public static void main(String[] args) {
        // Ejercicio 5 Java.- Capturar sólo números positivos, y obtener la
        // media(promedio) de esos números.
        int numero = 0;
        int suma = 0;
        int cantidad = 0;
        double promedio = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un numero positivo");
        numero = entrada.nextInt();
        while (numero > 0) {
            suma = suma + numero;
            cantidad++;
            System.out.println("introduzco otro numero ");
            numero = entrada.nextInt();
        }
        if (cantidad == 0) {
            System.out.println("No se puede calcular la media de 0");
        } else {
            promedio = suma / cantidad;
            System.out.println("La media es " + promedio);
        }
        entrada.close();

    }
}

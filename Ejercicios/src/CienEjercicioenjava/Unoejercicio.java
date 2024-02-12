package CienEjercicioenjava;

import java.util.Scanner;

// Ejercicio 1 Java.- Array con 30 ventas del mes, y que diga cuáles y 
// cuántas son mayores que $2000.
public class Unoejercicio {

    public static void main(String[] args) {
        double ventas[] = new double[5];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < ventas.length; i++) {

            System.out.println("Venta " + (i + 1));
            ventas[i] = entrada.nextDouble();

        }
        int k = 0;
        int total = 0;
        while (k < 5) {
            if (ventas[k] > 2000) {
                System.out.println(ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("El total de las ventas mayor a 2000 son" + total);
        entrada.close();

    }

}

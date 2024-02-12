package CienEjercicioenjava;
// Ejercicio 7 Java.- Capturar 10 números, y obtener promedio de los positivos y cantidad de ceros.

import java.util.Scanner;

// Capturaremos 10 números enteros, y el programa al final nos dirá de esos 10 números, 
// cuál es el promedio de los positivos, cuál
//  fue de los negativos, y la cantidad de ceros ingresados.

public class SieteEjercicio {
    public static void main(String[] args) {

        int numero = 0, cantidadN = 0, cantidadP = 0;
        int sumN = 0, sumP = 0, cantidadCeros = 0;
        double promediosP = 0, promedioN = 0;
        int k = 0;
        Scanner entrada = new Scanner(System.in);

        while (k < 10) {
            System.out.println("ingrese un numero ");
            numero = entrada.nextInt();

            if (numero == 0) {
                cantidadCeros++;
            } else if (numero > 0) {
                cantidadP++;
                sumP = sumP + cantidadP;
            } else if (numero < 0) {
                cantidadN++;
                sumN = sumN + cantidadN;
            }
            k++;
        }
        if (cantidadP == 0) {
            System.out.println("No se puede realizar el promedio ");
        } else {
            promediosP = sumP / cantidadP;
            System.out.println("El promediode los positivos es " + promediosP);
        }
        if (cantidadN == 0) {
            System.out.println("No hay medio en los negativos por 0");
        } else {
            promedioN = sumN / cantidadN;
            System.out.println("El promedio de negativos es " + promedioN);
        }
        System.out.println("la cantidad de ceros es " + cantidadCeros);
        entrada.close();

    }

}

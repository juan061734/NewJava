package MatricezyArreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class sumarfila {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz[][], Nfilas, ncolom, sumafila = 0, sumacolmas = 0;

        Nfilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la fila"));
        ncolom = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de las columnas"));

        matriz = new int[Nfilas][ncolom];

        for (int i = 0; i < Nfilas; i++) {
            for (int j = 0; j < ncolom; j++) {

                System.out.println("Ingrese los datos del componente [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }

        }
        System.out.println("\n la matriz es ");
        for (int i = 0; i < Nfilas; i++) {
            for (int j = 0; j < ncolom; j++) {
                System.out.print(matriz[i][j] + "");

            }
            System.out.println("");

        } // suma filas
        for (int i = 0; i < Nfilas; i++) {
            sumafila = 0;
            for (int j = 0; j < ncolom; j++) {
                sumafila += matriz[i][j];
            }
            System.out.print("\n La suma de la fila [" + i + "] es: " + sumafila);
        }
        System.out.println("");

        for (int j = 0; j < ncolom; j++) {
            sumacolmas = 0;
            for (int i = 0; i < Nfilas; i++) {
                sumacolmas += matriz[i][j];

                System.out.print("\n La suma de la columna [" + j + "] es: " + sumacolmas);
            }
        }
    }

}

package MatricezyArreglos;

import java.util.Scanner;

public class Matrix2 {
    // Problema 3:
    // Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primer fila.
    // Imprimir
    // la última fila e imprimir la primer columna.

    private Scanner entrada;
    private int[][] mat;

    public void cargar() {
        entrada = new Scanner(System.in);
        mat = new int[3][4];
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("ingrese el componente");
                mat[f][c] = entrada.nextInt();
            }

        }

    }

    public void primerafila() {
        System.out.println("primera fila de la matriz   ");
        for (int c = 0; c < 4; c++) {
            System.out.println(mat[0][c]);
        }
    }

    public void ultimafila() {
        System.out.println("Ultima fila de la matriz");
        for (int c = 0; c < 4; c++) {
            System.out.println(mat[2][c]);
        }
    }

    public void primercolumna() {
        System.out.println("Primera columna  de la matriz");
        for (int f = 0; f < 3; f++) {
            System.out.println(mat[f][0]);
        }
    }

    public static void main(String[] args) {

        Matrix2 mx = new Matrix2();
        mx.cargar();
        mx.primerafila();
        mx.primercolumna();
        mx.ultimafila();
    }

}

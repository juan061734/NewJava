package MatricezyArreglos;

import java.util.Scanner;

public class MatrizX {
    private Scanner entrada;
    private String[][] mat;

    public void cargar() {
        entrada = new Scanner(System.in);
        mat = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("ingrese la matriz");
                mat[i][j] = entrada.next();

            }

        }
    }

    public void imprimir() {
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(mat[f][c] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // Problema 2:
        // Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal
        // principal.

        // x - - -
        // - x - -
        // - - x -
        // - - - x

        MatrizX ma = new MatrizX();
        ma.cargar();
        ma.imprimir();
    }

}

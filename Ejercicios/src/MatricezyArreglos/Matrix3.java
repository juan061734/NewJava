package MatricezyArreglos;

import java.util.Scanner;

public class Matrix3 {
    // Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz
    // completa y la última fila.
    private int[][] mat;
    private Scanner entrada;

    public void cargardatos() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas = entrada.nextInt();
        mat = new int[filas][columnas];
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                System.out.println("ingrese el componente");
                mat[f][c] = entrada.nextInt();
            }

        }
    }

    public void imprimir() {
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print(mat[f][c] + " ");

            }
            System.out.println();

        }
    }

    public void imprimirUltimaFila() {
        System.out.println("Ultima fila");
        // restarle uno ya que las filas comienzan a numerarse a partir de cero:
        for (int c = 0; c < mat[mat.length - 1].length; c++) {
            System.out.print(mat[mat.length - 1][c] + " ");
        }
    }

    public static void main(String[] args) {

    }

}

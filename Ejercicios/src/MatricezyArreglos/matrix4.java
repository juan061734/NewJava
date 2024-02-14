package MatricezyArreglos;

import java.util.Scanner;

public class matrix4 {
    // Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir el mayor
    // elemento y la fila y columna donde se almacena.
    private int mat[][];
    private Scanner entrada;

    public void rellenar() {
        entrada = new Scanner(System.in);

        System.out.println("Ingrese cuántas filas tiene:");
        int filas = entrada.nextInt();
        System.out.println("Ingrese cuántas columnas tiene:");
        int columnas = entrada.nextInt();

        // Inicializar la matriz con el tamaño especificado
        mat = new int[filas][columnas];

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("Ingrese el componente [" + f + "][" + c + "]:");
                mat[f][c] = entrada.nextInt();
            }
        }
    }

    public void imprimirmayor() {
        int mayor = mat[0][0];
        int filam = 0;
        int colmM = 0;
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                if (mat[f][c] > mayor) {
                    mayor = mat[f][c];
                    filam = f;
                    colmM = c;
                }
            }
        }

        System.out.println("El elemento mayor es " + mayor);
        System.out.println("Se encuentra en la fila " + filam + " y en la columna " + colmM);
    }

    public static void main(String[] args) {
        matrix4 vr = new matrix4();
        vr.rellenar();
        vr.imprimirmayor();
    }
}

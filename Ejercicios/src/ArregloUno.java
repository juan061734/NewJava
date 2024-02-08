import java.util.Arrays;
import java.util.Scanner;

public class ArregloUno {

    // Método que imprime el elemento menor
    public static void imprimirElementoMenor(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("El elemento menor del array es: " + min);
    }

    // Método que imprime el elemento mayor
    public static void imprimirElementoMayor(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("El elemento mayor del array es: " + max);
    }

    // Método que imprime el promedio de los elementos
    public static void imprimirPromedio(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double promedio = (double) sum / array.length;
        System.out.println("El promedio de los elementos del array es: " + promedio);
    }

    // Método que ordena el vector
    public static void ordenarVector(int[] array) {
        Arrays.sort(array);
        System.out.println("El vector ordenado es: " + Arrays.toString(array));
    }

    // Método que imprime cada elemento con su valor duplicado
    public static void imprimirElementoDuplicado(int[] array) {
        System.out.println("Elementos duplicados del array:");
        for (int num : array) {
            System.out.println(num + " - " + (num * 2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] miArray = new int[n];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            miArray[i] = scanner.nextInt();
        }

        imprimirElementoMenor(miArray);
        imprimirElementoMayor(miArray);
        imprimirPromedio(miArray);
        ordenarVector(miArray);
        imprimirElementoDuplicado(miArray);

        scanner.close();
    }
}

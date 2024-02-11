import java.util.Scanner;

public class ascendenteydescendente {

    public static void ordenarAscendente(int[] vector) {
        int n = vector.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarDescendente(int[] vector) {
        int n = vector.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] < vector[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definimos el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        // Creamos el vector
        int[] vector = new int[n];

        // Solicitamos los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        // Solicitamos al usuario el tipo de ordenamiento
        System.out.print("Ingrese 'ascendente' o 'descendente' para ordenar el vector: ");
        String orden = scanner.next();

        // Ordenamos el vector según la opción seleccionada
        if (orden.equalsIgnoreCase("ascendente")) {
            ordenarAscendente(vector);
            System.out.println("Vector ordenado en orden ascendente:");
        } else if (orden.equalsIgnoreCase("descendente")) {
            ordenarDescendente(vector);
            System.out.println("Vector ordenado en orden descendente:");
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        // Imprimimos el vector ordenado
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }

        scanner.close();
    }
}

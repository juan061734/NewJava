public class duplicados {
    // 7: Eliminación de Duplicados: Crea un programa que elimine los elementos
    // duplicados de un vector.

    // Función para eliminar elementos duplicados del arreglo
    public static int removerElementosDuplicados(int lista[], int n) {
        // Verifica si el arreglo tiene 0 o 1 elemento
        if (n == 0 || n == 1) {
            return n; // Si es así, no hay elementos duplicados para eliminar, devuelve la longitud
                      // original del arreglo.
        }

        int[] temlist = new int[n]; // Crea un arreglo temporal para almacenar los elementos únicos
        int j = 0; // Variable para rastrear la posición en el arreglo temporal

        // Itera sobre el arreglo original
        for (int i = 0; i < n - 1; i++) {

            // Compara el elemento actual con el siguiente elemento
            if (lista[i] != lista[i + 1]) {
                temlist[j++] = lista[i]; // Si son diferentes, copia el elemento actual al arreglo temporal
            }
        }

        temlist[j++] = lista[n - 1]; // Agrega el último elemento del arreglo original al arreglo temporal

        // Copia los elementos del arreglo temporal de vuelta al arreglo original
        for (int i = 0; i < j; i++) {
            lista[i] = temlist[i];
        }

        return j; // Devuelve la nueva longitud del arreglo sin elementos duplicados
    }

    // Método principal
    public static void main(String[] args) {

        int lista[] = { 55, 55, 88, 66, 44, 555, 22, 88, 99, 66, 66, 88 };
        int longitud = lista.length;
        // Elimina elementos duplicados del arreglo y actualiza la longitud

        longitud = removerElementosDuplicados(lista, longitud);
        // Imprime el arreglo resultante sin duplicados
        for (int i = 0; i < longitud; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}

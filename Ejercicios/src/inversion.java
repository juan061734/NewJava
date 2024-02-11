public class inversion {
    // 5: Inversión de Vectores: Implementa un programa que invierta el orden de
    // los elementos en un vector.
    public static void main(String[] args) {

        int[] array = { 4, 5, 8, 9, 6, 3 };
        int[] aux = new int[array.length];

        for (int i = 0; i < array.length - 1; i++) {
            int j = array.length - i - 1;
            aux[j] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = aux[i];
            System.out.println(aux[i]);
        }

    }

}

package Taller1Java;

public class MINYMAX {

    public static void main(String[] args) {
        // 4: Mínimo y Máximo: Desarrolla un programa que encuentre el valor mínimo y
        // máximo en un vector dado.

        int[] valor = new int[] { 10, 15, 20, 2, 5, 6, 3, 4, };
        int mayor = valor[0];
        int menor = valor[0];

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] > mayor) {

                mayor = valor[i];
            }
            if (valor[i] < menor) {
                menor = valor[i];
            }
        }

        System.out.println("el numero menor es " + menor);
        System.out.println("el numero mayor es " + mayor);
    }
}

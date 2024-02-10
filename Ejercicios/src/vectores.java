import java.util.Scanner;

public class vectores {
    public static void main(String[] args) {

        int[] vector = new int[4];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese el valor del indice " + i);
            vector[i] = entrada.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {

            System.out.println(" ");
            System.out.println("Estoy en el indece " + i);
            System.out.println("Tengo guardado un " + vector[i]);

            System.out.println("---------------------");

        }
    }
}

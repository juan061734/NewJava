public class pares {
    // Contador de Elementos Pares: Escribe un programa que cuente y muestre la
    // cantidad de números pares en un vector.
    public static void main(String[] args) {

        int[] number = new int[] { 4, 8, 6, 3, 5, 8, 1, 20, };
        int pares = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                pares++;
            }

        }
        System.out.println("Existen " + pares + " numeros pares");
    }

}

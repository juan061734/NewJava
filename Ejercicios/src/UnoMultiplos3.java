
//1: Hacer un programa que ingrese en un vector
//de 10 posiciones los múltiplos de 3, se debe imprimir el vector.
public class UnoMultiplos3 {

    public static void main(String[] args) {
        int number[] = new int[10];
        int contar = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = contar;
            contar += 3;
            System.out.println(number[i]);

        }
    }
}

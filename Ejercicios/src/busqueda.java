import java.util.Scanner;

//9: Búsqueda de Elemento: Escribe un programa que busque la posición
// de un elemento dado en un vector.
public class busqueda {
    public static void main(String[] args) {

        int[] nums = new int[] { 10, 52, 20, 33, 55, 4, 25 };
        // almacenar la posicion del numero buscado
        int pos = -1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero ");
        int n = entrada.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.println("No se encontro el número");
        } else {
            System.out.println("la posicion de " + n + " es: " + pos);
        }
        entrada.close();
    }
}

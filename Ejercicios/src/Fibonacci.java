import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        double i;
        a = 0;
        b = 1;
        c = 1;
        System.out.print(a + " " + b + " " + c);
        for (i = 1; i <= 30; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(" " + c);
        }
        System.out.println("\n");
        entrada.close();
    }
}
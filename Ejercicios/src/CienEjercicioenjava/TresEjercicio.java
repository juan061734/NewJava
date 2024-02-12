package CienEjercicioenjava;

import java.util.Scanner;

public class TresEjercicio {
    // Ejercicio 3 Java.- Saber total a pagar, en base al descuento que se haga.
    // La pieza de pan cuesta a $5.
    // Si se compraron más de 50 piezas, cada pieza costará a $4.5
    // Si se compraron más de 100, cada pieza costará a $4.
    public static void main(String[] args) {
        int piezas = 0;
        double pago = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la cantidad de piezas ");
        piezas = entrada.nextInt();

        if (piezas > 50 && piezas < 100) {

            pago = piezas * 4.5;
        } else if (piezas >= 100) {

            pago = piezas * 4;
        } else {
            pago = piezas * 5;
        }
        System.out.println("El cliente compro " + piezas);
        System.out.println("total pagos es " + pago);
        entrada.close();

    }
}

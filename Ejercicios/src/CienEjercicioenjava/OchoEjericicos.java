package CienEjercicioenjava;

import java.util.Scanner;

public class OchoEjericicos {
    // Ejercicio 8 Java.- Programa para gestión de facturas.
    // El programa es para gestionar facturas de una empresa azucarera, que se
    // encarga de la venta por kilos; la factura pedirá el código del producto, la
    // cantidad de
    // kilos, el precio por cada kilo, y el importe de esa factura. Además,
    // por cada 5 facturas, nos dirá cuál de ellas sobrepasó
    // la cantidad de $1000, y nos dará la facturación total de esas 5 facturas.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String codigo = "";
        int kilos = 0;
        double precio = 0;
        double importe = 0;
        double facturatotal = 0;
        int contador = 0;
        int totalkilos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("factura " + (i + 1));
            System.out.println("ingrese el codigo ");
            codigo = entrada.next();
            System.out.println("ingrese en kilo ");
            kilos = entrada.nextInt();
            System.out.println("ingrese el precio ");
            precio = entrada.nextDouble();
            importe = kilos * precio;
            facturatotal = importe + facturatotal;

            if (importe >= 1000) {
                contador++;
            }
            totalkilos = kilos + totalkilos;

        }
        System.out.println("detalles de la venta");
        System.out.println("facturacion total " + facturatotal);
        System.out.println("El total de los kilos es " + totalkilos);
        entrada.close();

    }

}

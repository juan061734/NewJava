package CienEjercicioenjava;

import java.util.Scanner;

// 18.- Ejercicio 18 Java.- Usando métodos, calcular total a pagar, en base al descuento.
// El programa nos pedirá el número de piezas, y el precio por pieza. Si se compraron 100 o más piezas,
//  se aplicará un descuento del 20%. Crearemos un método que nos diga cuánto será el total a pagar.
public class dieciocho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el numero de piezas");
        int piezas = entrada.nextInt();
        System.out.println("ingrese el precio de las piezas ");
        double precio = entrada.nextInt();
        double pagototal = calcularPago(piezas, precio);
        System.out.println("El pago total es " + pagototal);
        entrada.close();
    }

    public static double calcularPago(int num_piezas, double pre) {

        double pagototal = 0;
        if (num_piezas >= 100) {
            pagototal = (pre * num_piezas) - (pre * 0.20 * num_piezas);
        } else {
            pagototal = (pre * num_piezas);

        }
        return pagototal;

    }

}

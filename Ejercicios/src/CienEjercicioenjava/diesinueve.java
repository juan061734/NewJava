package CienEjercicioenjava;

import java.util.Scanner;

import Taller1Java.duplicados;

public class diesinueve {
    // Ejercicio 19 Java.- Total a pagar por horas, en estacionamiento, usando
    // métodos.
    // //Programa que calcule el costo del estacionamiento en un parking. Las
    // primeras 3 horas se cobrarán a 20 pesos.
    // Las siguientes después de las 3 horas,
    // a 15 pesos. Hasta llegar al tope de 250 pesos, para 24 horas.
    // //Si se permanece aparcado por más de un día, se cobrarán 250 pesos por día.
    // Y 15 pesos las horas siguientes. Se
    // le pedirá al usuario ingresar la cantidad de horas, y debe obtener el precio.
    // Usar métodos.
    public static void main(String[] args) {
        int horas = 0;
        double preciototal = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cantidad de horas: ");
        horas = entrada.nextInt();

        preciototal = calcularPrecio(horas);
        System.out.println("El precio total es: " + preciototal);
    }

    public static double calcularPrecio(int nhoras) {
        double precio = 0;
        int dias = 0;
        int resthoras = 0;
        double precioresto = 0;

        if (nhoras <= 24) {
            if (nhoras <= 3) {
                precio = nhoras * 20;
            } else {
                precio = (3 * 20) + ((nhoras - 3) * 15);
            }
            if (precio >= 250) {
                precio = 250;
            }
        } else {
            dias = nhoras / 24;
            resthoras = nhoras % 24;
            precioresto = resthoras * 15;
            if (precioresto >= 250) {
                precioresto = 250;
            }
            precio = dias * 250 + precioresto;
        }

        return precio;
    }

}

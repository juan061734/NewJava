package MatricezyArreglos;

import java.util.Scanner;

public class vectores {
    // Desarrollar un programa que permita cargar 5 nombres de personas y sus edades
    // respectivas. Luego
    // de realizar la carga por teclado de todos
    // los datos imprimir los nombres de las personas mayores de edad (mayores o
    // iguales a 18 años)
    ;
    private Scanner entrada;
    private String[] nombres;
    private int[] edades;

    public void carga() {
        entrada = new Scanner(System.in);
        nombres = new String[5];
        edades = new int[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese nombre:");
            nombres[i] = entrada.next();
            System.out.print("Ingrese edad:");
            edades[i] = entrada.nextInt();
        }

    }

    public void MayoresEdada() {
        System.out.println("Personas mayores de edad");
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i]);

            }

        }
    }

    public static void main(String[] args) {
        vectores pv = new vectores();
        pv.carga();
        pv.MayoresEdada();
    }

}

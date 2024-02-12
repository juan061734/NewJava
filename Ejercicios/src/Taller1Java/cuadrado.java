package Taller1Java;
// 2:  Hacer un programa que pida ingresar 5 números por teclado y

// almacenarlo en un vector con su valor elevado al cuadrado

import java.util.Scanner;

public class cuadrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] number = new int[5];
        int numero;

        for (int i = 0; i < number.length; i++) {
            System.out.println("ingrese  el indice " + i);
            number[i] = (int) Math.pow(numero = entrada.nextInt(), 2);

            System.out.println("su cuadrado es " + number[i]);
        }

        entrada.close();
    }
}

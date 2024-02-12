package CienEjercicioenjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DiezEjercicio {
    public static void main(String[] args) {
        // Ejercicio 10 Java.- Introducir N sueldos, y al final mostrarle el sueldo
        // mayor(Con JOptionPane).
        // El programa pedirá elegir la cantidad de sueldos, y después los introducimos
        // con el teclado. Al final mostrará en pantalla cuál sueldo es el mayor.

        int nSueldo = 0;
        boolean primersueldo = false;
        int sueldomaximo = 0, sueldo = 0;

        nSueldo = Integer.parseInt(JOptionPane.showInputDialog("ingrese los sueldo a capturar"));

        for (int i = 0; i < nSueldo; i++) {

            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo" + (i + 1)));

            if (primersueldo == false) {
                sueldomaximo = sueldo;
                primersueldo = true;
            }
            if (sueldo > sueldomaximo) {
                sueldomaximo = sueldo;
            }
        }
        System.out.println("El sueldo mayor es " + sueldomaximo);

    }

}

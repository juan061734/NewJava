package CienEjercicioenjava;

import java.util.Scanner;

public class NueveEjericicio {
    public static void main(String[] args) {
        // Ejercicio 9 Java.- Introducir notas de 6 alumnos, y saber cuántos aprobaron y
        // reprobaron.
        // El programa nos pedirá 6 calificaciones a introducir, y al final nos dirá
        // cuántos alumnos aprobaron,
        // cuántos tuvieron calificación de "excelencia", y cuántos reprobaron.
        Scanner entrada = new Scanner(System.in);
        double calificaciones = 0;
        double excelencia = 0, reprobado = 0, aprobados = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese la calificación del estudiante " + (i + 1));
            calificaciones = entrada.nextDouble();
            if (calificaciones >= 9 && calificaciones <= 10) {
                excelencia++;
            } else if (calificaciones >= 6) {
                aprobados++;
            } else {
                reprobado++;
            }
        }

        System.out.println("La cantidad de estudiantes por excelencia es " + excelencia);
        System.out.println("La cantidad de estudiantes por aprobados es " + aprobados);
        System.out.println("La cantidad de estudiantes reprobados es " + reprobado);
        entrada.close();

    }
}
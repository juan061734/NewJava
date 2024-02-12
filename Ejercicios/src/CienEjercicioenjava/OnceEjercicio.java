package CienEjercicioenjava;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class OnceEjercicio {
    // Ejercicio 11 Java.-de 5 alumnos,
    // saber cuáles
    // reprobaron(Con ventanas emergentes).
    // Iremos capturando el número de control y calificación de cada alumno, de un
    // total de 5
    // alumnos. El programa nos irá
    // mostrando en pantalla cuáles han reprobado.

    public static void main(String[] args) {

        String control = "";
        int calificacn = 0;
        boolean reprobado = false;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            control = JOptionPane.showInputDialog("iNGRESE EL CODIGO DEL ALUMNO " + (i + 1));
            calificacn = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Ingrese la califaciacion del estudiante " + (i + 1)));

            if (calificacn < 6) {
                reprobado = true;

            }
            if (reprobado == true) {
                JOptionPane.showMessageDialog(null, "El estudiante de control " + control + " ha reprobado");
            } else {
                JOptionPane.showMessageDialog(null, "El estudiante de control " + control + " ha aprobado ");

            }

        }
        entrada.close();

    }

}

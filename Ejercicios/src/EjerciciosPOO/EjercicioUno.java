package EjerciciosPOO;
// Ejercicio 1: Construir un programa que calcule el área y el perímetro de un 

import javax.swing.JOptionPane;

// cuadrilátero dada la longitud de sus dos lados.Los valores de la longitud deberán introducirse por línea 
// de ordenes.Si es un cuadrado,sólo se proporcionará la longitud de uno de los lados al constructor.

public class EjercicioUno {

    private float lado1;
    private float lado2;

    // Methodo constructor 1
    public EjercicioUno(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Metodo constructor 2 (funciona si un cuadrado)
    public EjercicioUno(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro() {
        float perimetro = 2 * lado1 * lado2;
        return perimetro;
    }

    public float getArea() {
        float area = lado1 * lado1;
        return area;
    }

    public static void main(String[] args) {
        EjercicioUno c1;
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL LADO 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL LADO 2"));

        if (lado1 == lado2) {
            c1 = new EjercicioUno(lado1);
        } else {
            c1 = new EjercicioUno(lado1, lado2);
        }

        System.out.println("El perimetro es " + c1.getPerimetro());
        System.out.println("El area es " + c1.getArea());

    }

}

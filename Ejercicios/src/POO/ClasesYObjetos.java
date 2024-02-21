package POO;

import javax.swing.JOptionPane;

public class ClasesYObjetos {
    // atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // el void no retorna se usa void
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));

    }

    // no retorna
    public void sumar() {
        suma = numero1 + numero2;

    }

    public void restar() {
        resta = numero1 - numero2;

    }

    public void multiplicar() {
        multiplicacion = numero1 * numero2;

    }

    public void dividir() {
        division = numero1 / numero2;

    }

    public void resultado() {
        System.out.println("La resta es " + resta);
        System.out.println("La suma es " + suma);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);

    }

    public static void main(String[] args) {
        // new objeto
        ClasesYObjetos op = new ClasesYObjetos();

        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.resultado();

    }
}
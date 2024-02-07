import java.util.Scanner;

public class calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede divir por 0");
            return Double.NaN;

        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora del Sena (Supongamos)");

        System.out.println("ingrese el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = entrada.nextInt();

        System.out.println("Seleccione la operación a realizar");

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese el número de la operación: ");
        int opcion = entrada.nextInt();

        double resultado = 0;

        if (opcion == 1) {
            resultado = sumar(num1, num2);
        } else if (opcion == 2) {
            resultado = resta(num1, num2);
        } else if (opcion == 3) {
            resultado = multiplica(num1, num2);
        } else if (opcion == 4) {
            resultado = dividir(num1, num2);
        } else {
            System.out.println("Opción no válida.");
        }
        System.out.println("El resultado de la operación es: " + resultado);
        entrada.close();
        ;

    }
}

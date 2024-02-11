
public class promedio {
    // 8: Promedio y Desviación Estándar: Desarrolla un programa que calcule el
    // promedio de
    // un vector de números.
    public static double promedio(int[] vector) {

        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        double promedio = (double) suma / vector.length;
        return promedio;
    }

    public static void main(String[] args) {

        int[] vector = { 4, 5, 8, 9, 6, 3, 4 };
        double promedio = promedio(vector);

        System.out.println("El promedio del vector es " + promedio);
    }
}
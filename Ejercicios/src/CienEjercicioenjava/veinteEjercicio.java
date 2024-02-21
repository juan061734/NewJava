package CienEjercicioenjava;

public class veinteEjercicio {
    // Crearemos un arreglo de 6 posiciones, que contendrá valores entre
    // 1 y 100, aleatoriamente, para eso se usará el método random, de la clase Math
    // . Posteriormente, ese arreglo será pasado al método, y ese método al final
    // nos devolverá cuál es el mayor del arreglo.
    // Playlist destacada

    public static void main(String[] args) {
        int max;
        int t[] = new int[6];
        System.out.println("Llenar lso arreglos aleatorios " + " entre 1 y 100");

        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * 100 + 1);
        }
    }

}

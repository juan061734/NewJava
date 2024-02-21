package POOModificate;

public class Clasedos {
    public static void main(String[] args) {
        Classuno objeto1 = new Classuno();

        // ocultar datos
        objeto1.setEdad(10);
        System.out.println("La edad es " + objeto1.getedad());

        objeto1.setNombre("Pablo ");
        System.out.println("El nombre es " + objeto1.getNombre());
    }
}

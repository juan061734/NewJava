package POO;

public class Coche {
    String color;
    String marca;
    int km;

    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.color = "blanco";
        coche1.marca = "audi";
        coche1.km = 0;

        System.out.println("el color del coche1 es " + coche1.color);
        System.out.println("la marca del coche1 es " + coche1.marca);
        System.out.println("el kilometraje del coche1 es " + coche1.km);

    }
}

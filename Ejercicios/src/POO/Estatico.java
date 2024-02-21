package POO;

public class Estatico {
    private String frase = "Primera frase";

    public static void main(String[] args) {
        Estatico op = new Estatico();
        Estatico op1 = new Estatico();

        op1.frase = "Segunda frase";
        System.out.println(op.frase);
        System.out.println(op1.frase);
    }

}

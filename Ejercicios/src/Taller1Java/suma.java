public class suma {
    public static void main(String[] args) {

        // 3: Suma de Vectores: Escribe un programa que
        // sume dos vectores de igual longitud y muestre el resultado.
        int[] numberOne = new int[] { 5, 4 };
        int[] numbertwo = new int[] { 4, 8 };

        for (int i = 0; i < numberOne.length && i < numbertwo.length; i++) {
            System.out.println(numberOne[i] + numbertwo[i]);

        }
    }
}

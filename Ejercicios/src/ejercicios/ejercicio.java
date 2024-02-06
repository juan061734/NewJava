// //En un almacén, cada que se realiza una venta se elabora un registro con el nombre del articulo,
//  el precio por unidad y la cantidad de
// artículos vendidos. Suponiendo que se hicieron 5 ventas, elabore un algoritmo que imprima por cada venta
//  el nombre del articulo y el valor total de la venta. 

import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // String nombreV;
        // double precioP;
        // int cantidad;

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Venta " + (i + 1) + " :");

        // System.out.println("ingrese el nombre del articulo");
        // nombreV = entrada.next();
        // System.out.println("ingrese el precio del articulo");
        // precioP = entrada.nextDouble();
        // System.out.println("ingrese la cantidad del articulo");
        // cantidad = entrada.nextInt();

        // double Neto = precioP * cantidad;

        // System.out.println("nombre del articulo " + nombreV);
        // System.out.println("El valor total de la venta es $" + Neto);
        // }

        // 3. ejercicio Elabore un algoritmo que lea el nombre, la edad y la estatura de
        // un grupo de 20 personas,
        // e imprima el nombre solo de las personas que
        // sean mayores de edad y que su estatura sea mayor de 1.80 mts.

        // String nombre;
        // int edad;
        // double estatura;

        // System.out.println("Ingrese los datos de las 20 personas:");

        // for (int i = 0; i < 20; i++) {
        // System.out.println("Persona " + (i + 1) + ":");

        // System.out.print("Nombre: ");
        // nombre = entrada.nextLine();

        // System.out.print("Edad: ");
        // edad = Integer.parseInt(entrada.nextLine());

        // System.out.print("Estatura (en metros): ");
        // estatura = Double.parseDouble(entrada.nextLine());

        // if (edad >= 18 && estatura > 1.80) {
        // System.out.println("Nombre: " + nombre);
        // }
        // }

        // 4. Un ama de casa requiere comprar 15 productos. Realizar un algoritmo que
        // capture el
        // precio de cada producto y al final indique cuantos productos costaron menos
        // de 10000 y
        // 10000 o más. Además debe indicar el total de la compra.

        int productoMenosD = 0;
        int productoMayorD = 0;
        double TotalCompra = 0, valorproducto;
        int cantidad;
        String nombre;

        for (int i = 1; i < 3; i++) {

            System.out.println("Ingrese el nombre del producto " + i + ": ");
            nombre = entrada.next();
            System.out.println("ingrese la cantidad del producto " + i + ": ");
            cantidad = entrada.nextInt();
            System.out.println("Precio del producto " + i + ": ");
            double preciop = entrada.nextDouble();

            valorproducto = preciop * cantidad;
            TotalCompra += valorproducto;

            if (preciop < 10000) {
                productoMenosD++;
            } else {
                productoMayorD++;
            }
        }

        System.out.println("Productos que cuestan meno de 10000 :" + productoMenosD);
        System.out.println("Productos que son Mayor de 10000: " + productoMayorD);
        System.out.println("Total de la compra : " + TotalCompra);

    }
}

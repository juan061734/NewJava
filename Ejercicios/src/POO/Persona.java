package POO;

public class Persona {
    // atributos
    String nombre;
    int edad;

    // metoods constructor no se pone en void no retorna valores
    public Persona(String _nombre, int edad_) {
        this.nombre = _nombre;
        this.edad = edad_;
    }

    public void mostrarDatos() {
        System.out.println("le nombre es " + nombre);
        System.out.println("la edad es " + edad);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Alejandro", 21);
        p1.mostrarDatos();
    }

}

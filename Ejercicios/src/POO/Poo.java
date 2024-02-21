package POO;

//SOBRE CARGA DE CONSTRUCTORES Y METODOS
public class Poo {

    String nombre;
    int edad;
    String dni;

    // cosntructores sobrecargados
    public Poo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Poo(String dni) {
        this.dni = dni;
    }

    // metodos sin retornos
    public void correr() {
        System.out.println("Soy " + nombre + "tengo tantos años " + edad + "estoy corriendo una maraton");
    }

    public void correr(int km) {
        System.out.println("He corriedo " + km + "Kilometros");
    }

    public static void main(String[] args) {
        Poo persona1 = new Poo("Juan", 21);
        persona1.correr();
        Poo persona2 = new Poo("123456");
        persona2.correr(150);

    }

}

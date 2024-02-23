package POOFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static void readStudent() {
        String identificacion, nombre, email;
        int numeroEstudiantes;
        System.out.print("Ingrese la cantidad de estudiantes: ");
        numeroEstudiantes = input.nextInt();
        for (int i = 1; i <= numeroEstudiantes; i++) {
            System.out.println("Estudiante #" + i);

            System.out.print("Identificacion: ");
            identificacion = input.next();

            System.out.print("Nombre: ");
            nombre = input.next();

            System.out.print("Email: ");
            email = input.next();

            Estudiante estudiante = new Estudiante();

            estudiante.setIdentificacion(identificacion);
            estudiante.setNombre(nombre);
            estudiante.setEmail(email);
            estudiantes.add(estudiante);
        }
    }

    public static void getStudents() {
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Estudiante #" + (i + 1));
            System.out.println(estudiantes.get(i).getIdentificacion());
            System.out.println(estudiantes.get(i).getNombre());
            System.out.println(estudiantes.get(i).getEmail());
        }
    }

    public static void getStudentById() {
        System.out.print("Digite la identificacion que quiere buscar: ");
        String id = input.next();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdentificacion().equals(id)) {
                System.out.println(estudiantes.get(i).getIdentificacion());
                System.out.println(estudiantes.get(i).getNombre());
                System.out.println(estudiantes.get(i).getEmail());
            }
        }
    }

    public static void updateStudent() {
        System.out.println("Digite la identificacion del estudiante a actualizar");
        String id = input.next();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdentificacion().equals(id)) {
                System.out.println("Estudiante encontrado");
                System.out.println(estudiantes.get(i).getIdentificacion());
                System.out.println(estudiantes.get(i).getNombre());
                System.out.println(estudiantes.get(i).getEmail());

                System.out.println("Nuevo nombre: ");
                String newName = input.next();

                estudiantes.get(i).setNombre(newName);
                System.out.println("Nombre actualizado: " + estudiantes.get(i).getNombre());

                System.out.println("Nuevo email: ");
                String newEmail = input.next();

                estudiantes.get(i).setEmail(newEmail);
                System.out.println("Email actualizado: " + estudiantes.get(i).getEmail());

            }
        }

    }

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Menú:");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Mostrar Todos los Estudiantes");
            System.out.println("3. Buscar Estudiante por ID");
            System.out.println("4. Actualizar Estudiante");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = input.nextInt();

            if (opcion == 1) {
                readStudent();
            } else if (opcion == 2) {
                getStudents();
            } else if (opcion == 3) {
                getStudentById();
            } else if (opcion == 4) {
                updateStudent();
            } else if (opcion == 5) {
                System.out.println("Saliendo del menú...");
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        }
    }
}

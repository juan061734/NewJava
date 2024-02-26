package PracticeJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void Ingresar() {
        Alumno alumnos = new Alumno();
        int edad, dni, nEstudiantes;
        String apellido, nombre;
        System.out.println("Ingrese la cantidad de Alumnos");
        nEstudiantes = entrada.nextInt();

        for (int i = 1; i <= nEstudiantes; i++) {
            System.out.println("Alumno #" + i);
            System.out.println("DNI");
            dni = entrada.nextInt();
            System.out.println("Nombre: ");
            nombre = entrada.next();
            System.out.println("Apellido: ");
            apellido = entrada.next();
            System.out.println("Edad: ");
            edad = entrada.nextInt();

            alumnos.Setdni(dni);
            alumnos.Setnombre(nombre);
            alumnos.Setapellido(apellido);
            alumnos.Setedad(edad);
        }

    }

    public static void MostrarAlumno() {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i).Getdni());
            System.out.println(alumnos.get(i).Getnombre());
            System.out.println(alumnos.get(i).Getapellido());
            System.out.println(alumnos.get(i).Getedad());

        }
    }

    public static void BuscarAlumno() {
        System.out.println("Ingrese el DNI del alumno");
        int dni = entrada.nextInt();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).Getdni() == dni) {
                System.out.println(alumnos.get(i).Getdni());
                System.out.println(alumnos.get(i).Getnombre());
                System.out.println(alumnos.get(i).Getapellido());
                System.out.println(alumnos.get(i).Getedad());

            } else {
                System.out.println("El alumno no se encuentra registrado");
            }

        }
    }

    public static void ActualizarAlumno() {
        int option = 0;
        System.out.println("Ingrese el DNI del estudiante");
        int dni = entrada.nextInt();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).Getdni() == dni) {

                System.out.println("Menú");
                System.out.println("1.Actualizar Nombre ");
                System.out.println("2.Actualizar Apellido ");
                System.out.println("3.Actualizar Edad ");
                System.out.println("4.Todo");
                option = entrada.nextInt();
            } else if (option == 1) {
                System.out.println("Cambiar nombre");
                String newName = entrada.next();
                alumnos.get(i).Setnombre(newName);
                System.out.println("Nuevo nombre " + alumnos.get(i).Getnombre());

            } else if (option == 2) {
                System.out.println("Cambiar apellido");
                String newApellido = entrada.next();
                alumnos.get(i).Setapellido(newApellido);
                System.out.println("Nuevo apellido" + alumnos.get(i).Getapellido());

            } else if (option == 3) {
                System.out.println("Cambiar edad");
                int newEdad = entrada.nextInt();
                alumnos.get(i).Setedad(newEdad);
                System.out.println("Nuevo edad actualziada" + alumnos.get(i).Getedad());
            } else if (option == 4) {
                System.out.println("Cambiar nombre");
                String newName = entrada.next();
                alumnos.get(i).Setnombre(newName);
                System.out.println("Cambiar apellido");
                String newApellido = entrada.next();
                alumnos.get(i).Setapellido(newApellido);
                System.out.println("Cambiar edad");
                int newEdad = entrada.nextInt();
                alumnos.get(i).Setedad(newEdad);
                System.out.println("****************************************");
                System.out.println("Nuevo nombre " + alumnos.get(i).Getnombre());
                System.out.println("Nuevo apellido" + alumnos.get(i).Getapellido());
                System.out.println("Nuevo edad actualziada" + alumnos.get(i).Getedad());

            }

        }
    }

    public static void DeleteById() {
        int option = 0;
        System.out.println("Ingrese el DNI del alumno");
        int dni = entrada.nextInt();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).Getdni() == dni) {
                System.out.println("Alumno en contrado");
                System.out.println(alumnos.get(i).Getdni());
                System.out.println(alumnos.get(i).Getnombre());
                System.out.println(alumnos.get(i).Getapellido());
                System.out.println(alumnos.get(i).Getnombre());
                System.out.println("*****************************************");
                System.out.println("¿Seguro que quieres Eliminar estos Datos?");
                System.out.println("1.Si");
                System.out.println("2.No");
                option = entrada.nextInt();

            } else if (option == 1) {
                alumnos.remove(i);
            } else if (option == 2) {
                return;
            } else {
                System.out.println("Alumno no encontrado");
            }

        }
    }

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("Bienvenido al menú");
            System.out.println("Ingresa una opcion ");
            System.out.println("1.Agregar Alumno");
            System.out.println("2.Mostras alumnos");
            System.out.println("3.Buscar alumnos");
            System.out.println("4.Actualizar datos");
            System.out.println("5.Eliminar alumno");
            System.out.println("6.Salir");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                Ingresar();
            } else if (opcion == 2) {
                MostrarAlumno();
            } else if (opcion == 3) {
                BuscarAlumno();
            } else if (opcion == 4) {
                ActualizarAlumno();
            } else if (opcion == 5) {
                DeleteById();
            } else if (opcion == 6) {
                System.out.println("Saliendo del menú");
            } else {
                System.out.println("Ingresa una opción valida");
            }

        } while (opcion != 6);

    }

}

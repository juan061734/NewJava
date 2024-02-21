//Encapsulamiento y metodos accesores
package POOModificate;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class Classuno {
    // modificador de asesor public o private
    //
    private int edad;
    private String nombre;

    // Establecer o leer
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // devolver con el Get mostramos la edad
    public int getedad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

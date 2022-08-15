/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:04/07/2022
 * Tema:Encapsulamiento poo
 * Unidad:Unidad 3
 * Practica 15
 *
 * */
package encapsulamiento;

public class Animal {

    private String nombre;
    private int edad;
    private String raza;

    //metodo accesor get y set para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo acceso para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metido accesor para raza
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

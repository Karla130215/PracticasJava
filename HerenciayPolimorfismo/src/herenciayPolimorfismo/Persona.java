/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:05/07/2022
 * Tema:Herencia y polimormismo poo
 * Unidad:Unidad 3
 * Practica 17
 *
 * */
package herenciayPolimorfismo;


public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    
    public Persona(){
    
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public void printMessage(){
        System.out.println("Soy una persona");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}

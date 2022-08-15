/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:04/07/2022
 * Tema:Encapsulamiento poo
 * Unidad:Unidad 3
 * Practica 15
 *
 * */
package encapsulamiento;

public class Main {

    public static void main(String[] args) {
        //creamos el objeto
        Animal perro = new Animal();
        perro.setNombre("Tony");
        perro.setEdad(2);
        perro.setRaza("pitbull");

        System.out.println("El nombre del perro es:" + perro.getNombre());
        System.out.println("La edad del perro es: " + perro.getEdad());
        System.out.println("la raza del perro es: " + perro.getRaza());

        //craer objeto perico
        Animal perico = new Animal();
        perico.setNombre("periquin");
        perico.setEdad(1);
        perico.setRaza("huasteca");

        System.out.println("Los datos del segundo objeto*********");
        System.out.println("El nombre del perico es" + perico.getNombre() + " "+"edad" +" "+ perico.getEdad() +" "+ "Raza:" + perico.getRaza());

        
    }

}

/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:05/07/2022
 * Tema:Herencia y polimormismo poo
 * Unidad:Unidad 3
 * Practica 17
 *
 * */
package herenciayPolimorfismo;


public class Main {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();
        empleado.setNombre("karla");
        empleado.setEdad(15);
        empleado.setSexo('m');
        
        empleado.setNumeroEmpleado(1329);
        empleado.setPuesto("Programador");
        empleado.setDepartamente("sistemas");
        System.out.println("Mi nombre es"+empleado.getNombre());
        System.out.println("mi edad"+empleado.getEdad());
        empleado.printMessage();
    }
}

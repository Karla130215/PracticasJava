/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:05/07/2022
 * Tema:Herencia y polimormismo poo
 * Unidad:Unidad 3
 * Practica 17
 *
 * */
package herenciayPolimorfismo;

/**
 *
 * @author LENOVO
 */
public class Empleado extends Persona {
    private int numeroEmpleado;
    private String departamente;
    private String puesto;
    
    //xonstructor sin parametros
     public Empleado(){
     }
//nombre,edad,sexo vienen de la clase persona pero se tiene que inicializar y se inicializa con el super y en los parametros tambien se agregan
    public Empleado(String nombre,int edad,char sexo,int numeroEmpleado, String departamente, String puesto) {
        super(nombre,edad,sexo);
        this.numeroEmpleado = numeroEmpleado;
        this.departamente = departamente;
        this.puesto = puesto;
    }
    //se necesitan setter and getter

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamente() {
        return departamente;
    }

    public void setDepartamente(String departamente) {
        this.departamente = departamente;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    //polimormismo ocuparemos la sobreescritura
    
    @Override
    public void printMessage(){
        System.out.println("soy un ingenriero y aqui estoy sobreescribiendo");
    }
    
}

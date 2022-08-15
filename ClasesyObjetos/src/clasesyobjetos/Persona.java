package clasesyobjetos;

public class Persona {

    String nombre;
    double estatura;
    int edad;
    //metodo contrcutor siempre es publico se inicializa

    public Persona(String _nombre, double _estatura, int _edad) {
        this.nombre = _nombre;
        this.estatura = _estatura;
        this.edad = _edad;
    }
//se hace el metodo con void porque no retorna nada
    public void imprimirDatos() {
        System.out.println("El nombre es"+nombre);
        System.out.println("La estatus es"+estatura);
        System.out.println("La edad es "+edad);
    }
}

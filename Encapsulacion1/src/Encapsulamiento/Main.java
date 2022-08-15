package Encapsulamiento;

public class Main {

    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.setNombre("Tovi");
        perro.setEdad(3);
        perro.setRaza("chihuahua");
        System.out.println("el nombre es]:" + perro.getNombre());
        Carrera programacion=new Carrera();
        programacion.setNombreAlumno("Karla Elizabeth");
        programacion.setMatricula(12345);
        programacion.setMateria("ingles");
        
        
        System.out.println("Los datos son de los animales bueno el nombre"+perro.getNombre());
        System.out.println("el dato de la humana su carrera el nombre de ella es"+programacion.getNombreAlumno());
        
        
    }
    

}

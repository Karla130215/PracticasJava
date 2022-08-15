/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:22/06/2022
 * Tema:Arreglos Dinamicos
 * Unidad:Unidad 1
 * Practica 15
 *
 * */
package arreglosdinamicos;

import java.util.ArrayList;
import java.util.List;

public class ArreglosDinamicos {

    public static void main(String[] args) {
        //Recordar que se agregan dos librerias
//        List<String> animales = new ArrayList<>();
//        animales.add("leon");
//        animales.add("tigre");
//        animales.add("perro");
//        animales.add("gato");
//        animales.add("perico");
//        System.out.println("Nombres:"+animales);
//        animales.add("sabuezo");
//        System.out.println("Nombres Nuevos"+animales);
//        //poniendo su poccion para el acmbio
//        
//        animales.add(1,"liendre");
//        System.out.println("Nombres Actualizados"+  animales);
 List<String>lenguajesProgramacion =new ArrayList<>();
 lenguajesProgramacion.add("java");
 lenguajesProgramacion.add("python");
 lenguajesProgramacion.add("c++");
        System.out.println("Nombres:"+lenguajesProgramacion);
        lenguajesProgramacion.add("php");
        System.out.println("Nombres:"+lenguajesProgramacion);
        lenguajesProgramacion.add(0,"c#");
        System.out.println("Lenguajes Populares"+lenguajesProgramacion);
        //Remover elemento php
        lenguajesProgramacion.remove("php");
        System.out.println("nombres"+lenguajesProgramacion);
 
    }

}

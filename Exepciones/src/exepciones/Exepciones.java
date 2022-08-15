/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:05/07/2022
 * Tema:Exepciones poo
 * Unidad:Unidad 3
 * Practica 16
 *
 * */
package exepciones;

public class Exepciones {

    public static void main(String[] args) {
        try {
            System.out.println("Intentamos ejecutar el bloque");
            System.out.println("Intruccion1");
//            System.out.println("Instruccion2");
//            System.out.println("etc...");
            
            
            //ertror en tiempo de error
            int n =Integer.parseInt("n");
            System.out.println("Despues del error");

        } catch (Exception e) {
            System.out.println("el error es "+e);

        }finally{
            System.out.println("Instrucciones finalizadas");
    }

    }

}

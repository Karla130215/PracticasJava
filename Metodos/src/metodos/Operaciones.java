/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:05/07/2022
 * Tema:Metodos y funciones poo
 * Unidad:Unidad 3
 * Practica 15
 *
 * */
package metodos;


public class Operaciones {
    //atributos
    
    int suma,resta;
    //no retorna nada
    public void bienvenida(){
        System.out.println("Bienvendio");
    }
    
    public void sumar(int numero1,int numero2){
    suma=numero1+numero2;
    
    }
    public void restar(int numero1,int numero2){
    resta=numero1-numero2;
    
    }
    public void resultado(){
        System.out.println("Suma"+suma);
        System.out.println("Resta"+resta);
    }
}

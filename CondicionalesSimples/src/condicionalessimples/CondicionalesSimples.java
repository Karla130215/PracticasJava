/**Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:17/06/2022
 * Tema:Condicionales Simples
 * Unidad:Unidad 1
 * Practica 7
 
 **/
package condicionalessimples;


public class CondicionalesSimples {

    
    public static void main(String[] args) {
        int edad=8;
        
        if (edad>=18) {
            System.out.println("Eres Mayor de edad "+edad);
            
        }else{
            System.out.println("Eres Menor de edad");
        }
        
        if (edad>=5 && edad<=10) {
            System.out.println("Estas en clase1");
            
        }
        else{
            System.out.println("perteneces a una edad menor");
        }
                
    }
    
}

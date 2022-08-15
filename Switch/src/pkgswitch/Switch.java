/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:17/06/2022
 * Tema:Switch
 * Unidad:Unidad 1
 * Practica 9
 *
 * */
package pkgswitch;

public class Switch {

    public static void main(String[] args) {
//        char vocal = 'h';
//        switch (vocal) {
//            case 'A':
//                System.out.println("Letra seleccionada a");
//                break;
//            case 'B':
//                System.out.println("B letra seleccionada b");
//                break;
//            case 'C':
//                System.out.println("C letra seleccionada c");
//                break;
//            case 'D':
//                System.out.println("D letra seleccionada d");
//                break;
//            default:
//               System.out.println("Opcion invalida"); 
//
//                
//        }
//Nuevo switch
        int mes = 2;
        String nombreMes = "";
        switch (mes) {
            case 1 ->
                nombreMes = "Enero";
            case 2 ->
                nombreMes = "Febrero";
            case 3 ->
                nombreMes = "Marzo";
            case 4 ->
                nombreMes = "Abril";
            case 5 ->
                nombreMes = "Mayo";
            case 6 ->
                nombreMes = "Junio";
            case 7 ->
                nombreMes = "Julio";
            case 8 ->
                nombreMes = "Agosto";
            case 9 ->
                nombreMes = "Septiembre";
            case 10 ->
                nombreMes = "Octubre";
            case 11 ->
                nombreMes = "Noviembre";
            case 12 ->
                nombreMes = "Diciembre";
        }
        System.out.println("El nombre de mes es: "+nombreMes);

    }

}

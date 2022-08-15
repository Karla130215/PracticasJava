/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:18/06/2022
 * Tema:Arreglos Multidimencionales
 * Unidad:Unidad 1
 * Practica 14
 *
 * */
package arreglosmultidimencionales;


public class ArreglosMultidimencionales {

    
    public static void main(String[] args) {
//       int [][]numeros=new int[3][3];
//       int i,j;
//       //recorre filas
//        for ( i = 0; i < numeros.length; i++) {
//            System.out.println();
//            //recorre columnas
//            for ( j = 0; j < numeros.length; j++) {
//                System.out.print("numero"+numeros[i][j]+" "); 
//            }

//int[][]numeros=new int [3][3];
//int i,j;//f=filas,c=columnas
////recorrer filas
//for ( i = 0; i < numeros.length; i++) {
//            System.out.println("");
//            //recorrer columnas
//            for (j = 0; j < numeros.length; j++) {
//                System.out.print("valores"+numeros[i][j]+" ");
//    }
//        }


String[][] nombres=new String[4][4];
int k,g;
nombres[0][0]="karla";
nombres[1][0]="reina";
nombres[2][0]="Gustavo";
nombres[3][0]="Maria";

//filas
        for ( k = 0; k < nombres.length; k++) {
            System.out.println("");
            //columnas
            for ( g = 0; g < nombres.length; g++) {
                System.out.print("valores: "+nombres[k][g]+" ");
            }
        }
        }
    }
    

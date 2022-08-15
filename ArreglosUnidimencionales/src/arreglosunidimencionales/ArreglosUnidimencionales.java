/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:17/06/2022
 * Tema:Arreglos Unidimencionales
 * Unidad:Unidad 1
 * Practica 13
 *
 * */
package arreglosunidimencionales;

public class ArreglosUnidimencionales {

    public static void main(String[] args) {
        // Declarar e inacializar array
//        int notas[] = new int[5];
//        notas[0] = 13;
//        notas[1] = 14;
//        notas[2] = 15;
//        notas[3] = 16;
//        notas[4] = 17;
//        System.out.println("Notas"+notas[4]);

//int notas[]={13,14,15,16,17};
//        for (int i = 0; i<notas.length; i++) {
//            System.out.println("Notas:"+notas[i]);
//            
//        }

//String notas[]={"karla","gustavo","Maria","Jose","Manuel","Lucero"};
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Los datos son:" +notas[i]); 
//        }
//        


//int cal[]={10,9,8,7,6,5,8,9};
//        for (int i = 0; i < cal.length; i++) {
//            if (cal[i]>=8) {
//                System.out.println("Aprobado"+cal[i]);
//                
//            }
//            else if(cal[i]>5 && cal[i]<=7){
//                System.out.println("Tienes que Tomar cursos de recuperacion"+cal[i]);
//        
//        }
//            else{
//                System.out.println("Reprobado"+cal[i]);
//            }
//            
//        }

int cal[]={10,9,8,7,6,4,7};
        for (int i = 0; i < cal.length; i++) {
            if (cal[i]>5) {
                System.out.println("Calificaciones Aprobadas:"+cal[i]);
                
            }
            else{
                System.out.println("Reprobado"+cal[i]);
            }
            
            
        }
    }

}

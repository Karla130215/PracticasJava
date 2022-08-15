/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:23/06/2022
 * Tema:MVC ---MAIN
 * Unidad:Unidad 1
 * Practica 16
 *
 * */
package mvc;

import controller.Controlador;
import model.Modelo;
import views.Vista;

public class MVC {
    
    public static void main(String[] args) {
        Vista vista_prueba = new Vista();
        Modelo modelo_prueba = new Modelo();
        Controlador controlador_prueba = new Controlador(vista_prueba, modelo_prueba);
        vista_prueba.setVisible(true);
    }
    
}

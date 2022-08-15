/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:24/06/2022
 * Tema:MVC ---MAIN
 * Unidad:Unidad 1
 * Practica 16
 *
 * */
package main;

import controller.Controlador;
import model.Modelo;
import views.Vista;



public class Principal {
    public static void main(String[] args) {
     //mandamos a llamar todo con objetos 
     
     Vista vistaObjeto=new Vista();
     Modelo modeloObjeto=new Modelo();
     Controlador controladorObjeto=new Controlador(vistaObjeto,modeloObjeto);
     //esta linea es para que nos visualice nuestra vista
     vistaObjeto.setVisible(true);
    }
}

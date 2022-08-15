/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:23/06/2022
 * Tema:MVC ---CONTROLADOR
 * Unidad:Unidad 1
 * Practica 16
 *
 * */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Modelo;
import views.Vista;


public class Controlador implements ActionListener {
    //Colocaremos las propiedades para traer el modelo y la vista
    private Vista view;
    private Modelo model;
    //generamos el contructor recordando que tiene el mismo nombvre de la clase
    //se puede sacar desde insert code 

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnsuma.addActionListener(this);
        this.view.btnresta.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      model.setNumero1(Integer.parseInt(view.tf1.getText()));
      model.setNumero2(Integer.parseInt(view.tf2.getText()));
        if (e.getSource() == view.btnsuma) {
            model.sumar();
            view.jtres.setText(String.valueOf(model.getResultado()));
        }
        else if (e.getSource() == view.btnresta) {
         model.restar();
         view.jtres.setText(String.valueOf(model.getResultado()));
        }
    }
    
    
    
}

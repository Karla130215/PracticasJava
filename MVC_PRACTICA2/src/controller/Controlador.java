/** Datos de estas practicas:
 * Nombre:Karla Elizabeth Gonzalez Mondragon
 * Fecha:24/06/2022
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

//ponemos implements action listener para escuchar los botones de nuestra vista
public class Controlador implements ActionListener {

    //es el nombre de la clase y las palabra sreservadas model y view
    private Vista view;
    private Modelo model;
    //despues generaremos nuestra constructor

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnsuma.addActionListener(this);
        this.view.btnresta.addActionListener(this);
        this.view.btnmultiplicacion.addActionListener(this);
        this.view.btndivicion.addActionListener(this);
        this.view.btnreciduo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //daremos los datos que el usuario nos proporciona
        model.setNumero1(Integer.parseInt(view.JT1.getText()));
        model.setNumero2(Integer.parseInt(view.JT2.getText()));
        model.setNumero3(Integer.parseInt(view.JT3.getText()));
        model.setNumero4(Integer.parseInt(view.JT4.getText()));
      

        //se pone una condicional para que sepa que boton esta apretando y haga la operacion necesaria
        if (e.getSource() == view.btnsuma) {
            //mandamos a llamar el metodo que se hace en model 
            model.sumar();
            view.JTrespuesta.setText(String.valueOf(model.getResultado()));

        } else if (e.getSource() == view.btnresta) {
            model.restar();
            view.JTrespuesta.setText(String.valueOf(model.getResultado()));

        } else if (e.getSource() == view.btnmultiplicacion) {
            model.multiplicacion();
            view.JTrespuesta.setText(String.valueOf(model.getResultado()));

        } else if (e.getSource() == view.btndivicion) {
            model.divicion();
            view.JTrespuesta.setText(String.valueOf(model.getResultado()));

        } else if (e.getSource() == view.btnreciduo) {
            model.reciduo();
            view.JTrespuesta.setText(String.valueOf(model.getResultado()));

        }
    }

}
